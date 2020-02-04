package Die;

public class Die {
    public static void main(String[] args) {

        // Working from home,
        // Didn't know if you wanted accessors and mutators, but they're here if you wanted them...

        GetDiceRolls getDieOne = new GetDiceRolls();
        GetDiceRolls getDieTwo = new GetDiceRolls();

        int first = Die();
        int second = Die();

        System.out.println("Your first dice roll: " + first + "\nYour second roll: " + second);
    }
    public static int Die(){
        int diceRoll;
        final int HIGHEST_DIE = 6;
        final int LOWEST_DIE = 1;

        diceRoll = ((int) (Math.random() * 100) % HIGHEST_DIE + LOWEST_DIE);
        return diceRoll;
    }
}
