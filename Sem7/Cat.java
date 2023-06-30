public class Cat extends Pet{
    
    private String type = "Cat";
    private String voice = "purring";
    private int min = 10;
    private int max = 20;

    public Cat(String name) {
        super(name);
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
         "\t" + getVoice() + "\t\tDistance to plate " + getDistance();
    }

}
