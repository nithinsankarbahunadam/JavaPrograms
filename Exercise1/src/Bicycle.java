public class Bicycle extends Vehicle{

    protected int numbergear;


    public Bicycle(int maximumSpeed, int numbergear) {
        super(maximumSpeed, 2);
        this.numbergear = numbergear;
    }

    public int getNumbergear() {
        return numbergear;
    }

    public void setNumbergear(int numbergear) {
        this.numbergear = numbergear;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "numbergear=" + numbergear +
                ", maximumSpeed=" + maximumSpeed +
                ", numberwheels=" + numberwheels +
                "} " + super.toString();
    }
}
