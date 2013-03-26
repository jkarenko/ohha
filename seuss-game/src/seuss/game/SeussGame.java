package seuss.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import seuss.components.render.ImageRenderComponent;
import seuss.components.ParallaxBackgroundMovement;
import seuss.components.movement.PlayerMovement;
import seuss.entity.Entity;
import seuss.entity.EntityImpl;

/**
 *
 * @author juho karenko
 */
public class SeussGame extends BasicGame {

    Entity plane = null;
    Entity ground1 = null;
    Entity ground2 = null;
    Entity sky1 = null;
    Entity sky2 = null;
    Entity trees1 = null;
    Entity trees2 = null;
    Entity clouds1 = null;
    Entity clouds2 = null;

    public SeussGame(String title) {
        super(title);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new SeussGame("SEUSS"));
        app.setDisplayMode(1280, 1024, false);
        app.start();
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        float skyspeed = -0.1f;
        float treespeed = -0.6f;
        float groundspeed = -0.2f;
        float cloudspeed = -0.3f;

        sky1 = new EntityImpl("sky1");
        sky1.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/sky.png")));
        sky1.AddComponent(new ParallaxBackgroundMovement("SkyMovement", skyspeed));

        sky2 = new EntityImpl("sky2");
        sky2.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/sky.png")));
        sky2.AddComponent(new ParallaxBackgroundMovement("SkyMovement", skyspeed));
        sky2.setPosition(new Vector2f(gc.getWidth() - 1, 0));

        trees1 = new EntityImpl("trees1");
        trees1.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/trees_front.png")));
        trees1.AddComponent(new ParallaxBackgroundMovement("TreesMovement", treespeed));

        trees2 = new EntityImpl("trees2");
        trees2.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/trees_front.png")));
        trees2.AddComponent(new ParallaxBackgroundMovement("TreesMovement", treespeed));
        trees2.setPosition(new Vector2f(gc.getWidth() - 1, 0));

        clouds1 = new EntityImpl("clouds1");
        clouds1.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/clouds.png")));
        clouds1.AddComponent(new ParallaxBackgroundMovement("CloudsMovement", cloudspeed));

        clouds2 = new EntityImpl("clouds2");
        clouds2.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/clouds.png")));
        clouds2.AddComponent(new ParallaxBackgroundMovement("CloudsMovement", cloudspeed));
        clouds2.setPosition(new Vector2f(gc.getWidth() - 1, 0));

        ground1 = new EntityImpl("ground1");
        ground1.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/ground.png")));
        ground1.AddComponent(new ParallaxBackgroundMovement("GroundMovement", groundspeed));

        ground2 = new EntityImpl("ground2");
        ground2.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/ground.png")));
        ground2.AddComponent(new ParallaxBackgroundMovement("GroundMovement", groundspeed));
        ground2.setPosition(new Vector2f(gc.getWidth() - 1, 0));

        plane = new EntityImpl("plane");
        plane.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/airplane.png")));
        plane.AddComponent(new PlayerMovement("PlaneMovement"));
        plane.setPosition(new Vector2f(100, 400));
        plane.setRotation(90f);
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        ground1.update(gc, null, delta);
        ground2.update(gc, null, delta);
        trees1.update(gc, null, delta);
        trees2.update(gc, null, delta);
        sky1.update(gc, null, delta);
        sky2.update(gc, null, delta);
        clouds1.update(gc, null, delta);
        clouds2.update(gc, null, delta);

        plane.update(gc, null, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics gr) throws SlickException {
        sky1.render(gc, null, gr);
        sky2.render(gc, null, gr);
        ground1.render(gc, null, gr);
        ground2.render(gc, null, gr);
        plane.render(gc, null, gr);
        trees1.render(gc, null, gr);
        trees2.render(gc, null, gr);
        clouds1.render(gc, null, gr);
        clouds2.render(gc, null, gr);
    }
}
