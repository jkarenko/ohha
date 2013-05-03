package seuss.components.render;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Draws entity components on screen at their determined locations and defined scale.
 * 
 * @author juho karenko
 */
public class ImageRenderComponent extends RenderComponent {

    Image image;

    /**
     * Gives owner entity the ability to render itself on screen
     * 
     * @param id id string of component
     * @param image picture associated with this component
     */
    public ImageRenderComponent(String id, Image image) {
        super(id);
        this.image = image;
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics gr) {
        Vector2f pos = owner.getPosition();
        float scale = owner.getScale();

        image.draw(pos.x, pos.y, scale);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        image.rotate(owner.getRotation() - image.getRotation());
    }
}
