/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Stackvector.java
test de stack vectpr
-----------------------------------------------------------------------------*/

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class StackVectorTest {
    
    public StackVectorTest() {
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

    /**
     * Test of push method, of class StackVector.
     */
    @Test
    public void testPush() {
    System.out.println("push");
        String item = "a";
        StackVector<String> instance = new StackVector<String>();
        instance.push(item);
        System.out.println("se ingreso " + item);
        int cantidad=1;
        assertEquals(instance.size(), cantidad);
    }

    /**
     * Test of pop method, of class StackVector.
     */
    @Test
    public void testPop() {
    System.out.println("pop");
        StackVector<String> instance = new StackVector<String>();
        int expResult = 0;
        String letra= "s";
        instance.push(letra);
      
         letra=instance.pop();
        System.out.println("salio" + letra);       
   
    }

    /**
     * Test of peek method, of class StackVector.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackVector<String> instance = new StackVector<String>();
        instance.push("ja");
        System.out.println("el strgin a sacar es " + instance.peek());
        String expResult = "ja";
        String result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class StackVector.
     */
    @Test
    public void testSize() {
         System.out.println("size");
        StackVector<String> instance = new StackVector<String>();
        int expResult = 1;
        instance.push("j");
        int result = instance.size();
        System.out.println(instance.size());
        assertEquals(expResult, result);
        // TODO rev
    }

    /**
     * Test of empty method, of class StackVector.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackArrayList<String> instance = new StackArrayList<String>();
        boolean expResult = false;
        instance.push("ja");
        
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
