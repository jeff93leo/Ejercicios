//Universidad del Valle de Guatemala
//Jefferson Silva (12605), Pablo samayoa(12635), Ixim Cojti (12697) , Carlos Cordero () 

//SplayTreeImp.java
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class SplayTreeImp implements WordSet{
    private SplayTree base;
        
        public SplayTreeImp()
        {
                base = new SplayTree();
        }
        
        public Word get(Word word)
        {
                Word temp = (Word)base.find(word);
                
                return temp;
        }
        
        public void add(Word wordObject)
        {
                base.insert(wordObject);
        }
    
}

