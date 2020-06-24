package Creational.Builder;

public class Director {
    public void constructAnimalCrossing(Builder builder) {
        builder.setType("Adventure");
        builder.setName("Animal Crossing");
        builder.isMultiplayer(false);
        builder.isOnline(true);
    }

    public void constructMarioKart(Builder builder) {
        builder.setType("Racing");
        builder.setName("Mario Kart");
        builder.isMultiplayer(true);
        builder.isOnline(false);
    }
}
