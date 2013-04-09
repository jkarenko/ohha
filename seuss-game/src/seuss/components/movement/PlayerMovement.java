package seuss.components.movement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;

/**
 *
 * @author juho karenko
 */
public class PlayerMovement extends Component {

    float direction;
    float speed;

    public PlayerMovement(String id) {
        this.id = id;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        float rotation = owner.getRotation();
        float scale = owner.getScale();
        Vector2f position = owner.getPosition();
        
        Input input = gc.getInput();

        if (input.isKeyDown(Input.KEY_A)) {
            rotation += -0.2f * delta;
        }

        if (input.isKeyDown(Input.KEY_D)) {
            rotation += 0.2f * delta;
        }

        if (input.isKeyDown(Input.KEY_W)) {
            float hip = 0.4f * delta;

            position.x += hip * java.lang.Math.sin(java.lang.Math.toRadians(rotation));
            position.y -= hip * java.lang.Math.cos(java.lang.Math.toRadians(rotation));
        }
        
        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            gc.exit();
        }

        owner.setPosition(position);
        owner.setRotation(rotation);
        owner.setScale(scale);
    }
}