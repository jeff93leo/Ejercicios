/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala
Ixim Cojtí	carné: 12697
Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
patron factory para listas
-----------------------------------------------------------------------------*/
public class ListaFactory<E> {
    
    
    
       public Lista<E> getLista(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("LSE"))
      return new ListaSimplementeEncadenada<E>(); //regresa lsita simplemente encadenaa
        if(entry.equals("LDE"))
      return new ListaDoblementeEncadenada<E>(); //regresa lista dombre mente 
        else
        return new ListaCircular<E>(); //regresa lista ciruclar
     
        
   }
    
}
