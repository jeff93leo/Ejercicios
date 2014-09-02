/*-----------------------------------------------------------------------------
Universidad del Valle de Guatemala

Jefferson Silva carné:12605
Pablo Samayoa carné:12635

sección: 20
Main.java
Principal donde se manda a llamar el patron de diseño factory
-----------------------------------------------------------------------------*/
//IMPORTA LIBRERIAS
import java.util.Arrays;
import java.util.Set;
import javax.swing.JOptionPane;
import java.util.*;

    /**
     * 
     */
public class Main {
    private static int comp;
    private static String nombres;
   
    public static void main(String[] args) {
        boolean opcion = true;
        boolean opcion2 = true;
  //variables 
        String op2;
        String op3;
        String op4;
        String nombre; 
        String nombre2; 
        String nombre3; 
        String opc;
       //objeto de tipo hasfactory
        HashFactory<String> hFactory = new HashFactory<String>();
        String[] array = new String[1000];
        String nom;
        
            Scanner entrada = new Scanner(System.in);
            //op=JOptionPane.showInputDialog(" 1)HashSet(HS)\n 2)TreeSet(TS) \n 3)LinkedHashSet(LH) \n");
            System.out.println("1)HashSet(HS)\n 2)TreeSet(TS) \n 3)LinkedHashSet(LH) \n");
            nom = entrada.nextLine(); //conteinee la oopocion a elegir si hashset treeset o Linked Hashtet
                Set<String>desarrolladoresjava = new HashSet<String>();
                Set<String>desarrolladoresweb =  new HashSet<String>();
                Set<String>desarrolladorescelulares =  new HashSet<String>();
                
                //implementa patrones de diseño
                desarrolladoresjava = hFactory.gethash(nom);
                desarrolladoresweb = hFactory.gethash(nom);
                desarrolladorescelulares = hFactory.gethash(nom);
                
                do{    
                    //nombre = JOptionPane.showInputDialog("ingrese nombre de persona: \n");
                    System.out.println("ingrese nombre de persona: \n");
                    nombre = entrada.nextLine();
                    //op2=JOptionPane.showInputDialog(" a)desarrolladores Java\n b)desarrolladores Web\n c)desarrolladores celulares\n");
                    System.out.println("a)desarrolladores Java\n b)desarrolladores Web\n c)desarrolladores celulares\n");
                    op2 = entrada.nextLine();
                    //si escoge uan opcino
                    if(op2.equals("a")){
                        
                        desarrolladoresjava.add(nombre);
                        System.out.println(nombre);
                        
                    }
                    if(op2.equals("b")){
                        desarrolladoresweb.add(nombre);
                        System.out.println(nombre);
                        
                        
                    }
                    
                    if(op2.equals("c")){
                        desarrolladorescelulares.add(nombre);
                        System.out.println(nombre);
                        
                    }
                    //si es escoge 2 opciones
                    if(op2.equals("a,b")){
                       desarrolladoresjava.add(nombre);
                       System.out.println(nombre);
                       desarrolladoresweb.add(nombre);
                       System.out.println(nombre);
                        
                    }
                    if(op2.equals("a,c")){
                        desarrolladoresjava.add(nombre);
                        
                        desarrolladorescelulares.add(nombre);
                        System.out.println(nombre);
                        
                        
                        
                    }
                    if(op2.equals("b,c")){
                        desarrolladoresweb.add(nombre);
                        desarrolladorescelulares.add(nombre); 
                        System.out.println(nombre);
                    }//Escoge 3 opciones
                    if(op2.equals("a,b,c")){
                        desarrolladoresjava.add(nombre);
                        desarrolladoresweb.add(nombre);
                        desarrolladorescelulares.add(nombre); 
                        System.out.println(nombre);
                    }
                    
                   
                       
                        

        
         
                    
                    
                //opc=JOptionPane.showInputDialog(" agregara otro nombre");
                  System.out.println("agregara otro nombre:\n");
                  nombres = entrada.nextLine();
                
   
                }while(nombres.equals("si"));
                
                /*
                Comparamos tamaños
                */
                 
                        System.out.println("--- TAMAÑOS--- ")  ;                    
                        if(desarrolladoresjava.size()>= desarrolladoresweb.size() && desarrolladoresjava.size()>= desarrolladorescelulares.size() ){
                            System.out.println("-----Desarroladores java es mayor a web ---: " +desarrolladoresjava.size() );
                            
                            comp = 1;
                            Object[] arra = desarrolladoresjava.toArray();
                            
                            for (int j=0;j<desarrolladoresjava.size();j++){
                               arra[j]=nombre; 
                               System.out.println("metiendo: " + nombre);
                            }
                            Arrays.sort(arra);
                            
                            System.out.println("----nombres ordenados---");
                            for(int i=0; i<arra.length;i++){
                                System.out.println(arra[i]);
                            }      
                            
                            
                        
                        }
                        
                        if(desarrolladoresweb.size()>=desarrolladoresjava.size() && desarrolladoresweb.size()>=desarrolladorescelulares.size() ){
                            System.out.println("-----Desarrolladores web es mayor: -----" +desarrolladoresweb.size() );
                            
                            comp = 2;
                        }
                        
                        else{
                            System.out.println("web es menor");
                        }
                        
                        
                        if(desarrolladorescelulares.size()>=desarrolladoresjava.size() && desarrolladorescelulares.size()>= desarrolladoresweb.size()){
                            System.out.println("-----Desarrolladores celulaes es mayor: ----" + desarrolladorescelulares.size()); 
                           
                            comp = 3;
                        }
                        else{
                            System.out.println("celular es menor");
                        }
                        
                                  
                /*
                verificamos si pertenece a java, web o celular tipo de desarrollador
                */
                        
                        System.out.println("java,web,celu");
                        System.out.println("------Desarrolladores con experiencia en Java, web y celulares.");
                        if(comp==1){
                        for(String nombres : desarrolladoresjava){
                            if (desarrolladoresweb.contains(nombres) && desarrolladorescelulares.contains(nombres) ){
                                System.out.println("-----si hay java,web y celular----- :" +desarrolladoresjava.size());
                                for(String nombr : desarrolladoresjava){
                                    System.out.println(nombr);
                                    
                                }

                            }
                            else{
                                System.out.println("-----no hay java , web, celular----" );
                            }
                            
                            if(!desarrolladoresweb.contains(nombres)){
                                System.out.println("------si hay java, pero no web-----");
                            }
                        }
                        }
                        ////////////////////////////////////////////////////
                        if(comp==2){
                        for(String nombres : desarrolladoresweb){
                            if (desarrolladoresjava.contains(nombres) && desarrolladorescelulares.contains(nombres) ){
                                System.out.println("si hay java,web y celular :" + desarrolladoresjava.size());

                            }
                            else{
                                System.out.println("no hay java , web, celular");
                            }
                            
                           if (!desarrolladoresjava.contains(nombre)){
                               System.out.println("si hay desarrolladores web pero no java");
                           }
                        }
                        }
                        ////////////////////////////////////////////////////////
                        
                        if(comp==3){
                        for(String nombres : desarrolladorescelulares){
                            if (desarrolladoresjava.contains(nombres) && desarrolladoresweb.contains(nombres) ){
                                System.out.println("si hay java,web y celular  \n");

                            }
                            else{
                                System.out.println("no hay java , web, celular");
                            }
                            if(!desarrolladoresjava.contains(nombre)){
                                System.out.println("si hay Desarrolladores celulares pero no java : " + desarrolladorescelulares);
                                
                            }
                        }
                        }
                        
                    
                
               System.out.println("si el conjunto de desarolladores java, si es un subconjunto de desarroladores web");
            
            
               
        

        
        
        
        
        
        
    }
    
    
    
}
    
