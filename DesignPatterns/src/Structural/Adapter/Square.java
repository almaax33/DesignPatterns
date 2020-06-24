package Structural.Adapter;

public class Square {
    int base;

    public Square(int base){
        this.base = base;
    }

    public int getArea(){
        return base*base;
    }
}
