package practice2;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        // Задача 1: Вывести на экран сумму чисел массива с помощью циклов for, while и do-while.
        int[] numbers = {1, 2, 3, 4, 5};
        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        // Используем цикл for
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }

        // Используем цикл while
        int i = 0;
        while (i < numbers.length) {
            sumWhile += numbers[i];
            i++;
        }

        // Используем цикл do-while
        i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < numbers.length);

        System.out.println("The amount (for): " + sumFor);
        System.out.println("The amount (while): " + sumWhile);
        System.out.println("The amount (do-while): " + sumDoWhile);

        // Задача 2: Вывести на экран аргументы командной строки в цикле for.
        System.out.println("Command Line Arguments:");
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Задача 3: Вывести на экран первые 10 чисел гармонического ряда.
        System.out.println("The first 10 numbers of the harmonic series:");
        for (i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.println(harmonicNumber);
        }

        // Задача 4: Сгенерировать массив целых чисел случайным образом, вывести его,
        // отсортировать его и снова вывести на экран.
        Random random = new Random();
        int[] array = new int[10];

        // Заполняем массив случайными числами
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генерировать случайные числа от 0 до 99
        }

        System.out.println("Source array: " + Arrays.toString(array));

        // Сортируем массив
        Arrays.sort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));

        // Задача 5: Создать метод, вычисляющий факториал числа с помощью цикла и проверить его работу.
        int n = 5; // Здесь задаем число, для которого нужно найти факториал
        long result = factorial(n);
        System.out.println(n + "! = " + result);
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
