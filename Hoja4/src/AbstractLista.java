/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Clase abstracta de lista
-----------------------------------------------------------------------------*/

import java.util.ArrayList;


abstract public class AbstractLista<E> implements Lista<E> {
    Nodo inicio; 
    Nodo fin; 
    protected ArrayList<E> data;
    
    
    
     public boolean isEmpty(){
         return size()==0;
     }
     
     //Doblemente encadenada
      public boolean contains(String dato){
          Nodo temporal = inicio;
        while(temporal !=null)
                {
                   if(temporal.getDato().equals(dato)){
                       return true; 
                   }
                   temporal = temporal.getSiguiente();
                }
        return false; 
      
        
    }
          public int size(){
        return size();
    }
     
          
        public void clear() {
                Nodo temporal = inicio; //contiene los datos del nodo temporalmente
        while(temporal !=null){
            temporal.setDato(""); 
            temporal = temporal.siguiente; 
            
        }
    }
        
        
        public void MostrarLista(){
        Nodo temporal = inicio; //contiene los datos del nodo temporalmente
        while(temporal !=null){
            System.out.println(temporal.getDato()); 
            temporal = temporal.siguiente; 
            
        }
        
    }
        
        
         public String GetFirst(){
        String dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if (inicio ==null){
            fin = null; 
        }
        return dato; 
    }
         
         
         public void addLast(String dato) {
         if(inicio==null){
            fin=new Nodo(dato,null,null);
            inicio = fin; 
        }
        else {
            Nodo nuevo = new Nodo(dato,fin,null);
            fin.setSiguiente(nuevo); 
            fin = nuevo; 
        }
         
        
    }
    
    
}
