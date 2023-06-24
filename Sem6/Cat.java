
import java.util.Objects;

public class Cat {

    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет) max = 10

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        if (satiety < 0) {
            throw new IllegalArgumentException("Your cat is very hungry");
        }

        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public int eat(Plate plate) {
        if (satiety >= 10) {
            return satiety;
        }
        return satiety = plate.decreaseFood(appetite, satiety);
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "] " + "satiety=" + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
