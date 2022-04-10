import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int[][] array = new int[4][3];
        int tmp[] = new int[12];
        int t = 0;

        System.out.println("Введите 12 чисел через пробел и нажмите \"Enter\":");
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++) {
                array[i][j] = scr.nextInt();
            }
        }
        System.out.println("Получен двумерный массив 4х3:");
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("1) Вывод номера строки и суммы ее элементов:");
        for (int i=0; i < array.length; i++){
            int sum = 0;
            for (int j=0; j < array[i].length;j++){
                sum = sum + array[i][j];
            }
            System.out.printf("\nСтрока № %d: %d", i+1,sum);
        }
        System.out.println();

        System.out.print("2) Вывод номера столбца и суммы его элементов:");
        for (int j=0; j < array[j].length; j++){
            int sumColumns = 0;
            for (int i=0; i < array.length; i++){
                sumColumns = sumColumns + array[i][j];
            }
            System.out.printf("\nСтолбец № %d: %d", j+1, sumColumns);
        }
        System.out.println();

        System.out.println("3) Замена всех четных чисел на 0, нечетных на 1:");
        for (int i=0; i < array.length; i++){
            int[][] array2 = new int[array.length][array[i].length];
            for (int j=0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0){
                    array2[i][j] = 0;
                }
                else {
                    array2[i][j] = 1;
                }
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("4) Для каждой строки находит целое среднее арифметическое:");
        for (int i=0; i < array.length; i++){
            int sum = 0;
            for (int j=0; j < array[i].length;j++) {
                sum = sum + array[i][j];
            }
            System.out.printf("\nСтрока № %d: %d", i+1, sum / array[i].length);
        }
        System.out.println();

        System.out.println("5) Перевод двумерного массива в перевернутый одномерный:");
        for (int i=0; i < array.length; i++){
            for (int j=0; j < array[i].length; j++) {
                tmp[t++] = array[i][j];
            }
        }
        for (int i=tmp.length; i > 0; i--) {
            System.out.print(tmp[i-1] + " ");
        }

    }
}
