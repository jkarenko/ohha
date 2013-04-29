package seuss.entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;


/**
 *
 * @author juho karenko
 */
public interface Entity {
    public void AddComponent(Component component);
    public Component getComponent(String id);
    public Vector2f getPosition();
    public float getScale();
    public float getRotation();
    public String getId();
    public void setPosition(Vector2f position);
    public void setRotation(float rotate);
    public void setScale(float scale);
    public void update(GameContainer gc, StateBasedGame sb, int delta);
    public void render(GameContainer gc, StateBasedGame sb, Graphics gr);
    public Shape getBoundingBox();
    public void setBoundingBox(Shape boundingBox);
}
