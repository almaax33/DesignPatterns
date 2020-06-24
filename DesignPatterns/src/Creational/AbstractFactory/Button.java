package Creational.AbstractFactory;

abstract class Button {
    String action;

    Button(String action){
        this.action = action;
    }

    abstract void whoIam();

}
