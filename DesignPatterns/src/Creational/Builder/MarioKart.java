package Creational.Builder;

public class MarioKart {
    String name;
    String type;
    Boolean online;
    Boolean multiplayer;

    public MarioKart(String name, String type, Boolean online, Boolean multiplayer) {
        this.name = name;
        this.type = type;
        this.online = online;
        this.multiplayer = multiplayer;
    }
}
