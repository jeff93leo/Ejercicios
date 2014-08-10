/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
LsitaCircular.java
lista doblemente encadenanda
-----------------------------------------------------------------------------*/
public class ListaDoblementeEncadenada<E> extends AbstractLista<E> {
    private Nodo inicio;
    private Nodo fin;
    //Comienza patron singleton
   private static ListaDoblementeEncadenada unicaInstancia;
    
    public static ListaDoblementeEncadenada getInstancia(){
        if(unicaInstancia == null)
        
            unicaInstancia = new ListaDoblementeEncadenada();
            return unicaInstancia; 
           
        
    }
    
    
    public ListaDoblementeEncadenada(){
        inicio = null;
        fin = null; 
    }



    //inserta al inicio
    public void addFirst(String dato) {
        if(inicio==null){
            inicio=new Nodo(dato,null,null);
            fin = inicio; 
        }
        else {
            Nodo nuevo = new Nodo(dato,null,inicio);
            inicio.setAnterior(nuevo); 
            inicio = nuevo; 
        }
    }

 
    public void MostrarListaDelante() {
        Nodo temporal = inicio; 
        while(temporal!=null){
            System.out.println(temporal.getDato());
            temporal = temporal.getSiguiente();
        }
    }
    
        public void MostrarListaAtras() {
        Nodo temporal = fin; 
        while(temporal!=null){
            System.out.println(temporal.getDato());
            temporal = temporal.getAnterior();
        }
    }
    
      
   
 

    
 
    
    
    
      public String GetLast() {
        String dato = fin.getDato();
        fin = fin.getAnterior(); 
        if(fin!=null){
            fin.setSiguiente(null);
        } else{
        inicio = null;
    }
        return dato;
    }

    @Override
    public void push(String dato) {
                if(inicio==null){
            inicio=new Nodo(dato,null,null);
            fin = inicio; 
        }
        else {
            Nodo nuevo = new Nodo(dato,null,inicio);
            inicio.setAnterior(nuevo); 
            inicio = nuevo; 
        }   
    }

    @Override
    public String pop() {
        
        
        
                
       String dato = fin.getDato();
        fin = fin.getAnterior(); 
        if(fin!=null){
            fin.setSiguiente(null);
        } else{
        inicio = null;
    }
        return dato;
    }



    
}
