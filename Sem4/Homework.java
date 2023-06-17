
import java.io.FileNotFoundException;
import java.util.*;

public class Homework {

    /**
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была
     * первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     * 4. Если введено exit, то программа завершается
     * 
     * > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     * > java
     * > python
     * > c#
     * > print
     * < [c#, python, java]
     * > revert
     * > print
     * < [python, java]
     * > revert
     * > revert
     * > print
     * < []
     * > revert -> throw new NoSuchElementException
     */

    @SuppressWarnings("resourse")
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<String> storage = new LinkedList<>();

        while (true) {
            String command = scanner.nextLine();
            
            if ("exit".equals(command)) {
                System.exit(0);
            }

            if ("print".equals(command)) {
                System.out.println("Storage = " + storage);
            } else if ("revert".equals(command)) {
                if (storage.size() == 0) {
                    throw new NoSuchElementException();
                } else {
                    storage.remove(0);
                }
            } else {
                storage.add(0, command);
            }
        }
    }
}