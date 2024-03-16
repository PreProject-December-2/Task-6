package model;

public class Cars {
   private String name;
    private int banchPress;
    private int squats;

    public Cars() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBanchPress() {
        return banchPress;
    }

    public void setBanchPress(int banchPress) {
        this.banchPress = banchPress;
    }

    public int getSquats() {
        return squats;
    }

    public void setSquats(int squats) {
        this.squats = squats;
    }

    public Cars(String name, int banchPress, int squats) {
        this.name = name;
        this.banchPress = banchPress;
        this.squats = squats;
    }

    @Override
    public String toString() {
        return "Cars{" +
               "name='" + name + '\'' +
               ", banchPress=" + banchPress +
               ", squats=" + squats +
               '}';
    }
}
