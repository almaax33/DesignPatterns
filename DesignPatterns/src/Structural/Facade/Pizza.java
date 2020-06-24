package Structural.Facade;

public class Pizza implements Food {
    @Override
    public void make() {
        System.out.println("Mamama miiiiaaa, pitsa pitsa!");
    }
}