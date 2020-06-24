package Creational.Prototype;

public class Base {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color = "blue";
        circle.radius = 1;
        Circle newCircle = (Circle) circle.clone();
        System.out.println(circle.equals(newCircle));
    }
}
