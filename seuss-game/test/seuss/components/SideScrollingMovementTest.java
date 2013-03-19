
package seuss.components;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lwjgl.input.Cursor;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.state.StateBasedGame;
import seuss.entity.Entity;

/**
 *
 * @author juho
 */
public class SideScrollingMovementTest {

    static Entity plane;

    public SideScrollingMovementTest() {
    }

    @BeforeClass
    public static void setUpClass() throws SlickException {

        BasicGame game;
        game = new BasicGame("test") {
            @Override
            public void init(GameContainer gc) throws SlickException {
                plane = new Entity("plane");
                plane.AddComponent(new ImageRenderComponent("PlaneRender", new Image("/data/airplane.png")));
                plane.AddComponent(new SideScrollingMovement("PlaneMovement"));
                plane.setPosition(new Vector2f(100, 400));
                plane.setRotation(90f);
            }

            @Override
            public void update(GameContainer gc, int delta) throws SlickException {
                plane.update(gc, null, delta);
            }

            @Override
            public void render(GameContainer gc, Graphics grphcs) throws SlickException {
            }
        };
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class SideScrollingMovement.
     */
    @Test
    public void testUpdate() {
        GameContainer gc;
        gc = new GameContainer(null) {
            @Override
            public int getScreenWidth() {
                return 640;
            }

            @Override
            public int getScreenHeight() {
                return 480;
            }

            @Override
            public void setIcon(String string) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setIcons(String[] strings) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setMouseCursor(String string, int i, int i1) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setMouseCursor(ImageData id, int i, int i1) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setMouseCursor(Image image, int i, int i1) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setMouseCursor(Cursor cursor, int i, int i1) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setDefaultMouseCursor() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void setMouseGrabbed(boolean bln) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isMouseGrabbed() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean hasFocus() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        StateBasedGame sbg = new StateBasedGame(null) {
            @Override
            public void initStatesList(GameContainer gc) throws SlickException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        int delta = 0;
        SideScrollingMovement component = new SideScrollingMovement("sideScrollingMovementTest");
        component.setOwnerEntity(new Entity("testEntity"));
        component.direction = 90.0f;
        component.speed = 5.0f;
        component.update(gc, sbg, delta);
        // TODO review the generated test code and remove the default call to fail.
        
    }

}