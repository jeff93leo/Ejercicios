/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
SortingTest.java
Los test de cada uno de los metodos Sort 
-----------------------------------------------------------------------------*/


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {
    
    int max= 2000; //numero maxximo a implementas en la lista y tamaño de lista
    
    
    
    
    public SortingTest() {
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
     * Test of insertionSort method, of class Sorting.
     */
    @Test
    public void testInsertionSort() {
        System.out.println("insertionSort");
        //LLENA UN ARREGLO DE N TAMAÑO CON N DATOS
        //CREANDO UNA LISTA TIPO COMPARABLE
        Comparable[] list = new Comparable[max];
        Comparable[] correcto = new Comparable[max];
        System.out.println("---------------desordenado-----------------------");
         for (int i = 0; i < max; i++) {
             int numero =(int)(Math.random()*max + 1);
             list[i]=numero;
             System.out.println("numero: "+ numero);
         }
         //ORDENA LOS DATOS
         System.out.println("---------------ordenado-----------------------");
        Sorting.insertionSort(list);
        for (int j = 0; j < max; j++) { 
             list[j]=list[j];
             System.out.println("numero: "+ list[j]);

        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    }

    /**
     * Test of bubbleSort method, of class Sorting.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        Comparable[] theArray = new Comparable[max];
        int n = max;
                //LLENA UN ARREGLO DE N TAMAÑO CON N DATOS
        //CREANDO UNA LISTA TIPO COMPARABLE
        System.out.println("---------------desordenado-----------------------");
        for (int i = 0; i < max; i++) {
             int numero =(int)(Math.random()*max + 1);
             theArray[i]=numero;
             System.out.println("numero: "+ numero);
         }
        //ORDENA LOS DATOS
       Sorting.bubbleSort(theArray, n);
        for (int j = 0; j < max; j++) { 
             theArray[j]=theArray[j];
             System.out.println("numero: "+ theArray[j]);
        // TODO review the generated test code and remove the default call to fail.
        
    }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mergeSort method, of class Sorting.
     */
    @Test
    public void testMergeSort() {
        System.out.println("mergeSort");
        Comparable[] arr = new Comparable[max];
        Sorting instance = new Sorting();
        int expResult = max;
        int cont = 0;  
        int n=max;
                //LLENA UN ARREGLO DE N TAMAÑO CON N DATOS
        //CREANDO UNA LISTA TIPO COMPARABLE
        System.out.println("---------------desordenado-----------------------");
        for (int i = 0; i < max; i++) {
             int numero =(int)(Math.random()*max + 1);
             arr[i]=numero;
             System.out.println("numero: "+ numero);
         }
        //ORDENA LOS DATOS
        System.out.println("---------------ordenado-----------------------");
         instance.mergeSort(arr);
        for (int j = 0; j < max; j++) { 
             arr[j]=arr[j];
             cont++;
             System.out.println("numero: "+ arr[j]);
        // TODO review the generated test code and remove the default call to fail.
        
    }
       
       
        assertEquals(expResult, cont);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of quickSort method, of class Sorting.
     */
    @Test
    public void testQuickSort_ComparableArr() {
        System.out.println("quickSort");
        Comparable[] array = new Comparable[max];
        int cont2=0;
        Sorting instance = new Sorting();
         System.out.println("---------------desordenado-----------------------");
        for (int i = 0; i < max; i++) {
             int numero =(int)(Math.random()*max + 1);
             array[i]=numero;
             System.out.println("numero: "+ numero);
         }
        //ORDENA LOS DATOS
        System.out.println("---------------ordenado-----------------------");
         instance.quickSort(array);
        for (int j = 0; j < max; j++) { 
             array[j]=array[j];
             cont2++;
             System.out.println("numero: "+ array[j]);
        // TODO review the generated test code and remove the default call to fail.
 
    }

    }
}

    
