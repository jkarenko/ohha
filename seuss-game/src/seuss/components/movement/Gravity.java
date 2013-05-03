package seuss.components.movement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;


/**
 * Owner entity is affected by gravitational pull of the planet
 *
 * @author juho karenko
 */
public class Gravity extends Component {
    private String id;
    
    /**
     * Constructor for Gravity component
     *
     * @param id id string of component
     */
    public Gravity(String id) {
        this.id = id;
    }
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        float gravity = 0.02f;
        Input input = gc.getInput();
        Vector2f position = owner.getPosition();
        
        if (!input.isKeyDown(Input.KEY_W)) {
            position.y += gravity * delta;
        }
    }

}
