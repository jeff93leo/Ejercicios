/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Silva
 */
abstract public class AbstractLista<E> implements Lista<E> {
    Nodo inicio; 
    Nodo fin; 
    
    
    
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
