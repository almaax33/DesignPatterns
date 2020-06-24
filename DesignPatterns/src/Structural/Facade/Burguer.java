package Structural.Facade;

public class Burguer implements Food {
    @Override
    public void make() {
        System.out.println("The real american food,a burguer!");
    }
}
