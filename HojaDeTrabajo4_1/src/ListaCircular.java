
import java.util.AbstractList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *MonitoresUCaldas
 * @author Karla Silva
 */
public class ListaCircular<E> extends AbstractLista<E> {
    Nodo inicio;
    int tamaño; 
    Nodo fin ; 
    
   private static ListaCircular unicaInstancia;
    
    public static ListaCircular getInstancia(){
        if(unicaInstancia == null)
        
            unicaInstancia = new ListaCircular();
            return unicaInstancia; 
           
        
    }
    
    
    
    private ListaCircular(){
        inicio = null;
        tamaño = 0; 
        
    }

    


    @Override
    public void addFirst(String dato) {
        if(inicio==null){
            inicio = new Nodo(dato,null,null);
            inicio.setSiguiente(inicio);
            tamaño++;
            
        }else {
            Nodo aux = inicio;
            while(aux.getSiguiente()!=inicio){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(new Nodo(dato,null,inicio));
            tamaño++; 
        }
    }






    


}
