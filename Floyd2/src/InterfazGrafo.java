public interface InterfazGrafo<V,E> {

//AGREGA NODO AL GRAFO
    
    public void add(V label);
//CONEXION ENTRE NODOS
    
    public void addEdge(V vtx1, V vtx2, E label);
   
//MUESTRA EL GRAFO
    public void show();
   
//POSICION DE UN NODO
    public int getIndex(V label);
   
  //NOMBRE DEL NODO
    public V get(int label);
   
    //PESO DE LA CONEXION
    public int getEdge(V label1, V label2);
   
   //SI EL NODO ESTA EN EL GRAFO
    
    public boolean contains(V label);
   
//CANTIDAD DE NODOS DEL GRAFO
    public int size();
   
}

