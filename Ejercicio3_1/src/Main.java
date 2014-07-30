/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635
Diego carné: 

sección: 20
Main.java
Programa principal, contiene el menu, manda a llamar los metodos Sort
creando un archivo de texto llenandolo con 2000 numeros , el archivo se lee 
despues y se ordenan con distintos metodos 
-----------------------------------------------------------------------------*/

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //una lista de tipo comparable        
Integer[] Lista = new  Integer[11];        
//Un texto cualquiera guardado en una variable
// el archivo a leer
File f = new File( "texto.txt" ); //arhicvo que se leera se creaa la direccion del archivo copiar ruta completa 
BufferedReader entrada;//lectura de archivo 
String elemento; //el numero elido
String linea; //LIENA A LEER
//cantidad de datos leidos para insertion Sort
int cantidad = 0;
//cantidad de datos leidos para bubble sort 
int cantidad2=0;
//cantida de datos leidos para Marge Sort
int cantidad3=0;
//cantida de datos leidos para QuickSort
int cantidad4=0;






try
{
//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor 
File archivo=new File("texto.txt"); //se crea donde esta el archivo Main.java 

//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
FileWriter escribir=new FileWriter(archivo,true);
int contador = 0;


while(contador<10){
	
	int numero =(int)(Math.random()*10 + 1);
	//System.out.println(numero);

	//Escribimos en el archivo con el metodo write 
	escribir.write(numero + " ");
	Lista[contador]=numero;
	contador++;

}
System.out.println("cadena anterior es la original");

//Cerramos la conexion
escribir.close();
}

	

//Si existe un problema al escribir cae aqui
catch(Exception e)
{
System.out.println("Error al escribir");
}

// Se crea menu de opcion para que el usuario escoga con que tipo de odenamiento quiere hacerlo

 Scanner in=new Scanner(System.in);
 int opcion=0;

  do{
    System.out.println("Elija una opcion");
    System.out.println("1. Ordenar arreglo con Insetion Sort");
    System.out.println("2. Ordenar arreglo con Bubble Sort");
    System.out.println("3. Ordenar arreglo con Merge Sort");
    System.out.println("4. Ordenar arreglo con Quick Sort");
    System.out.println("######## Ingrese opocion: ##########");
    //leer opcion
     opcion=in.nextInt();
    switch(opcion)
    {
        case 1:
          //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
         //En caso de que se escoga la opcion 1 insertion Sort
         //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   
                        // Abrimos el archivo
                        try {
                            
                        entrada = new BufferedReader( new FileReader( f ) );		
                        while(entrada.ready()){
                            //linea a leer 
                            linea = entrada.readLine();
                            //cuando encuentre un numero antes del espacio lo tomara 
                            StringTokenizer st = new StringTokenizer(linea, " ");
                            while(st.hasMoreTokens()) {
                                cantidad ++;
                                //toma el numero despues del espacio 
				elemento = st.nextToken();
                                // lo guarda en una lista cada numero leido
                                Lista[cantidad]= Integer.parseInt(elemento);
       
                        
                            }
                        }
                        System.out.println("-----------------Lista ordenada con Insertion Sort---------------------");
			System.out.println("cantidad de numeros: "+ cantidad );
                        //ORDENA EL ARREGLO CON INSERTION SORT
                        Sorting.insertionSort(Lista);
                        for (int i = 0; i < 10; i++) { 
                            Lista[i]=Lista[i];
                            //DESPLIEGA NUMEROS ORDENADOS 
                            System.out.println("numero: "+ Lista[i]);
                        }   
			}catch (IOException e) {
                             e.printStackTrace();
                        }   
                        
            
                            
                        //Ordenamiento de archivo
                        
                    
                       
                        break;
            
           //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
         //En caso de que se escoga la opcion 2 bubbleSort
         //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       
        case 2:
                                        // Abrimos el archivo
                        try {
                        entrada = new BufferedReader( new FileReader( f ) );		
                        while(entrada.ready()){
                            linea = entrada.readLine();
                            //cuando encuentre un numero antes del espacio lo tomara 
                            StringTokenizer st = new StringTokenizer(linea, " ");
                            while(st.hasMoreTokens()) {
                                cantidad2 ++;
                                //toma el numero despues del espacio 
				elemento = st.nextToken();
                                Lista[cantidad2]= Integer.parseInt(elemento);
       
                        
                            }
                        }
                        System.out.println("-----------------Lista ordenada con bubble Sort---------------------");
			System.out.println("cantidad de numeros: "+ cantidad2 );
                        //ORDENA LOS DATOS CON BUBBLE SORT
                        Sorting.bubbleSort(Lista,10);
                        for (int i = 0; i < 10; i++) { 
                            Lista[i]=Lista[i];
                            //DESPLIEGA NUMEROS ORDENADOS
                            System.out.println("numero: "+ Lista[i]);
                            
                        }   
			}catch (IOException e) {
                             e.printStackTrace();
                        }
            break;
         //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
         //En caso de que se escoga la opcion 3 MergerSort
         //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   
        case 3:
                                                            // Abrimos el archivo
                        try {
                        entrada = new BufferedReader( new FileReader( f ) );		
                        while(entrada.ready()){
                            linea = entrada.readLine();
                            //cuando encuentre un numero antes del espacio lo tomara 
                            StringTokenizer st = new StringTokenizer(linea, " ");
                            while(st.hasMoreTokens()) {
                                cantidad3 ++;
                                
				elemento = st.nextToken();
                                // lo guarda en una lista cada numero leido
                                Lista[cantidad3]= Integer.parseInt(elemento);
       
                        
                            }
                        }
                        System.out.println("-----------------Lista ordenada con MergeSort---------------------");
                        Sorting merg = new Sorting();
			System.out.println("cantidad de numeros: "+ cantidad3 );
                        //ORDENA CON EL METODO MERGE SORT 
                        merg.mergeSort(Lista);
                        for (int i = 0; i < 10; i++) { 
                            Lista[i]=Lista[i];
                            //IMPRIME NUMEROS ORDENADOS 
                            System.out.println("numero: "+ Lista[i]);
                        }   
			}catch (IOException e) {
                             e.printStackTrace();
                        }
            

            break;
          //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
         //En caso de que se escoga la opcion 4 Quick Sort
         //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      
        case 4:
            
                                                   // Abrimos el archivo
                        try {
                        entrada = new BufferedReader( new FileReader( f ) );		
                        while(entrada.ready()){
                            linea = entrada.readLine();
                            //cuando encuentre un numero antes del espacio lo tomara 
                            StringTokenizer st = new StringTokenizer(linea, " ");
                            while(st.hasMoreTokens()) {
                                cantidad4 ++;
                                
				elemento = st.nextToken();
                                // lo guarda en una lista cada numero leido
                                Lista[cantidad3]= Integer.parseInt(elemento);
       
                        
                            }
                        }
                        System.out.println("-----------------Lista ordenada con quickSort---------------------");
                        //Sorting.quickSort(Lista, 0, 2000);
                        Sorting.quickSort(Lista);
			System.out.println("cantidad de numeros: "+ cantidad4 );
                        //ORDENA CON EL METODO MERGE SORT 
                        
                        for (int i = 0; i < 10; i++) { 
                            Lista[i]=Lista[i];
                            //IMPRIME NUMEROS ORDENADOS 
                            System.out.println("numero: "+ Lista[i]);
                        }   
			}catch (IOException e) {
                             e.printStackTrace();
                        }
            
            
            
            break;
            
            
    } //SOLO OPCIONES DE 1 A 4 
  }while(opcion!=4);
         // TODO code application logic here
    }
    





}

