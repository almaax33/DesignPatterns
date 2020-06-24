package Structural.Adapter;

public class SquareAdapter extends Circle{

    public Square square;

    SquareAdapter(Square square){
        this.square = square;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit.
        result = (Math.sqrt(Math.pow((square.base / 2), 2) * 2));
        return result;
    }
}
