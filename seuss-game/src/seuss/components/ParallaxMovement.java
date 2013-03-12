package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author juho karenko
 */
public class ParallaxMovement extends Component {

    float direction;
    float speed;

    public ParallaxMovement(String id, float speed) {
        this.id = id;
        this.speed = speed;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) {
        Vector2f position = owner.getPosition();

        position.x += speed * delta;

        if (position.x < gc.getWidth() * -1) {
            position.x = gc.getWidth();
        }

        owner.setPosition(position);
    }
}
