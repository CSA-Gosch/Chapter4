package Exercises;

public class Main {
    public static void main(String[] args) {
        double price = 10;
        double tax;
        Billing first = new Billing(10, 5, .5);
        Billing second = new Billing(10, 5);
        Billing third = new Billing(20);

        first.display();
        second.display();
        third.display();
    }
}
