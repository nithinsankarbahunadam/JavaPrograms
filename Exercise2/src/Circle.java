public class Circle {

    protected int X;

    protected int Y;

    protected int R;

    public Circle(){
        this.X=0;
        this.Y=0;
        this.R=0;
    }

    public Circle(int x, int y, int r){

        this.X=x;

        this.Y=y;

        this.R=r;

    }


    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    @Override
    public String toString() {
        return "The Center of the circle is ( " + this.X + " , " + this.Y +" ) and the radius is "+ this.R ;
    }
}
