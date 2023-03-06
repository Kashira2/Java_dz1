//  Вывести все простые числа от 1 до 1000

public class dz2 {
    public static void main(String[] args) {
        System.out.println(2);
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++){
                if (i % j == 0) break;
                else if (i == j+1) System.out.println(i);

            }
        }
    }
}
