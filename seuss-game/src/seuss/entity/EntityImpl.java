package seuss.entity;

/**
 *
 * @author juho karenko
 */
import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
//import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

import seuss.components.Component;
import seuss.components.render.RenderComponent;

public class EntityImpl implements Entity {

    private String id;
    private Vector2f position;
    private float scale;
    private float rotation;
    private RenderComponent renderComponent = null;
    private ArrayList<Component> components = null;

    public EntityImpl(String id) {
        this.id = id;

        components = new ArrayList<>();

        position = new Vector2f(0, 0);
        scale = 1;
        rotation = 0;
    }

    @Override
    public void AddComponent(Component component) {
        if (RenderComponent.class.isInstance(component)) {
            renderComponent = (RenderComponent) component;
        }

        component.setOwnerEntity(this);
        components.add(component);
    }

    @Override
    public Component getComponent(String id) {
        for (Component comp : components) {
            if (comp.getId().equalsIgnoreCase(id)) {
                return comp;
            }
        }

        return null;
    }

    @Override
    public Vector2f getPosition() {
        return position;
    }

    @Override
    public float getScale() {
        return scale;
    }

    @Override
    public float getRotation() {
        return rotation;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setPosition(Vector2f position) {
        this.position = position;
    }

    @Override
    public void setRotation(float rotate) {
        rotation = rotate;
    }

    @Override
    public void setScale(float scale) {
        this.scale = scale;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sb, int delta) {
        for (Component component : components) {
            component.update(gc, sb, delta);
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sb, Graphics gr) {
        if (renderComponent != null) {
            renderComponent.render(gc, sb, gr);
        }
    }
}