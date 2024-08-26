/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1;

/**
 *
 * @author colle
 */
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        String One = "Hello";
        String Two = "World";
        String Three = One + ' ' + Two;
        System.out.println(Three);

        Scanner calc = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int num1 = calc.nextInt();

        System.out.println("Enter the second integer:");
        int num2 = calc.nextInt();

        int result = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + result);
    }

}
