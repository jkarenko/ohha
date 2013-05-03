package seuss.components.movement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;

/**
 * Owner entity is affected by air drag
 * 
 * @author juho karenko
 */
public class Drag extends Component {

    private float drag;
    private String id;
    private float negativeVelocity = 0f;
    
    /**
     * Constructor for Drag component
     *
     * @param id id string of component
     */
    public Drag(String id) {
        this.drag = 0.01f;
        this.id = id;
    }
    
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        Input input = gc.getInput();
        Vector2f position = owner.getPosition();
        //float rotation = owner.getRotation();
        
        if (!input.isKeyDown(Input.KEY_W)) {
            negativeVelocity -= drag;
            if (negativeVelocity < 0.2f) {
                negativeVelocity = 0.2f;
            }
            position.x -= negativeVelocity * delta;
        } else {
            negativeVelocity = 0;
        }
    }
    
}
