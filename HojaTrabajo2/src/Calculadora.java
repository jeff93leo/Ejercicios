/*-----------------------------------------------------------------------------
 Universidad del Valle de Guatemala
 Ixim Cojtí	carné: 12697
 Jefferson Silva carné:12
 Pablo Samayoa carné:12

 sección: 20
 Calculadora.java
 -----------------------------------------------------------------------------*/

import java.util.Scanner;
import java.io.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner Screen = new Scanner(System.in);
        StackVector<String> lista = new StackVector<String>();

        try {
            FileReader archivo = new FileReader("prueba.txt"); //Abrir el fichero indicado en la variable 
            int caracter1 = 0, caracter2 = 0, resultado = 0;
            do {
                caracter1 = archivo.read(); //Leer el primer carácter

                if (caracter1 == 49 || caracter1 == 50 || caracter1 == 51 || caracter1 == 52 || caracter1 == 53 || caracter1 == 54 || caracter1 == 55 || caracter1 == 56 || caracter1 == 57)//si caracter es un numero
                {
                    lista.push(String.valueOf((char) caracter1));//convierte caracter a char para luego pasarlo a String, se guarda en forma de string en el stack
                }
                if (caracter1 == 43)//suma
                {
                    caracter1 = Integer.parseInt(lista.pop());//retorna primer valor ingresado en el stack
                    caracter2 = Integer.parseInt(lista.pop());//retorn segundo valor ingresado en el stack
                    resultado = caracter1 + caracter2;//suma valores
                    System.out.print(caracter2 + "+" + caracter1 + "=" + resultado + "\n");//imprime el resultado de la operacion realizada
                    lista.push(String.valueOf(resultado));//ingresa el resultado en el stack
                }
                if (caracter1 == 45)//resta
                {
                    caracter1 = Integer.parseInt(lista.pop());
                    caracter2 = Integer.parseInt(lista.pop());
                    resultado = caracter2 - caracter1;//resta valores
                    System.out.print(caracter2 + "-" + caracter1 + "=" + resultado + "\n");
                    lista.push(String.valueOf(resultado));//ingresa el resultado en el stack
                }
                if (caracter1 == 42)//multiplicacion
                {
                    caracter1 = Integer.parseInt(lista.pop());
                    caracter2 = Integer.parseInt(lista.pop());
                    resultado = caracter1 * caracter2;//multiplica valores
                    System.out.print(caracter2 + "*" + caracter1 + "=" + resultado + "\n");
                    lista.push(String.valueOf(resultado));//ingresa el resultado en el stack
                }
                if (caracter1 == 47)//division
                {
                    caracter1 = Integer.parseInt(lista.pop());
                    caracter2 = Integer.parseInt(lista.pop());
                    resultado = caracter2 / caracter1;//divide valores
                    System.out.print(caracter2 + "/" + caracter1 + "=" + resultado + "\n");
                    lista.push(String.valueOf(resultado));//ingresa el resultado en el stack
                }
            } while (caracter1 != -1); //Se recorre el fichero hasta encontrar el carácter -1 que marca el final del fichero

            archivo.close(); //Cerrar el fichero
        } catch (Exception e) {
            System.out.println("Error de lectura del fichero");
        }
    }
}
