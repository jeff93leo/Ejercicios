/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
clase interfaz de lista
-----------------------------------------------------------------------------*/
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

    public void push(String valueOf);

    public String pop();
   
    
}
