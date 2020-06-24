package Structural.Adapter;

public class CircleHole {

    private double radius;

    public CircleHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(Circle peg) {
        boolean result;
        result = (this.getRadius() >= peg.radius);
        return result;
    }
}
