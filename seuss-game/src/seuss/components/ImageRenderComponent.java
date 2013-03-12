package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author juho karenko
 */
public class ImageRenderComponent extends RenderComponent {

    Image image;

    public ImageRenderComponent(long id, Image image) {
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
