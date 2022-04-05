import java.util.Random;
import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {
        PuzzleJava randomizer = new PuzzleJava(); //this is creating an instance of PuzzleJava.java so that we can use its methods
        ArrayList<Integer> rolls = randomizer.getTenRolls(); //created a rolls variable that is an ArrayList of Integers then use randomizer to call the getTenRolls function
        Random randMachine = new Random();
        System.out.println("10 random rolls from 1-20");
        System.out.println(rolls);
        System.out.println("random letter");
        System.out.println(randomizer.getRandomLetter());
        System.out.println("random password");
        System.out.println(randomizer.generatePassword());
        System.out.println("random letter");
        System.out.println(randomizer.getNewPasswordSet(8));
    }
}
