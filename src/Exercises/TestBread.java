package Exercises;

public class TestBread {
    public static void main(String[] args) {
        Bread first = new Bread(25, 5, "Rye");
        Bread second = new Bread(10, 20);
        Bread third = new Bread(20);

        first.display();
        second.display();
        third.display();
    }
}
