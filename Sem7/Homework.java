
import java.util.List;
import java.util.ArrayList;

public class Homework {

    /**
     * Нужно создать несколько классов животных:
     * 1. Пес (Собака)
     * 2. Кот (Кошка)
     * 3. ... придумать еще парочку
     *
     * Каждое животное имеет: (поля)
     * 1. Имя (кличка)
     * 2. Возраст
     * 3. ... придумать еще какие-то параметры
     *
     * Каждое животное может: (методы)
     * 1. Подавать голос
     * 2. Питаться (съедает какое-то количество еды, переданное в метод)
     * 3. Двигаться
     * 4. ... все, что сумеете придумать
     *
     * Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
     * Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.
     *
     * * Придумать свою структуру с наследованием по аналогии с животными и банковскими счетами.
     */

    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Murzik"));
        pets.add(new Cat("Tuzik"));
        pets.add(new Cat("Luntik"));

        for (Pet pet : pets) {
            System.out.println(pet);
        }

        // System.out.println(pets.get(1).getVoice());
        
        // Pet pet1 = new Pet("Murzik");
        // System.out.println(pet1);
        // Cat pet2 = new Cat("Tuzik");
        // System.out.println(pet2);
        // Pet pet3 = new Cat("Luntik");
        // System.out.println(pet3);
        
        // String[] a = pets.get(0).split(); // не работает
        
    }
}
