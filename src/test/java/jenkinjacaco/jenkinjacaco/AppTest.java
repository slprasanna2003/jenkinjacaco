package jenkinjacaco.jenkinjacaco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {

        App p = new App();
        assertEquals("Hello Lakshmi", p.getMessage("Lakshmi"));

    }
    @Test
    public void testNameEmpty() {

        App c = new App();
        assertEquals("Please provide a name!", c.getMessage(" "));

    }
}
