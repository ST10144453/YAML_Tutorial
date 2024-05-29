package yaml_tutorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringClassTest 
{
    @Test
    public void testStringTest() 
    {
        System.out.println("StringTest");
        String text = "Test Me!";
        int length = 10;
        StringClass instance = new StringClass();
        boolean expResult = true;
        boolean result = instance.StringTest(text, length);
        assertEquals(expResult, result);
    }
    
}
