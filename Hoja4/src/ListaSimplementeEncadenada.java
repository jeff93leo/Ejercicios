/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
ListaSimplementeEncadenda.java

-----------------------------------------------------------------------------*/

public class ListaSimplementeEncadenada<E> extends AbstractLista<E>{
    NodoSimple inicio;
    NodoSimple fin;
    Nodo nada; //en este caso se creo variable nada solo es para llenar requisitos de la calse nodo
                // ya que en esta clase nodo servida para simplemente encadenada y doblemente encadenada
    
    //Comienza Patron Sinlgeton
    private static ListaSimplementeEncadenada unicaInstancia;
    
    public static ListaSimplementeEncadenada getInstancia(){
        if(unicaInstancia == null)
        
            unicaInstancia = new ListaSimplementeEncadenada();
            return unicaInstancia; 
           
        
    }
    //metodos de ordenamiento de lista 
    
    public ListaSimplementeEncadenada(){
        inicio=null;
        fin=null;
    }

    
    public void addFirst(String dato) {
        
        NodoSimple nuevo = new NodoSimple(dato,inicio);
        inicio = nuevo;
        if(fin==null){
            fin = inicio;
        }
       
    }



    //obtiene el elemento eliminado 

    @Override
    public void push(String dato) {
                
        NodoSimple nuevo = new NodoSimple(dato,inicio);
        inicio = nuevo;
        if(fin==null){
            fin = inicio;
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
