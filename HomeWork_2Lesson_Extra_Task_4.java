import java.util.Scanner;

/*
4. Написать программу, которая выводит на консоль
 факториал введенного числа
 Факториал натурального числа n определяется как произведение всех натуральных чисел от 1 до n включительно: [Wiki]
 */
public class HomeWork_2Lesson_Extra_Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long result = 1;
        if (number < 0) {                       // проверка введенного числа на положительность
            System.out.println("Вы ввели отрицательное число");
        } else
            if (number == 0) {                  // проверка числа на 0 ( 0! = 1 );
                System.out.println(result);     // на этом этапе result все еще равен 1.
            } else {
                    for (long i = 1; i <= number; i++) {
                        result = result*i;
                    }
                    System.out.println(result);
                }
            }
    }
