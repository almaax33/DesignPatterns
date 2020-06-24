package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        AnimalCrossingBuilder builder = new AnimalCrossingBuilder();
        director.constructAnimalCrossing(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        AnimalCrossing animalCrossing = builder.getResult();
        System.out.println("Animal Crossing built:\n" + animalCrossing.toString());


        MarioKartBuilder marioKartBuilder = new MarioKartBuilder();

        // Director may know several building recipes.
        director.constructMarioKart(marioKartBuilder);
        MarioKart marioKart = marioKartBuilder.getResult();
        System.out.println("\nMarioKart built:\n" + marioKart.toString());
    }
}
