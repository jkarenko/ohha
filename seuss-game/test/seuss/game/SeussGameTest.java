/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seuss.game;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 *
 * @author juho
 */
public class SeussGameTest {

    public SeussGameTest() {
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
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        SeussGame.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testInit() throws Exception {
        System.out.println("init");
        GameContainer gc = null;
        SeussGame instance = null;
        instance.init(gc);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        GameContainer gc = null;
        int delta = 0;
        SeussGame instance = null;
        instance.update(gc, delta);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRender() throws Exception {
        System.out.println("render");
        GameContainer gc = null;
        Graphics gr = null;
        SeussGame instance = null;
        instance.render(gc, gr);
        System.out.println("screen is drawn");

    }
}