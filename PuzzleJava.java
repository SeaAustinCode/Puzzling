import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() { //
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random randMachine = new Random(); //creating an instance of this random class

        for (int i = 1; i <=10; i++) {
            random10.add(randMachine.nextInt(20) + 1); //returns number between 0-19 so add 1 to shift range 
        }
        return random10; 
    }

    public String getRandomLetter() {
        Random randmachine = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        char randomLetter = alphabetString.charAt(randmachine.nextInt(26));

        return String.valueOf(randomLetter);
    }

    public String generatePassword() {
        String password = " ";

        for(int i=0; i < 8; i++) {
            password = password +getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) { //takes in int length as an arguement
        
        ArrayList<String> setPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            setPassword.add(generatePassword());
        }
        return setPassword; //returns random 8 character password for 8 words
    }
}