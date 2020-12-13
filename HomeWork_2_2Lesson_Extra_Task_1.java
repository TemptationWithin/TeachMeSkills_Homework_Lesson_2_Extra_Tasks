import java.util.Scanner;

/*
    Написать программу, которая будет выводить 'Yes',
    если значение обоих чисел число1 и число2 находятся
    в промежутке между 0 и 1, и 'No' в остальных случаях.
    Число1 и число 2 будут иметь тип данных double.
    Число 1 и число2 желательно вводить через консоль,
    но можно и явно задать в коде.
 */
public class HomeWork_2_2Lesson_Extra_Task_1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    boolean is_a_Between_0_and_1 = (a > 0 && a < 1); //Проверка диапазонов первой переменной
    boolean is_b_Between_0_and_1 = (b > 0 && b < 1); //Проверка диапазонов второй переменной
    if (is_a_Between_0_and_1 && is_b_Between_0_and_1){
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
    }
}
