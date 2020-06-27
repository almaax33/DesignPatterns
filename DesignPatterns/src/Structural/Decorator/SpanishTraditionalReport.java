package Structural.Decorator;

public class SpanishTraditionalReport implements SpanishReport{

    @Override
    public String getReport(){
        return super.getReport() + "compadre";
    }

}