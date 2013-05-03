package seuss.components;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import seuss.entity.EntityImpl;

/**
 * The superclass for all components
 *
 * @author juho karenko
 */
public abstract class Component {
    protected String id;
    protected EntityImpl owner;
    
    public String getId() {
        return id;
    }
    
    public void setOwnerEntity(EntityImpl owner) {
        this.owner = owner;
    }
    
    /**
     * Updates the state of the entity
     * 
     * @param gc Slick2d game container
     * @param sbg Slick2d state based game
     * @param delta the time passed since last update, ensures uniform rate of movement etc
     */
    public abstract void update(GameContainer gc, StateBasedGame sbg, int delta);
}
