package Exercises;

public class Bread {

    private double priceOfBread;
    private int caloriesInBread;
    private String breadType;
    private final static String MOTTO = " ~ The staff of life";

    public Bread(double price, int calories, String type)
    {
        priceOfBread = price;
        caloriesInBread = calories;
        breadType = type;
    }
    public Bread(double price, int caloriesInBread)
    {
        this(price, caloriesInBread, "White");
    }
    public Bread(double price)
    {
        this(price, 10, "Wheat");
    }

    public void display(){
        System.out.println(priceOfBread + "$ " + caloriesInBread + " calories in "  + breadType + " bread." + MOTTO);
    }
}
