public class Vehicle {

    protected int maximumSpeed;
    protected int numberwheels;

    public Vehicle(int maximumSpeed, int numberwheels) {
        this.maximumSpeed = maximumSpeed;
        this.numberwheels = numberwheels;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public int getNumberwheels() {
        return numberwheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maximumSpeed=" + maximumSpeed +
                ", numberwheels=" + numberwheels +
                '}';
    }

    public void setNumberwheels(int numberwheels) {
        this.numberwheels = numberwheels;
    }
}
