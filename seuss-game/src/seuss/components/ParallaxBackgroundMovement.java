package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Controls background image movement and resets the image to its starting
 * position after it has traveled all the way through the game window.
 * Two of these images placed properly will create a continuously scrolling
 * background.
 * 
 * @author juho karenko
 */
public class ParallaxBackgroundMovement extends Component {

    float direction;
    float speed;

    public ParallaxBackgroundMovement(String id, float speed) {
        this.id = id;
        this.speed = speed;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        Vector2f position = owner.getPosition();

        position.x += speed * delta;

        if (position.x < (gc.getWidth() - 1) * -1) {
            position.x = gc.getWidth() - 1;
        }

        owner.setPosition(position);
    }
}
