/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
HashFactory.java
Contiene el patron de diseño Factory en base a HashSet
-----------------------------------------------------------------------------*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashFactory<E> {
    public Set gethash(String entry){
        if (entry.equals("HS"))
            
            return new HashSet(); //regresa Hashet
        if(entry.equals("TS"))
            return new TreeSet(); //regresa TreeSet
        else
            return new LinkedHashSet(); //regresa TreSet
              
       
    }
    
}
