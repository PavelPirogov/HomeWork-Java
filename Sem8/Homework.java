
public class Homework {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * Задание
     * 
     * Предположим, вы разрабатываете какую-то компьютерную игру, в которой есть
     * несколько типов объектов (классов):
     * 1. Здание (имеет текущий уровень здоровья)
     * 2. Герой (имеет текущий уровень здоровья и текущий уровень магической
     * энергии)
     * 3. Нейтральный персонаж (имеет текущий уровень здоровья)
     * Примеры того, как это может выглядеть:
     * https://d3upx5peno0o6w.cloudfront.net/guides1png_1620826387.png
     * https://xgm.guru/files/100/242011/HP-Bar.png
     *
     * Также у вас есть класс Render с методом showIndicator, который срабатывает
     * при наведении мышки на объект
     * и работает следующим образом:
     * 1. Если объект обладает уровнем здоровья, то отображается индикатор с текущим
     * уровнем здоровья.
     * 2. Если объект обладает уровнем магический энергии, то отображается индикатор
     * с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей это запись информации в
     * консоль.
     * * То есть вы пишете код, который выводит на консоль информацию.
     *
     *
     * Подсказка: нужно ввести 2 интерфейса: наличие здоровья и наличие магической
     * энергии.
     * В классе Render проверять только на эти интерфейсы и выводить нужную
     * информацию.
     * Необходимо продумать, какие методы должны быть в интерфейсе.
     *
     * ЧТО ДЕЛАТЬ НЕ НУЖНО:
     * Нельзя завязываться на конкретные классы. Предполагается, что таких классов
     * очень много и они постоянно добавляются.
     *
     * * Необязательные задания, которые не относятся к теме, но при сильном желании
     * можно реализовать.
     * * Со звездочкой: реализовать в консоли отображение индикатора.
     * Например, при максимальном уровне здоровья 100 и текущем 40 можно отобразить
     * вот такую ленточку: [xxxx ]
     * ** С двумя звездочками: раскрасить вывод. Чем меньше здоровья, тем "краснее"
     * цвет индикатора. Для полного здоровья - цвет зеленый.
     */

    public static void main(String[] args) {

        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);

        render.showIndicator(building); // В консоли должно быть примерно так: Текущий уровень здоровья: 50,
                                        // максимальный уровень здоровья: 100

        // System.out.println(ANSI_RED + "This text has a red background but default
        // text!" + ANSI_RESET);
        // System.out.println(ANSI_GREEN + "This text has a green background but default
        // text!" + ANSI_RESET);

        Hero hero1 = new Hero(150, 150);
        hero1.setCurrentHealthPoint(145);
        hero1.setCurrentManaPoint(80);

        Hero hero2 = new Hero(105, 105);
        hero2.setCurrentHealthPoint(25);
        hero2.setCurrentManaPoint(75);

        render.showIndicator(hero1);
        render.showIndicator(hero2);

        Neutral neutral = new Neutral(50);
        neutral.setCurrentHealthPoint(20);

        render.showIndicator(neutral);

    }

    static class Render {

        /**
         * Если объект обладает уровнем здоровья, то отображается индикатор с текущим
         * уровнем здоровья.
         * Если объект обладает уровнем магический энергии, то отображается индикатор с
         * текущим уровнем энергии.
         * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
         */
        public void showIndicator(Object object) {
            // Не должно быть упоминания конкретных классов!!!
            if (object instanceof HasHelth) {
                int maxHelth = ((HasHelth) object).getMaxHelth();
                int currentHelth = ((HasHelth) object).getCurrentHelth();

                String currentHelthValue = " ";
                if (currentHelth > maxHelth * 0.7) {
                    currentHelthValue = ANSI_GREEN + "Текущий уровень здоровья " + currentHelth + ANSI_RESET;
                } else if (currentHelth <= maxHelth * 0.3) {
                    currentHelthValue = ANSI_RED + "Текущий уровень здоровья " + currentHelth + ANSI_RESET;
                } else {
                    currentHelthValue = ANSI_YELLOW + "Текущий уровень здоровья " + currentHelth + ANSI_RESET;
                }

                String myObject = object.getClass().getSimpleName();
                // System.out.print(ANSI_PURPLE + myObject + ANSI_RESET + ": " + "Текущий
                // уровень здоровья " + currentHelth
                // + ANSI_GREEN +
                // "\tМаксимальный уровень здоровья " + maxHelth + ANSI_RESET);

                System.out.print(ANSI_PURPLE + myObject + ANSI_RESET + ": " + currentHelthValue
                        + ANSI_GREEN +
                        "\tМаксимальный уровень здоровья " + maxHelth + ANSI_RESET);
            }

            if (object instanceof HasMana) {
                int maxMana = ((HasMana) object).getMaxMana();
                int currentMana = ((HasMana) object).getCurrentMana();

                String currentManaValue = " ";
                if (currentMana > maxMana * 0.7) {
                    currentManaValue = ANSI_GREEN + "Текущий уровень маны " + currentMana + ANSI_RESET;
                } else if (currentMana < maxMana * 0.3) {
                    currentManaValue = ANSI_RED + "Текущий уровень маны " + currentMana + ANSI_RESET;
                } else {
                    currentManaValue = ANSI_YELLOW + "Текущий уровень маны " + currentMana + ANSI_RESET;
                }

                System.out.println("\t" + currentManaValue + ANSI_BLUE +
                        "  Максимальный уровень маны " + maxMana + ANSI_RESET);
            }

            System.out.println();
        }

    }

    interface HasHelth {

        int getMaxHelth();

        int getCurrentHelth();

    }

    interface HasMana {

        int getMaxMana();

        int getCurrentMana();

    }

    static class Building implements HasHelth {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Building(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        @Override
        public int getMaxHelth() {
            return maxHealthPoint;
        }

        @Override
        public int getCurrentHelth() {
            return currentHealthPoint;
        }

        // FIXME: 29.06.2023 Дописать нужное
    }

    static class Hero implements HasHelth, HasMana {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        private int maxManaPoint; // максимально количество магический энергии
        private int currentManaPoint; // текущее количество магический энергии

        public Hero(int maxHealthPoint, int maxManaPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.maxManaPoint = maxManaPoint;

            this.currentHealthPoint = maxHealthPoint;
            this.currentManaPoint = maxManaPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        public void setCurrentManaPoint(int currentManaPoint) {
            this.currentManaPoint = currentManaPoint;
        }

        @Override
        public int getMaxHelth() {
            return maxHealthPoint;
        }

        @Override
        public int getCurrentHelth() {
            return currentHealthPoint;
        }

        @Override
        public int getMaxMana() {
            return maxManaPoint;
        }

        @Override
        public int getCurrentMana() {
            return currentManaPoint;
        }

        // FIXME: 29.06.2023 Дописать нужное
    }

    static class Neutral implements HasHelth {

        private int maxHealthPoint; // максимально количество здоровья
        private int currentHealthPoint; // текущее количество здоровья

        public Neutral(int maxHealthPoint) {
            this.maxHealthPoint = maxHealthPoint;
            this.currentHealthPoint = maxHealthPoint;
        }

        public void setCurrentHealthPoint(int currentHealthPoint) {
            this.currentHealthPoint = currentHealthPoint;
        }

        @Override
        public int getMaxHelth() {
            return maxHealthPoint;
        }

        @Override
        public int getCurrentHelth() {
            return currentHealthPoint;
        }

        // FIXME: 29.06.2023 Дописать нужное
    }

}