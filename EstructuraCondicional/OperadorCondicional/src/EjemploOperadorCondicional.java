/*
  * programa que pide un número por teclado y calcula si es par o impar
  */
//importa el paquete util
import java.util.*;

public class EjemploOperadorCondicional
{
    //línea de arranque
    public static void main(String[] args) 
    {
        //Declara un objeto llamado sc de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Declara una variable de tipo int
        int num;
        //Llama al metodo println para que escriba en pantalla ese texto
        System.out.println("Introduzca numero: ");
        //Asigna el valor que devuelve el método nextInt a num
        num = sc.nextInt();
        /*Estructura condicional, donde "?" significa si y ":" else. 
        De forma que si num es divisible por 2 (el resultado de dividir entre 2 da 0), imprimirá "PAR", de lo contrario imprimirá "IMPAR".
        */
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
