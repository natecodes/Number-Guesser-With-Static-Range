import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        boolean numberCorrect = false;
        double currentGuess = 5;
        double maxGuess = 11;
        double minGuess = 0;
        String higherOrLower;
        //define variables and the scanner

        System.out.println();
        System.out.println("Pick a number from 1-10");
        System.out.println("Press enter when ready...");
        in.nextLine();
        //printed out the conditions for the user and waits for user to press enter

        while(numberCorrect == false){
            System.out.println("Is your number higher than " + currentGuess + ", lower than " + currentGuess + ", or is " + currentGuess + " the correct number?");
            higherOrLower = in.nextLine();

            //starting here I need to analyze higherOrLower to see which case we are in

            if(higherOrLower.equalsIgnoreCase("higher")){
                minGuess = currentGuess;
                currentGuess = Math.round(maxGuess + minGuess)/2;
            }
            else if (higherOrLower.equalsIgnoreCase("lower")){
                maxGuess = currentGuess;
                currentGuess = Math.round(maxGuess + minGuess)/2;
            }
            else if (higherOrLower.equalsIgnoreCase("correct")){
                System.out.println("Your number is: " +currentGuess);
                numberCorrect = true;
                //finish code because it works
            }
        }
    }

}
