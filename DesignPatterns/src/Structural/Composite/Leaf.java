package Structural.Composite;

public class Leaf implements Component{

    double price;
    String name;

    public Leaf(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println("Name: "+name+" Price: "+price);
    }
}