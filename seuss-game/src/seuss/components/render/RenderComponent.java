package seuss.components.render;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;
//import seuss.components.Component;

/**
 * Draws entity components on screen at their determined locations and defined scale.
 *
 * @author juho karenko
 */
public abstract class RenderComponent extends Component {
    public RenderComponent(String id)
    {
	this.id = id;
    }
 
    public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics gr);
}
