
import javax.swing.JOptionPane;

    /**
     * 
     */
public class Main {
    


    public static void main(String[] args) {
        String op;
        String op2;
        String nombre; 
        String nombre2; 
        String nombre3; 
    
        do{//comienzo del ciclo
            op=JOptionPane.showInputDialog(" 1)HashSet(HS)\n 2)TreeSet(TS) \n 3)LinkedHashSet(LH) \n");
            if(op.equals("HS")){
                
                nombre = JOptionPane.showInputDialog("ingrese nombre de persona: \n");
                
                do{
                    op2=JOptionPane.showInputDialog(" a)desarrolladores Java\n b)desarrolladores Web\n c)desarrolladores celulares\n");
                    
                    
                }while(!op2.equals("d"));
            }
            if(op.equals("TS")){
                
                nombre2 = JOptionPane.showInputDialog("ingrese nombre de persona: \n");
                do{
                    op2=JOptionPane.showInputDialog(" a)desarrolladores Java\n b)desarrolladores Web\n c)desarrolladores celulares\n");
                    
                    
                }while(!op2.equals("d"));
                
            }
            
             if(op.equals("LH")){ 
                 nombre3 = JOptionPane.showInputDialog("ingrese nombre de persona: \n");
                 do{
                    op2=JOptionPane.showInputDialog(" a)desarrolladores Java\n b)desarrolladores Web\n c)desarrolladores celulares\n");
                    
                    
                }while(!op2.equals("d"));
                 
                
            }
            
        }
    
        while(!op.equals("d"));
    
    }
}
