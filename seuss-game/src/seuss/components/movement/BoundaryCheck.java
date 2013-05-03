package seuss.components.movement;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;


/**
 * Performs checks that the owner entity stays within its set boundaries
 * 
 * @author juho karenko
 */
public class BoundaryCheck extends Component {

    String id;
    
    /**
     * Constructor for BoundaryCheck component
     *
     * @param id id string of component
     */
    public BoundaryCheck(String id) {
        this.id = id;
    }
    
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        Vector2f position = owner.getPosition();
                
        if (position.y < 0) {
                position.y = 0;
            } else if (position.y > gc.getHeight()) {
                position.y = gc.getHeight();
            }
            if (position.x < 0) {
                position.x = 0;
            } else if (position.x > gc.getWidth() / 2) {
                position.x = gc.getWidth() / 2;
            }
 
    }
    

}
