
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
 int opcion=0;
 int opcionStack=0;
 int opcionLista=0;
 int cantidad=0;
 int cantidad1=0;
 int cantidad2=0;
 File f = new File( "C:\\Users\\Karla Silva\\Desktop\\uvg\\Estructura de datos\\tarea2\\prueba.txt" ); //arhicvo que se leera
BufferedReader entrada;//lectura de archivo 
String elemento; //el numero elido
String linea; //LIENA A LEER
Integer[] Lista = new  Integer[11];
StackFactory<String> sFactory = new StackFactory<String>();
String dato;
String cadenaStack = null;

  do{
    System.out.println("Que implementacion desea utilizar");
    System.out.println("1. Stack");
    System.out.println("######## Ingrese opocion: ##########");
    //leer opcion
     opcion=in.nextInt();
    
    switch(opcion)
    {
        case 1:
            do{
                System.out.println("Que implementacion desea utilizar en el Stack");
                System.out.println("1. arrayList");
                System.out.println("2. Vector");
                System.out.println("3. Lista");
       
                System.out.println("######## Ingrese opocion: ##########");
                //leer opcion
                 opcionStack=in.nextInt();
                 
                 switch(opcionStack)
                 {
                     case 1:
                        try {
                        Stack<String> miStack = sFactory.getStack("AL");   
                        entrada = new BufferedReader( new FileReader( f ) );		
                        while(entrada.ready()){
                            linea = entrada.readLine();
                            //cuando encuentre un numero antes del espacio lo tomara 
                            StringTokenizer st = new StringTokenizer(linea, " ");
                            System.out.println("--------Metiendo datos----------");
                            while(st.hasMoreTokens()) {
                                cantidad2 ++;
                                //toma el numero despues del espacio 
                                
				elemento = st.nextToken();
                                miStack.push(elemento);
                                System.out.println(elemento);
                                //String cadena = miStack.pop();
                                //System.out.println(cadena);
                          }
                        }
                        System.out.println("el tamaÃ±o es " + miStack.size());
                        int cont=0;
                        while(miStack.empty()==false){
                            System.out.println(miStack.pop());
                           
                        }
                        
                        //System.out.println("------------Sacanado Datos ---------------");
                        //for(int i=0;i<=miStack.size()+1;i++){
                            //dato = miStack.pop();
                            //System.out.println(dato);
                            
                            
                        
                       
                        }catch (IOException e) {
                             e.printStackTrace();
                        }
                        
                        

                         break;
                     case 2:
                         break;
                     case 3:
                                     do{
                System.out.println("Que implementacion desea utilizar en la Lista");
                System.out.println("1. Simplemente Encadenada");
                System.out.println("2. Doblemente Encadenada");
                System.out.println("3. Circular");
       
                System.out.println("######## Ingrese opocion: ##########");
                //leer opcion
                 opcionLista=in.nextInt();
                 switch(opcionLista)
                 {
                     case 1:
                                        // Abrimos el archivo
                                                                 
                         
                         break;
                     case 2:
                         break;
                     case 3:
                         break;
                 }
            }while(opcionStack!=3);
                         break;
                 }
            }while(opcionStack!=3);


            
            break;
    }
  }while(opcion!=2);
    
}
}
