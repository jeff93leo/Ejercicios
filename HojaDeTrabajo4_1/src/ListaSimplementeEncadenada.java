/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Silva
 */
public class ListaSimplementeEncadenada<E> extends AbstractLista<E>{
    Nodo inicio;
    Nodo fin;
    Nodo nada; //en este caso se creo variable nada solo es para llenar requisitos de la calse nodo
                // ya que en esta clase nodo servida para simplemente encadenada y doblemente encadenada
    
    
    private static ListaSimplementeEncadenada unicaInstancia;
    
    public static ListaSimplementeEncadenada getInstancia(){
        if(unicaInstancia == null)
        
            unicaInstancia = new ListaSimplementeEncadenada();
            return unicaInstancia; 
           
        
    }
    
    private ListaSimplementeEncadenada(){
        inicio=null;
        fin=null;
    }

    
    public void addFirst(String dato) {
        
        Nodo nuevo = new Nodo(dato,null,inicio);
        inicio = nuevo;
        if(fin==null){
            fin = inicio;
        }
       
    }



    //obtiene el elemento eliminado 




    
}
