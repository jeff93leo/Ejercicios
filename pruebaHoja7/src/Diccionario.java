
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Silva
 */
public class Diccionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        String linea = "";
       
        
        String str= "                      "; 
        int cont= 0;
        int letra_a_string;
        try
        {
        FileReader leerArchivo = new FileReader("C:\\Users\\Karla Silva\\Documents\\NetBeansProjects\\Ejercicios\\HojaTrabajo7\\src\\diccionario.txt");
        BufferedReader buffer = new BufferedReader(leerArchivo);
        while ((linea = buffer.readLine()) != null)
        {
            cont = cont + 1;
            array.add(linea);
            if (cont==1){
            BinaryTree<String> House = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + House.value());
            House.setParent(House);
            }
            
            if (cont==2){
            BinaryTree<String> Dog = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Dog.value());
            
            
            }
            if (cont==3){
            BinaryTree<String> Homework = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Homework.value());
            
            }
            
            if (cont==4){
            BinaryTree<String> Town = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Town.value());
            
            }
            
            if (cont==5){
            BinaryTree<String> Yes = new BinaryTree<String>(linea);
            System.out.println("Agregando : " + Yes.value());
            
            }

           
            
            
        }
        buffer.close();
       
}
        catch (Exception ex)
        { }
       
    }
    
}
