

import java.util.*;

public class Homework {

    /**
     * Реализовать консольное приложение - телефонный справочник.
     * У одной фамилии может быть несколько номеров.
     * Пользователь может вводить команды:
     * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый
     * аргумент - фамилия, второй - номер телефона
     * 2. GET Ivanov - получить список всех номеров по фамилии
     * 3. REMOVE Ivanov - удалить все номера по фамилии
     * 4. LIST - Посмотреть все записи
     * 5. EXIT - Завершить программу
     * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
     * 
     * 
     * Пример взаимодействия (=> - это вывод на консоль):
     * ADD Ivanov 8 800 555 35 35
     * ADD Ivanov 8 800 100 10 10
     * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
     * ADD Petrov 8 555 12 34
     * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
     * REMOVE Ivanov
     * LIST => Petrov = [8 555 12 34]
     * GET NoName => Не найдена запись с фамилией "NoName"
     * REMOVE NoName => Не найдена запись с фамилией "NoName"
     */

    @SuppressWarnings("resourse")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<String>> phonebook = new HashMap<>();

        while (true) {
            String enter = scanner.nextLine();
            String[] wordsArray = enter.split("\\s++");
            String command = wordsArray[0].toUpperCase();

            if ("EXIT".equals(command)) {
                System.exit(0);
            }

            if ("ADD".equals(command)) {
                if (!phonebook.containsKey(wordsArray[1])) {
                    phonebook.put(wordsArray[1], new ArrayList<>(Arrays.asList(wordsArray[2])));
                } else {
                    ArrayList<String> phone = phonebook.get(wordsArray[1]);
                    phone.add(wordsArray[2]);
                    phonebook.put(wordsArray[1], phone);
                }

            } else if ("GET".equals(command)) {
                if (!phonebook.containsKey(wordsArray[1])) {
                    System.out.println("Не найдена запись с фамилией " + wordsArray[1]);
                } else {
                    System.out.println(phonebook.get(wordsArray[1]));
                }
            }

            else if ("REMOVE".equals(command)) {
                if (!phonebook.containsKey(wordsArray[1])) {
                    System.out.println("Не найдена запись с фамилией " + wordsArray[1]);
                } else {
                    phonebook.remove(wordsArray[1]);
                }
            }

            else if ("LIST".equals(command)) {
                System.out.println(phonebook);
            }

        }
    }
}