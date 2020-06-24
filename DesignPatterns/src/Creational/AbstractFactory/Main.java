package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Application app;
        Factory factory;
        String osName = "windows";
        //System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        app.paint();
    }
}

class Application{
    private Button button;

    public Application(Factory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.whoIam();
    }
}
