/**
 *
 * RectangleTest
 * @author Tarren-Marc Adams
 * student number 214041794
 *
 */


package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Rectangle rectangle4;
    private Rectangle rectangle5;

    @BeforeEach
    void setUp() {
        rectangle1 = new Rectangle();
        rectangle2 = new Rectangle();
        rectangle3 = rectangle1;
        rectangle4 = new Rectangle();
        rectangle5 = rectangle2;
    }
    @Test
    public void testEquality(){
        assertEquals(rectangle1,rectangle3);
        assertEquals(rectangle2,rectangle5);
    }

    @Test
    public  void  testIdentity(){
        assertNotSame(rectangle1,rectangle4);
        assertSame(rectangle2,rectangle5);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MICROSECONDS)
    public void testTimeOut(){
        System.out.println("Test timed out");
    }
}
