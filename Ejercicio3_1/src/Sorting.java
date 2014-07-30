/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Sorting.java
contiene todos los metos de para ordenar, con parametros tipo Comparable
-----------------------------------------------------------------------------*/



public class Sorting {
     //  sort algorithm.
   //-----------------------------------------------------------------

   //-----------------------------------------------------------------
   //  Sorts the specified array of objects using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
    
   public static void insertionSort (Comparable[] list) //parametro tipo comparable
   {
      for (int index = 1; index < list.length; index++) 
      {
          //variable tipo comparable , tiene el valor en una posicion 
         Comparable key = list[index];
         int position = index; //contiene la posicion de donde esta el valor 

         //  Shift larger values to the right
         //compara hacia la derecha hasta que llegue a la ultima posicion 
 
         while (position > 0 && key.compareTo(list[position-1]) < 0)
         {
            list[position] = list[position-1];
            position--;
         }
            
         list[position] = key;
      }
   }
   
   
   
/**
 * Sorts arrays using the bubble sort algorithm
 * 
 * @author David Nickles, Zach Tomaszewski
 * @version Mar 15, 2005 
 */

 public static void bubbleSort( Comparable[] theArray, int n ) { //parametro tipo comparable, y numero maximo de numeros 
    boolean sorted = false;  //turn to false if we make a swap
    while (!sorted) { // mientras sea diferente ni hace un swap
      sorted = true; 
      for (int i = 0; i < n - 1; i++) {//Recorre hacia la derecha, hasta llegar a la utlima posicion
        if (theArray[i].compareTo(theArray[i + 1]) > 0 ){ //COMPARA CON EL DE LA POSICION + 1 DEL LADO DERECHO
          Comparable temp = theArray[i + 1]; //SI SE CUMPLE LA CONDICION CAMBIAN DE LUGAR
          theArray[i + 1] = theArray[i];//AUMENTA POSICION +1
          theArray[i] = temp;
          sorted = false;
        }
      }
      n--; //go through 1 fewer elements each time, since end now sorted
    } 
  }  // end
    private int comp;
 
/// MERGE SORT PARA PARAMETRO LISTA TIPO COMPARABLE 
 
 public  int mergeSort( Comparable [ ] arr )
    {
        //CREA UN ARREGLO TEMPORAL DE TIPO COMPARABLE , CON EL MISMO TAMAÑO
        Comparable [ ] tmpArray = new Comparable[ arr.length ];
        //RETORNA EL ARREGLO TEMPORAL, ARREGLO, EL MINIMO ,Y EL TAMAÑO
        return mergeSort( arr, tmpArray, 0, arr.length - 1 );
    }

    /**
* Internal method that makes recursive calls.
* @param a an array of Comparable items.
* @param tmpArray an array to place the merged result.
* @param left the left-most index of the subarray.
* @param right the right-most index of the subarray.
*/
 //ANTERIORMENTE EN mergeSort , PARA OBENTER ESTOS PARAMETROS de este metodo ,se obtuvieron en el metodo anterior
    private int mergeSort( Comparable [ ] arr, Comparable [ ] tmpArray,
                            int left, int right )
    {
        //HAGARRA EL CENTRO DEL ARREGLO
        if( left < right )
        {
            int center = ( left + right ) / 2;
            mergeSort( arr, tmpArray, left, center );
           //VA PARTIENDO EN DOS Y EN DOS EL ARREGLO
            mergeSort( arr, tmpArray, center + 1, right );

            return merge( arr, tmpArray, left, center + 1, right );
        }

        return -1;
    }

    /**
* Internal method that merges two sorted halves of a subarray.
* @param a an array of Comparable items.
* @param tmpArray an array to place the merged result.
* @param leftPos the left-most index of the subarray.
* @param rightPos the index of the start of the second half.
* @param rightEnd the right-most index of the subarray.
*/
    
    //COMPARA LOS VALORES DE TODAS LAS POSICIONES
    private int merge( Comparable [ ] arr, Comparable [ ] tmpArray,
                        int leftPos, int rightPos, int rightEnd )
    {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        
        // main loop
        //COMPARA LOS LAS PRIMERAS POSICIONES O POVOTES DE CADA PAR DE ARREGLOS PIVOTES CON PIVOTES 
        while( leftPos <= leftEnd && rightPos <= rightEnd )
        {
            comp++;
            
            if( arr[ leftPos ].compareTo( arr[ rightPos ] ) <= 0 )
                tmpArray[ tmpPos++ ] = arr[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = arr[ rightPos++ ];
        }

        // Copy rest of the first half.
        while( leftPos <= leftEnd )
            tmpArray[ tmpPos++ ] = arr[ leftPos++ ];

        // Copy rest of the second half.
        while( rightPos <= rightEnd )
            tmpArray[ tmpPos++ ] = arr[ rightPos++ ];

        // Copy tmpArray.
        for( int i = 0; i < numElements; i++, rightEnd-- )
            arr[ rightEnd ] = tmpArray[ rightEnd ];

        return comp;

    }//merge //MergeSort

//Oksana on 27 Aug 2011
//www.github.com/Okyara/MergeSort
 

    
    //An interface used to compare two objects.
    

/**
 * sorting method
 * @author William McDaniel Albritton
 */
   /**quick sort
   * @param array is an array of Comparable objects 	
   */    
       public static void quickSort(Comparable[] array) {
      //overloading: two methods with same name, but different parameter type and/or count
      //calls quickSort method with 3 parameters 
         Sorting.quickSort(array, 0, array.length-1);
      }
   
   /**quick sort
   * @param array is an array of Comparable objects 	
   * @param start is the first element in the array  	
   * @param end is the last element in the array */    
       public static void quickSort(Comparable[] array, int start, int end) {
         if (start < end) {
         // split the table into two parts
            int pivot = Sorting.partition(array, start, end);
         // sort the two parts
            Sorting.quickSort(array, start, pivot - 1);
            Sorting.quickSort(array, pivot + 1, end);
         }
      }
   
       //Cnotiene la posicion inciial del arrelgo, la final , y tamaño del arreglo
       private static int partition(Comparable[] array, int start, int end) {

      // get pivot item (1st item)
         Comparable pivot = array[start];
      

      // index of end element in smaller part
         int split = start;
      //al final del arreglo desde el principio
         for (int i = start + 1; i <= end; i++) {
         //pone el elemento el mas pequeño
            if (pivot.compareTo(array[i]) > 0) {
            //increase size of smaller partd
               split = split + 1;
            //swap, so item is in smaller part
               Comparable temp = array[i];
               array[i] = array[split];
               array[split] = temp;

            }
         }
      // swap pivot with last element in smaller part
      // so pivot is between the two parts
         Comparable temp = array[start];
         array[start] = array[split];
         array[split] = temp;
    
         return split;
      }
    
    
    
    
    
    
}


