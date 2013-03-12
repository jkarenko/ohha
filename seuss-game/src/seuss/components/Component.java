package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import seuss.entity.Entity;

/**
 *
 * @author juho karenko
 */
public abstract class Component {
    protected long id;
    protected Entity owner;
    
    public long getId() {
        return id;
    }
    
    public void setOwnerEntity(Entity owner) {
        this.owner = owner;
    }
    
    /**
     *
     * @param gc Slick2d game container
     * @param sbg Slick2d state based game
     * @param delta the time passed since last update, ensures uniform rate of movement etc
     */
    public abstract void update(GameContainer gc, StateBasedGame sbg, int delta);
}
