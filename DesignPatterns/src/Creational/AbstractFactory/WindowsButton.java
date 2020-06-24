package Creational.AbstractFactory;

public class WindowsButton extends Button {

    WindowsButton(String action) {
        super(action);
    }

    @Override
    void whoIam() {
        System.out.println("Windows Button "+this.action);
    }
}
