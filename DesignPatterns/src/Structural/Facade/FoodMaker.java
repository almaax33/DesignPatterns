package Structural.Facade;

public class FoodMaker {
    Pizza pizza;
    Burguer burguer;
    Salad salad;

    FoodMaker(){
        pizza = new Pizza();
        burguer = new Burguer();
        salad = new Salad();
    }

    public void makePizza(){
        pizza.make();
    }
    public void makeBurguer(){
        burguer.make();
    }
    public void makeSalad(){
        salad.make();
    }

}
