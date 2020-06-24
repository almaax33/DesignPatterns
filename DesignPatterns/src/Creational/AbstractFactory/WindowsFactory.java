package Creational.AbstractFactory;

public class WindowsFactory extends Factory {
    @Override
    Button createButton() {
        return new WindowsButton("Enter");
    }
}
