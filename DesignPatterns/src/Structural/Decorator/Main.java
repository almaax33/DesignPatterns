package Structural.Decorator;


public class Main{
    public static void main(String[]args){
        Report japaneseReport = new JapaneseReport();
        Report spanishReport = new SpanishReport();
        Report traditionalSpanishReport = new TraditionalSpanishReport();

        japaneseReport.getReport();
        spanishReport.getReport();
        traditionalSpanishReport.getReport();

    }
}
