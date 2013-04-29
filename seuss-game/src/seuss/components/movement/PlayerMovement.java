package seuss.components.movement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;

/**
 * Reacts to keyboard presses and updates player position accordingly.
 *
 * @author juho karenko
 */
public class PlayerMovement extends Component {

    private float direction;
    private float speed;
    private Vector2f position;
    private float hip;
    private float rotation;
    float scale;
    private boolean looping;
    private float delta;
    private GameContainer gc;
    private boolean braking;
    
    public PlayerMovement(String id) {
        this.looping = false;
        this.id = id;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        rotation = owner.getRotation();
        scale = owner.getScale();
        position = owner.getPosition();
        this.delta = delta;
        this.gc = gc;
        braking = false;
        
        Input input = gc.getInput();

        if (input.isKeyDown(Input.KEY_A) && !looping) {
            rotation += -0.2f * delta;
        }

        if (input.isKeyDown(Input.KEY_D) && !looping) {
            rotation += 0.2f * delta;
        }
        
        if (!input.isKeyDown(Input.KEY_A) && !looping && rotation < 90) {
            rotation += 0.2f * delta;
        }
        
        if (!input.isKeyDown(Input.KEY_D) && !looping && rotation > 90) {
            rotation -= 0.2f * delta;
        }
        
        // makes airplane loop if nose pulled too high
        if (rotation < 0) {
            rotation -= 0.2f * delta;
            looping = true;
            move();
        }
        
        if (rotation > 120) {
            rotation = 120;
        }
        
        // recover horizontal after looping
        if (rotation < -270) {
            rotation = 90;
            looping = false;
        }

        if (input.isKeyDown(Input.KEY_W) && !looping) {
            move();
        }
        
        if (input.isKeyDown(Input.KEY_S) && !looping) {
            braking = true;
            move();
        }
        
        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            gc.exit();
        }
        
        if (rotation < 90 && !looping) {
            moveY();
        }
        
        if (rotation > 90) {
            moveY();
        }

        owner.setPosition(position);
        owner.setRotation(rotation);
        owner.setScale(scale);
    }
    
    private void move() {
        hip = 0.4f * delta;
        if (braking) {
            position.x -= hip * java.lang.Math.sin(java.lang.Math.toRadians(rotation));

        } else {
            position.x += hip * java.lang.Math.sin(java.lang.Math.toRadians(rotation));
        }
        position.y -= hip * java.lang.Math.cos(java.lang.Math.toRadians(rotation));
        braking = false;
    }
    
    private void moveY() {
        hip = 0.4f * delta;
        position.y -= hip * java.lang.Math.cos(java.lang.Math.toRadians(rotation));
    }
    
}
