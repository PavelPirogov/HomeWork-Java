import java.util.Random;

public class Pet {
    
    protected Random rnd = new Random();
    private String type = "Dino";
    protected String name;
    private int min = 25;
    private int max = 35;
    protected int speedMin;
    protected int speedMax;
    private String voice = "dinosaur roar";

    private int distanceToPlateMin = 50;
    private int distanceToPlateMax = 100;

    public Pet(String name) {
        this.name = name;
    }

    public int setSpeedMin(int speedMin) {
        return this.speedMin = min;
    }

    public int setSpeedMax(int speedMax) {
        return this.speedMax = max;
    }

    public int getSpeed(int min, int max) {
        return rnd.nextInt(min, max);
    }

    public String getVoice() {
        return voice;
    }
    
    @Override
    public String toString() {
        return type + "\tName: " + name + "\t" + "[speed] = " + getSpeed(setSpeedMin(min), setSpeedMax(max)) +
         "\t" + getVoice() + "\tDistance to plate " + getDistance();
    }

    public int getDistance() {
        return rnd.nextInt(this.distanceToPlateMin, this.distanceToPlateMax);
    }


}
