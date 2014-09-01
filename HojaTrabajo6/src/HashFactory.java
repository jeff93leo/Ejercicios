
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashFactory<K,V> {
    public Set gethash(String entry){
        if (entry.equals("HS"))
            return new HashSet(); //regresa Hashet
        if(entry.equals("TS"))
            return new TreeSet(); //regresa TreeSet
        else
            return new LinkedHashSet();
              
       
    }
    
}
