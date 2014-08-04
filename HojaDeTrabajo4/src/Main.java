
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
 int opcion=0;

  do{
    System.out.println("Que implementacion desea utilizar");
    System.out.println("1. Stack");
    System.out.println("2. Listas");
    System.out.println("######## Ingrese opocion: ##########");
    //leer opcion
     opcion=in.nextInt();
    switch(opcion)
    {
        case 1:
            break;
        case 2:
            break;
    }
  }while(opcion!=2);
    
}
}
