package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    String name;
    List<Component> components;

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component com){
        if(components == null)
            components = new ArrayList<>();
        components.add(com);
    }

    @Override
    public void showPrice() {
        System.out.println("Name: "+name);
        for (Component com: components) {
            com.showPrice();
        }
    }
}
