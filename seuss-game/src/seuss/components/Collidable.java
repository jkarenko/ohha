package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;


/**
 *
 * @author juho karenko
 */
public class Collidable extends Component{
    private String id;
    
    public Collidable(String id) {
        this.id = id;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        // tsekkaa boundingboxien intersectaus
    }

}
