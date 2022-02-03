






import java.util.Scanner;

public class Solution
{

    //Desarrolla un programa java que pida al usuario que introduzca un número entero que este entre 1 y 9.
    // Y dibuja por pantalla la tabla de multiplicar de dicho número.
    //
    //No es necesario que el programa comprueba si el número introducido está dentro del rango admitido.

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por favor, introduce un numero entre 1 y 9");

        int num = sc1.nextInt();

        for (int i=1;i<10;i++){

            System.out.println(num +  "x"  + i + "=" + num * i);

        }

    }

}