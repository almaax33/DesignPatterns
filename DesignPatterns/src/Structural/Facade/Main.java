package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        FoodMaker fm = new FoodMaker();

        fm.makeBurguer();
        fm.makePizza();
        fm.makeSalad();

    }
}
