package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        CircleHole hole = new CircleHole(5);
        Circle circle = new Circle(5);
        if (hole.fits(circle)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        Square smallSq = new Square(2);
        Square largeSq = new Square(20);
        // hole.fits(smallSq); // Won't compile.

        // Adapter solves the problem.
        SquareAdapter smallSqAdapter = new SquareAdapter(smallSq);
        SquareAdapter largeSqAdapter = new SquareAdapter(largeSq);
        if (hole.fits(smallSqAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
