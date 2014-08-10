/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Nodo Simple.java
contiene los nodos de refencia de simplemente encadenada y doble
-----------------------------------------------------------------------------*/
public class NodoSimple {
    
        public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    private String dato;
    NodoSimple siguiente;

    public NodoSimple getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoSimple anterior) {
        this.anterior = anterior;
    }
    NodoSimple anterior;
    
    
    public NodoSimple(String i,NodoSimple s){
        dato = i;
        siguiente = s; 
     
    }
    
    
}
