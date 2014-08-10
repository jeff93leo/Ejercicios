/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Main.java
Parte de menu , para hacer referencia a cada uno de StackVector y Lista Vecor
-----------------------------------------------------------------------------*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
 String op="  ";

 
BufferedReader entrada;//lectura de archivo 
String elemento; //el numero elido
String linea; //LIENA A LEER
Integer[] Lista = new  Integer[11];
String opcionLista="   ";
String dato;
String cadenaStack = null;
//llamada a factory vector
   StackFactory<String> sFactory = new StackFactory<String>();
   //llamada a factory lista 
ListaFactory<String> lFactory = new ListaFactory<String>();
LeerArchivo leer = new LeerArchivo() ;
 String archivo = "C:\\prueba.txt" ;

   do{//comienzo del ciclo
            op=JOptionPane.showInputDialog("1. ArrayList (ingrese AL) .\n 2. Vector(ingrese SV)\n 3. Lista (Ingrese L).\n d. Salir.");
            //se usa un cuadro de dialogo de tipo entrada el cual recibira la opcion
 //si se ingresa AL LLAMA A ARRAYLIST
            if(op.equals("AL")){//si se elige la opcion a se muestra el siguiente mensaje
             
                Stack<String> miStack1 = sFactory.getStack("AL");
                JOptionPane.showMessageDialog(null, "Utilizando ArrayList");
                leer.Leer(archivo, miStack1);
                
                
                
                
                
               //LLAMA A STACK VECTOR
            }
            else if(op.equals("SV")){//si se elige la opcion b se muestra el siguiente mensaje
                Stack<String> miStack2 = sFactory.getStack("SV");
                JOptionPane.showMessageDialog(null, "utilizando Stack Vectory");
                leer.Leer(archivo, miStack2);
                
            }
            //LLAMA A LISTA
            else if(op.equals("L")){//si se elige la opcion c se muestra el siguiente mensaje
                JOptionPane.showMessageDialog(null, "Entrando a Listas");
                
                do{
                    //LLAMA A SIMPLEMETE ENCADENADA
                  op=JOptionPane.showInputDialog("1. Lista simplemente encadenada(ingrese LSE).\n 2. Lista Doblemente Enadenada(ingrese LDE)\n 3. Lista Circular (Ingrese LC).\n d. Salir.");
                  if(op.equals("LSE")){//si se elige la opcion a se muestra el siguiente mensaje
                
                Lista<String> miLista = lFactory.getLista("LSE");
                JOptionPane.showMessageDialog(null, "utilizando Lista simplemente encadenada");
                 leer.LeerLista(archivo, miLista);
                
                
                }//DOBLEMETE ENCADENADA
            else if(op.equals("LDE")){//si se elige la opcion b se muestra el siguiente mensaje
                Lista<String> miLista1 = lFactory.getLista("LDE");
                 leer.LeerLista(archivo, miLista1);
                JOptionPane.showMessageDialog(null, "utilizando Lista Doblemente Enadenada");
            }
            //CIRCULAR LSITA
            else if(op.equals("LC")){//si se elige la opcion c se muestra el siguiente mensaje
                Lista<String> miLista2 = lFactory.getLista("LC");
                 leer.LeerLista(archivo, miLista2);
                JOptionPane.showMessageDialog(null, "Utilizando Lista circular");
            
            }
                
                
                
                
                
                
                }while(!op.equals("d"));
            }

            else{//si la opcion ingresada es diferente a las mostradas se muestra el siguiente mensaje
                JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
            }
        }while(!op.equals("d"));//finaliza el ciclo con la condicional que hay dentro del while
    }//final del método principal
}
    
