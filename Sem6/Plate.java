
public class Plate {

    private int food;

    public Plate() {
        this(100);
    }

    public Plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");
        }

        this.food = food;
    }

    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    public int decreaseFood(int ap, int sat) {
            int plate = this.food;
            this.food -= ap - ((ap * (sat * 10)) / 100);
            // System.out.println(this.food);
            if (this.food < 0) {
                this.food = 0;
                return (((((ap * (sat * 10)) / 100) + plate) * 100) / ap) / 10;
            } else {
            return 10;
            }
    }

    @Override
    public String toString() {
        return "(" + food + ")";
    }
}
