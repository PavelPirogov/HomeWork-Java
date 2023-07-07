
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class Homework {

    /**
     * Создать класс Контейнер - Container.
     * В контейнере могут быть ящики (класс Box).
     *
     * У каждого ящика есть вес.
     * У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков,
     * которые находятся в контейнере.
     *
     * 1. Класс Контейнер должен быть Comparable. Сравнивать он должен по весам
     * контейнера (чем меньше вес, тем меньше контейнер).
     * 2. Класс ContainerCountComparator - Comparator, который сравнивает контейнеры
     * по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
     * 3. Класс контейнер должен быть Iterable - итерирование должно происходить по
     * ящикам внутри контейнера.
     * <code>
     *     Container c = new Container(...);
     *     // ...
     *     for (Box box: c) {
     *         box - это контейнер
     *     }
     * </code>
     */

    public static void main(String[] args) {

        Container container1 = new Container();
        container1.addBox(new Box());
        container1.addBox(new Box());
        container1.addBox(new Box());
        container1.addBox(new Box());

        Container container2 = new Container();
        container2.addBox(new Box());
        container2.addBox(new Box());

        Container container3 = new Container();
        container3.addBox(new Box());
        container3.addBox(new Box());
        container3.addBox(new Box());
        container3.addBox(new Box());
        container3.addBox(new Box());

        System.out.println(container1.size() + " " + container1.getClass().getSimpleName() + " " +
                container1.getWeigth() + " " + container1);
        System.out.println(container2.size() + " " + container2.getClass().getSimpleName() + " " +
                container2.getWeigth() + " " + container2);
        System.out.println(container3.size() + " " + container3.getClass().getSimpleName() + " " +
                container3.getWeigth() + " " + container3);

        Set<Integer> containers = new TreeSet<>(new ContainerCountComparator());
        containers.addAll(Arrays.asList(container1.size(), container2.size(), container3.size()));

        System.out.println(containers);

    }

    static class Container implements Iterable<Integer>, Comparable<Integer> {
        private List<Integer> boxs = new ArrayList<>();

        public void addBox(Box box) {
            boxs.add(box.getWeigth());
        }

        @Override
        public Iterator<Integer> iterator() {
            return boxs.iterator();
        }

        public int size() {
            return boxs.size();
        }

        public int compareTo(Integer another) {
            return boxs.size();
        }

        public int getWeigth() {
            int weigthContainer = 0;
            for (int n : boxs) {
                weigthContainer += n;
            }
            return weigthContainer;
        }

        @Override
        public String toString() {
            return "" + boxs + "";
        }

    }

    static class Box {
        int weight = ThreadLocalRandom.current().nextInt(10, 21);

        @Override
        public String toString() {
            return "[" + weight + "]";
        }

        public int getWeigth() {
            return this.weight;
        }
    }

    static class ContainerCountComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

}
