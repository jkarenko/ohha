package seuss.components.render;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author juho
 */
public class RenderComponentTest {

    public RenderComponentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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

    @Test
    public void testRender() {
        GameContainer gc = null;
        StateBasedGame sbg = null;
        Graphics gr = null;
        RenderComponent instance = null;
        instance.render(gc, sbg, gr);
        fail("The test case is a prototype.");
    }

    public class RenderComponentImpl extends RenderComponent {

        public RenderComponentImpl() {
            super("");
        }

        @Override
        public void render(GameContainer gc, StateBasedGame sbg, Graphics gr) {
            try {
                final Image image = new Image("/data/airplane.png");
            } catch (SlickException ex) {
                Logger.getLogger(RenderComponentTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void update(GameContainer gc, StateBasedGame sbg, int delta) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}