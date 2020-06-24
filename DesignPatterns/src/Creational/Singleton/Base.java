package Creational.Singleton;

import Creational.Singleton.Singleton;

public class Base{
    public static void main(String[] args) {
        // THIS FAILS!! BECAUSE YOU CAN NOT CREATE NEW OBJECTS!
        // Singleton s1 = new Singleton();
        Singleton s2 = Singleton.getInstance("aiuda");
    }
}
