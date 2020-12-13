import java.util.Scanner;

/*
3. Написать программу, которая принимает число и
выводит все нечётные числа от 1 до этого числа включительно.
 */
public class HomeWork_2Lesson_Extra_Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {                  // Проверка числа на положительность
            for (int i = 1; i <= number; i++) {
                boolean isEven = i%2 == 0; // Проверка числа на четность
                if (!isEven){
                    System.out.println(i);
                }
            }
        }else {
            System.out.println("Вы ввели неподходящее число");
        }
    }
}
