package yaml_tutorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntClassTest 
{
    @Test
    public void testIntTest() {
        System.out.println("IntTest");
        int valueA = 2;
        int valueB = 3;
        IntClass instance = new IntClass();
        int expResult = 5;
        int result = instance.IntTest(valueA, valueB);
        assertEquals(expResult, result);
    }  
}
