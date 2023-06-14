import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework {

    public static void main(String[] args) {

        /**
        * Пусть дан произвольный список целых чисел.

        * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
        * 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
        * 3) Найти максимальное значение
        * 4) Найти среднее значение

        *То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
        */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 5, 6, 7, 7, 8, 12, 18, 2, 3, 1, 21, 7, 8)) ;

        System.out.println(list);
        removeEven(list);
        System.out.println(list);
        System.out.println(findMin(list));
        System.out.println(findMax(list));
        System.out.println(findAverage(list));

    }

    private static void removeEven(ArrayList<Integer> list){
        for(Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private static Integer findMin(ArrayList<Integer> list){
        int min = list.get(0);
        for(int x: list) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    private static Integer findMax(ArrayList<Integer> list){
        int max = list.get(0);
        for(int x: list) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    private static Double findAverage(ArrayList<Integer> list){
        double sum = 0;
        for(int x: list) {
            sum += x;
        }
        return sum / list.size();
    }

}