package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;
//import seuss.components.Component;

/**
 *
 * @author juho karenko
 */
public abstract class RenderComponent extends Component {
    public RenderComponent(long id)
    {
	this.id = id;
    }
 
    public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics gr);
}
