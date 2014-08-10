/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karla Silva
 */
public interface Lista<E> {
    
     public boolean isEmpty();
   //post: regresa true si el stack esta vacio

   public int size();
   //post: regresa la cantidad de elementos
   //      en la lista 
   public void addFirst(String dato);
   
   public void clear();
   
      
  
   
   public boolean contains(String dato);
   
 
   public void MostrarLista();
   
   public String GetFirst();
  
   
   public void addLast(String dato);
   
    
}
