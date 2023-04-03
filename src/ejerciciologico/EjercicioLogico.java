/*Realizar un programa que permita el intercambio de valores entre dos variables.
 * Por ejemplo: Si una variable número vale 35, y una variable número2 vale 20, 
 * realizar las acciones necesarias para que el número pase a valer 20 y número2 
 * pase a valer 35. Una vez realizado el cambio mostrar el resultado por pantalla. 
 */
package ejerciciologico;

// @author Horacio

 //import java.util.Scanner;

public class EjercicioLogico {

    //Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
    
        int num1 = 35;
        int num2 = 20;
        int aux;
       
        System.out.println("----Antes----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        //20   //20
        aux = num2;
        //35     //35
        num2 = num1;
        //20      //20
        num1 = aux;
        
        System.out.println("----Despúes----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
    }

}
