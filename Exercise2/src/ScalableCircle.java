public class ScalableCircle extends Circle implements Scaleable {

    public ScalableCircle(int x, int y, int r){
        super(x,y,r);
    }

    public void scale(int factor) {
        // Scaling the radius
        // Setting the new radius
        super.R = getR() * factor;
    }
}
