// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.ToLongBiFunction;

public class dz4 {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.printf("Введите уравнение, соблюдая пробелы по типу (23 + 23 = 46) или (2? + 2? = 46): \n");
            String str = reader.nextLine();
            reader.close();

            int count = 0;

            for (int i = 0; i < 10; i++) {
                char j = (char) (i + '0');
                String num1 = str.replace('?', j);

                String[] nums = num1.split(" ");

                int one = Integer.parseInt(nums[0]);
                int two = Integer.parseInt(nums[2]);
                int three = Integer.parseInt(nums[4]);
                char sign = nums[1].charAt(0);

                if (sign == '+') {
                    if (one + two == three) {
                        System.out.println("Возможные варианты уравнения: ");
                        System.out.println(num1);
                        count++;
                    }
                } else if (sign == '-') {
                    if (one - two == three) {
                        System.out.println("Возможные варианты уравнения: ");
                        System.out.println(num1);
                        count++;
                    }
                }
            }
            if (count < 1)
                System.out.println("Варианты не найдены");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
