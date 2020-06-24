package Creational.AbstractFactory;

public class MacFactory extends Factory {

    @Override
    Button createButton() {
        return new MacButton("Enter");
    }
}
