import java.util.Arrays;
import java.util.Scanner;

public class Homework {

public static void main(String[] args) {
    System.out.println(isSumBetween10And20(5, 10)); // true
    System.out.println(isSumBetween10And20(5, 15)); // true
    System.out.println(isSumBetween10And20(7, 15)); // false
    System.out.println(isSumBetween10And20(2, 6)); // false
    System.out.println();


    System.out.println(isPositive(5)); // true
    System.out.println(isPositive(0)); // false
    System.out.println(isPositive(-3)); // false
    System.out.println();


    printString("abcd", 5); // abcdabcdabcdabcdabcd
    System.out.println();


    Scanner sc = new Scanner(System.in);
    System.out.print("Введите год: ");
    int yr = sc.nextInt();
    sc.close();
    System.out.println(isLeapYear(yr));
    System.out.println();


    int[] arr = createArray(5, 10);
    System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
    System.out.println();


    int[] NullAndOneArray = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    System.out.println(Arrays.toString(NullAndOneArray));
    ChangeNullToOne(NullAndOneArray);
    System.out.println();


    int[] arrayarray = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    System.out.println(Arrays.toString(arrayarray));
    Six(arrayarray);
    System.out.println(Arrays.toString(arrayarray));
    System.out.println();


    int[][] twoarray = new int[5][5]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
    System.out.println(Arrays.deepToString(twoarray).replace("], ", "]\n"));
    FillArray(twoarray);
    System.out.println();
    System.out.println(Arrays.deepToString(twoarray).replace("], ", "]\n"));


}

/**
 * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
 * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
private static boolean isSumBetween10And20(int a, int b) {
    // проверить, что сумма a и b лежит между 10 и 20
    if (a + b >= 10 && a + b <= 20) {
        return true;
    }
    return false;
}

private static boolean isPositive(int x) {
    // проверить, что х положительное
    if (x > 0) {
        return true;
    }
    return false;
}

private static void printString(String source, int repeat) {
    // напечатать строку source repeat раз
    for (int i = 0; i < repeat; i++) {
        System.out.print(source);
    }
}

private static boolean isLeapYear(int year) {
    // проверить, является ли год високосным. если да - return true
    // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        return true;
    } 
    return false;
}

private static int[] createArray(int len, int initialValue) {
    // должен вернуть массив длины len, каждое значение которого равно initialValue
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++){
        arr[i] = initialValue;
    }
    return arr;
}

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 *
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 *
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 *
 * 4. Подготовить вопросы к следующему уроку.
 */

private static void ChangeNullToOne(int[] arr) {
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == 0) {
            arr[i] = 1;
        }
        else if (arr[i] == 1) {
            arr[i] = 0;
        }
    }
    System.out.println(Arrays.toString(arr));
}

public static void Six(int[] arr){
    for (int i = 0; i < arr.length; i++){
        if (arr[i] < 6){
            arr[i] *= 2;
        }
    }
}

public static void FillArray(int[][] arr){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if (i == j || i + j == arr.length - 1) {
                arr[i][j] = 1;
            }
        }
    }
}


}