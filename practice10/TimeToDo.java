package practice10;

import java.util.Scanner;

public class TimeToDo {
    public static void main(String[] args) {
        int number, x;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What task you need?");
        number = scanner.nextByte();

        switch (number){
            case 13:
                chetChlenPos();
                break;
            case 14:
                System.out.println("Enter number ");
                x = scanner.nextInt();
                fromLeftToRight(x);
                break;
            case 15:
                System.out.println("Enter number ");
                x = scanner.nextInt();
                fromRightToLeft(x);
                break;
            case 16:
                countMax();
                break;
            case 17:
                findMaximum();
                break;
            default:
                System.out.println("Hm... Something wrong...");
        }
    }
    // 13. Вывести члены последовательности с нечетными номерами
    public static void chetChlenPos(){
        int tmp, count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write numbers array");
        while (true){
            tmp = scanner.nextInt();

            if (tmp == 0) {
                break;
            }
            if (count % 2 == 0){
                System.out.print(tmp+" ");
            }

            count ++;
        }
    }
    // 14. Цифры числа слева направо
    public static void fromLeftToRight(int x){
        if (x >= 10){
            fromLeftToRight(x / 10);
        }
        System.out.print(x % 10 + " ");
    }
    // 15. Цифры числа справа налево
    public static void fromRightToLeft(int x){
        if (x > 0) {
            System.out.print(x % 10 + " ");
            fromRightToLeft(x / 10);
        }
    }
    // 16. Количество элементов, равных максимуму
    public static void countMax() {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int count = 0;

        System.out.println("Write numbers array");
        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > maxNumber) {
                maxNumber = num;
                count = 1;
            } else if (num == maxNumber) {
                count++;
            }
        }
        System.out.println(count);
    }
    // 17. Максимум последовательности
    public static void findMaximum() {
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        boolean firstNumber = true;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (firstNumber || num > maximum) {
                maximum = num;
                firstNumber = false;
            }
        }

        System.out.println(maximum);
    }
}
