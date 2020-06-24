package Structural.Composite;

public class Main {
    public static void main(String[] args) {

        Component hardDrive = new Leaf(1000, "Hard Drive");
        Component monitor = new Leaf(800, "Monitor");
        Component mouse = new Leaf(100, "Mouse");
        Component ram = new Leaf(15000, "RAM");
        Component CPU = new Leaf(20000, "CPU");

        Composite externalElements = new Composite("externalElements");
        Composite cabinet = new Composite("cabinet");
        Composite motherBoard = new Composite("motherBoard");
        Composite computer = new Composite("computer");

        externalElements.addComponent(monitor);
        externalElements.addComponent(mouse);
        motherBoard.addComponent(CPU);
        motherBoard.addComponent(ram);
        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(externalElements);
        computer.addComponent(cabinet);

        computer.showPrice();
    }
}
