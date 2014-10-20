 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */

import java.util.*; //importamos el paquete util

public class EjemploIfDoble1
{
    //Linea de arranque que permite que se ejecute el código
    public static void main(String[] args) 
    {
        //Declara un objeto llamado sc de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Declara una variable num de tipo int
        int num;      
        //Llama al metodo print para que imprima por pantalla el texto "Introduzca: "
        System.out.println("Introduzca numero: ");
        //Asigna el valor que devuelve el método nextInt de la clase Scanner a num
        num = sc.nextInt();

        /*
        * If, estructura condicional, la cual está diciendo que si cumple la condicion de que el numero es divisible (operador aritmetico %) por 2 se ejecutarán las instrucciones entre llaves.
        */
        if ((num%2)==0)
           //Si cumple la condición se imprimirá por pantalla "PAR". Si hay sólo una intrucción se pueden quitar las llaves
           System.out.println("PAR");
        //Si no la cumple se imprimirá "IMPAR". Como hay sólo una intrucción se quitan las llaves
        else
            System.out.println("IMPAR");
    }
}
