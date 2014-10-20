
/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*; //importa el paquete util y todo lo que hay dentro debido al "*"

public class EjemploSwitch1 
{
    //Línea de arranque del programa
    public static void main(String[] args) 
    {
        //Declara la variable de tipo int
        int mes;
        //Declara el objeto sc del tipo de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //Llama al método print
        System.out.print("Introduzca un numero de mes: ");
        //Asigna el valor que recoge el método nextInt a mes
        mes = sc.nextInt();
        //Estructura condicional que evalúa los resultados posibles que toma la variable mes y en función de ese resultado ejecutará unas instrucciones u otras marcadas entre llaves
        switch (mes)
        {
                //Caso en el que el mes tome valor 1, ejecuta la instruccion (imprime en pantalla nombre del mes)
                case 1: System.out.println("ENERO");
                          //sale del switch
                           break;
                //Caso en el que el mes tome valor 2, ejecuta e imprime por pantalla "Febrero"
                case 2: System.out.println("FEBRERO");
                           break;
                case 3: System.out.println("MARZO");
                           break;
                case 4: System.out.println("ABRIL");
                           break;
                case 5: System.out.println("MAYO");
                           break;
                case 6: System.out.println("JUNIO");
                           break;
                case 7: System.out.println("JULIO");
                           break;
                case 8: System.out.println("AGOSTO");
                           break;
                case 9: System.out.println("SEPTIEMBRE");
                           break;
                case 10: System.out.println("OCTUBRE");
                             break;
                case 11: System.out.println("NOVIEMBRE");
                             break;
                case 12: System.out.println("DICIEMBRE");
                             break;
                //Si el valor de mes no es ninguno de los anteriores imprimirá "Mes no válido"
                default : System.out.println("Mes no válido");                       
        }
    }
}

