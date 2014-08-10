/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
LsitaCircular.java
test lista circular
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
public class ListaCircularTest {
    
    public ListaCircularTest() {
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
     * Test of getInstancia method, of class ListaCircular.
     */


    /**
     * Test of addFirst method, of class ListaCircular.
     */
    @Test
    public void testAddFirst() {
        System.out.println("addFirst");
        String dato = "a";
        ListaCircular<String> instance = new ListaCircular<String>();
        instance.addFirst(dato);
        System.out.println("se agrego dato");
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of push method, of class ListaCircular.
     */

}
