// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class dz3 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double num1 = reader.nextDouble();
        
        System.out.println("Введите знак (+ - / *): ");
        char sign = reader.next().charAt(0);

        System.out.printf("Введите второе число: ");
        double num2 = reader.nextDouble();

        reader.close();

        double res = 0;
        
        if (sign == '+') res = num1 + num2;
        else if (sign == '-') res = num1 - num2;
        else if (sign == '*') res = num1 * num2;
        else if (sign == '/') res = num1 / num2;

        System.out.println(res);
    }
}
