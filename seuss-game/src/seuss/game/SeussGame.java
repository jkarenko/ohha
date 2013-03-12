package seuss.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import seuss.components.ImageRenderComponent;
import seuss.components.SideScrollingMovement;
import seuss.entity.Entity;

/**
 *
 * @author juho karenko
 */
public class SeussGame extends BasicGame {
    Entity plane = null;
    Entity ground = null;
    Entity sky = null;
    Entity trees = null;
    Entity clouds = null;
    
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
        sky = new Entity("sky");
        sky.AddComponent( new ImageRenderComponent("PlaneRender", new Image("/data/sky.png")));
        
        trees = new Entity("trees");
        trees.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/trees_front.png")));
        
        clouds = new Entity("clouds");
        clouds.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/clouds.png")));
        
        ground = new Entity("land");
        ground.AddComponent( new ImageRenderComponent("PlaneRender", new Image("/data/ground.png")) );
 
        plane = new Entity("plane");
        plane.AddComponent( new ImageRenderComponent("PlaneRender", new Image("/data/plane.png")) );
        plane.AddComponent( new SideScrollingMovement("PlaneMovement") );
        plane.setPosition(new Vector2f(400, 300));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        ground.update(gc, null, delta);
    	plane.update(gc, null, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics gr) throws SlickException {
        sky.render(gc, null, gr);
        ground.render(gc, null, gr);
    	plane.render(gc, null, gr);
        trees.render(gc, null, gr);
        clouds.render(gc, null, gr);
    }
}
