/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Nodo.java
Nodos de ListaDoblemente encadenada
-----------------------------------------------------------------------------*/
public class Nodo {

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    private String dato;
    Nodo siguiente;

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    Nodo anterior;
    
    
    public Nodo(String i,Nodo a,Nodo s){
        dato = i;
        siguiente = s; 
        anterior = a; 
    }
    
    
    
    
    
    
}

