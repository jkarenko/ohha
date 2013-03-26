/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seuss.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;
import seuss.components.Component;

/**
 *
 * @author juho
 */
public class EntityImplTest {
    
    public EntityImplTest() {
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
    public void testAddComponent() {
        System.out.println("AddComponent");
        Component component = null;
        EntityImpl instance = null;
        instance.AddComponent(component);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetComponent() {
        System.out.println("getComponent");
        String id = "";
        EntityImpl instance = null;
        Component expResult = null;
        Component result = instance.getComponent(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetPosition() {
        System.out.println("getPosition");
        EntityImpl instance = null;
        Vector2f expResult = null;
        Vector2f result = instance.getPosition();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetScale() {
        System.out.println("getScale");
        EntityImpl instance = null;
        float expResult = 0.0F;
        float result = instance.getScale();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetRotation() {
        System.out.println("getRotation");
        EntityImpl instance = null;
        float expResult = 0.0F;
        float result = instance.getRotation();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetId() {
        System.out.println("getId");
        EntityImpl instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetPosition() {
        System.out.println("setPosition");
        Vector2f position = null;
        EntityImpl instance = null;
        instance.setPosition(position);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRotation() {
        System.out.println("setRotation");
        float rotate = 0.0F;
        EntityImpl instance = null;
        instance.setRotation(rotate);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetScale() {
        System.out.println("setScale");
        float scale = 0.0F;
        EntityImpl instance = null;
        instance.setScale(scale);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        GameContainer gc = null;
        StateBasedGame sb = null;
        int delta = 0;
        EntityImpl instance = null;
        instance.update(gc, sb, delta);
        fail("The test case is a prototype.");
    }

    @Test
    public void testRender() {
        System.out.println("render");
        GameContainer gc = null;
        StateBasedGame sb = null;
        Graphics gr = null;
        EntityImpl instance = null;
        instance.render(gc, sb, gr);
        fail("The test case is a prototype.");
    }
}