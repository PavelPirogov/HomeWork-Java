
import java.util.*;

public class Homework {

    /**
     * Есть класс Фрукта. У фрукта есть вес.
     * Есть 3 наследника: апельсин, яблоко и золотое яблоко.
     *
     * Нужно создать класс "Коробка с фруктами", в которую можно класть фрукты
     * какого-то типа.
     * После создания коробка пустая. В нее можно добавлять фрукты с помощью метода
     * add.
     * У коробки можно узнать сумарный вес с помощью метода #getWeight.
     * Содержимое коробки можно пересыпать в другую коробку. При этом исходная
     * коробка очищается, а вторая наполняется.
     */
    public static void main(String[] args) {
        // Box<String> stringBox = new Box<>(); // не должно компилироваться

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addBox(new Orange(2));
        orangeBox.addBox(new Orange(1));
        // orangeBox.addBox(new Apple(2)); // не должно компилироваться
        // orangeBox.addBox(new GoldenApple(2)); // не должно компилироваться

        System.out.println(orangeBox.getWeigthBox());

        Box<Apple> appleBox = new Box<>();
        appleBox.addBox(new Apple(1));
        appleBox.addBox(new GoldenApple(2)); // допустимый вариант
        System.out.println(appleBox.getWeigthBox()); // 3

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.addBox(new GoldenApple(5)); // допустимый вариант
        // goldenAppleBox.addBox(new Apple(5)); // не должно компилироваться
        System.out.println(goldenAppleBox.getWeigthBox()); // 5

        goldenAppleBox.moveTo(appleBox); // допустимый вариант
        // appleBox.moveTo(goldenAppleBox); // не должно компилироваться
        // orangeBox.moveTo(appleBox); // не должно компилироваться

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println(orangeBox.getWeigthBox()); // 0
        System.out.println(orangeBox2.getWeigthBox()); // 3
    }

    // FIXME: 06.07.2023 Добавить нужный дженерик.
    static class Box<T extends Fruct> {

        // FIXME: 06.07.2023 Реализовать методы согласно заданию.

        ArrayList<T> boxs = new ArrayList<>();

        public void addBox(T fruct) {
            boxs.add(fruct);
        }

        public int getWeigthBox() {
            int weigthBox = 0;
            for (Fruct fruct : boxs) {
                weigthBox += fruct.getWeight();
            }
            return weigthBox;
        }

        public void moveTo(Box<? super T> box) {
            for (T fruct : boxs) {
                box.addBox(fruct);
            }
            boxs.clear();
        }

        @Override
        public String toString() {
            return "" + boxs;
        }

    }

    static class Fruct {
        private final int weight;

        public Fruct(int weight) {
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

    }

    static class Orange extends Fruct {
        public Orange(int weight) {
            super(weight);
        }
    }

    static class Apple extends Fruct {
        public Apple(int weight) {
            super(weight);
        }
    }

    static class GoldenApple extends Apple {
        public GoldenApple(int weight) {
            super(weight);
        }
    }

}
