/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
SatackTest.java
test de stack
-----------------------------------------------------------------------------*/
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karla Silva
 */
public class StackArrayListIT {
    
    public StackArrayListIT() {
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
     * Test of push method, of class StackArrayList.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String item = "a";
        StackArrayList<String> instance = new StackArrayList<String>();
        instance.push(item);
        System.out.println("se ingreso " + item);
        int cantidad=1;
        assertEquals(instance.size(), cantidad);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of pop method, of class StackArrayList.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackArrayList<String> instance = new StackArrayList<String>();
        int expResult = 0;
        String letra= "s";
        instance.push(letra);
      
         letra=instance.pop();
        System.out.println("salio" + letra);       
   
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of peek method, of class StackArrayList.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackArrayList<String> instance = new StackArrayList<String>();
        instance.push("ja");
        System.out.println("el strgin a sacar es " + instance.peek());
        String expResult = "ja";
        String result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class StackArrayList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackArrayList<String> instance = new StackArrayList<String>();
        int expResult = 1;
        instance.push("j");
        int result = instance.size();
        System.out.println(instance.size());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of empty method, of class StackArrayList.
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
