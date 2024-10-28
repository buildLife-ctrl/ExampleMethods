import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 10; i ++) {
            diceRoller();
            scan.nextLine();
        }

        System.out.println();
        findNumA("Hello, my name is Kush.");
        findNumA("What is your name?");
    }

    //create dice roller method
    public static void diceRoller() {
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        System.out.print("You rolled a " + roll1);
    }

    public static void findNumA(String s) {
        int numA = 0;
        //loops through the string from the 1st to last index
        for (int i = 0; i < s.length(); i++) {
            String current = s.substring(i, i + 1);
            if (current.equalsIgnoreCase("a")) {
                numA++;
            }
        }

        System.out.println(numA + " A(s) found.");
    }
}