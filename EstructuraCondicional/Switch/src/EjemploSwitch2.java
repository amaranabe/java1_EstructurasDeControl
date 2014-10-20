/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*; //importa el paquete io y todo lo que hay dentro debido al "*"

public class EjemploSwitch2 
{
    //Línea de arranque del programa
    public static void main(String[] args) throws IOException
    {
        //Declara 3 variables, y en Resultado le asigna valor 0
        int A,B, Resultado = 0 ;
        //Declara una variable de tipo char y otra de tipo boleano
        char operador;
        boolean calculado = true;
        //Declara un objeto del tipo de la clase Scanner
        Scanner sc = new Scanner(System.in);

        //Llama al método print para que imprima por pantalla "Introduzca..."
        System.out.print("Introduzca un numero entero:");
        //Asigna el valor que devuelve el método nextInt (el cual recoge el valor que ha entrado por teclado) a A
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
        //Asigna el valor que devuelve el metodo read de la clase InputStream (convertido a char), a la variable operador
        //Este método lanza un IOException (ver class InputStream)
		operador = (char)System.in.read();
        //Evalua la expresion entre parentesis, en este caso el valor de la variable operador, y ejecuta el bloque de instrucciones
        switch (operador) 
        {
                //Si el valor de la variable operador es igual al caracter "-" entra, y asigna el resultado de A - B a la variable Resultado y ejecuta la siguiente instrucción
                case '-' : Resultado = A - B;
                           //instrucción que hace salir del switch
                           break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;
                //Si el valor de la variable operador es "/" ejecuta el if. Si B es distinto de 0, entra y asigna el valor de la divión a la variable Resultado y ejecuta la instrucción break
                case '/' : if(B!=0)
                              Resultado = A / B;
                           //Si B=0 entonces ejecuta el bloque de instrucciones de else
                           else
                           {
                              System.out.println("\nNo se puede dividir por cero");
                              //Asigna valor false a la variable calculado, sale y ejecuta la instrucción break
                              calculado = false;
                           }
                           break;
                //Si el valor de operador no es ninguno de los caracteres anteriores, imprime texto y asigna valor false a la variable calculado.
                //Sale del switch al ser la ultima instruccion
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
        //Evalúa la condición entre paréntesis, y si calculado es igual a true, entra y ejecuta la siguiente instrucción
        if(calculado)
        {
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
