// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class dz1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int triangular = 0; 
        for (int i = 0; i <= n; i++) {
            triangular = triangular + i;
        }

        int prod = 1;
        for (int i = 1; i < n; i++) {
            prod = prod * (i+1);
        }

        System.out.printf("Треугольное число от %d, равно %d", n, triangular);
        System.out.printf("\nn! от %d, равно %d", n, prod);
    }   
    
}