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
    Entity land = null;
    
    public SeussGame(String title) {
        super(title);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SlickException {
        AppGameContainer app = new AppGameContainer(new SeussGame("SEUSS"));
        app.setDisplayMode(800, 600, false);
        app.start();
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        land = new Entity("land");
 
        land.AddComponent( new ImageRenderComponent("PlaneRender", new Image("/data/land.jpg")) );
 
        plane = new Entity("plane");
        plane.AddComponent( new ImageRenderComponent("PlaneRender", new Image("/data/plane.png")) );
        plane.AddComponent( new SideScrollingMovement("PlaneMovement") );
        plane.setPosition(new Vector2f(400, 300));
    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        land.update(gc, null, delta);
    	plane.update(gc, null, delta);
    }

    @Override
    public void render(GameContainer gc, Graphics gr) throws SlickException {
        land.render(gc, null, gr);
    	plane.render(gc, null, gr);
    }
}
