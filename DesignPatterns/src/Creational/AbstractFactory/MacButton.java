package Creational.AbstractFactory;

public class MacButton extends Button {
    MacButton(String action) {
        super(action);
    }

    @Override
    void whoIam() {
        System.out.println("Mac Button "+this.action);
    }
}
