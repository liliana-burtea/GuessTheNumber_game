import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        /*cere de la user sa ghiceasca un numar de la 1 la 100,
        daca un nr introdus de user este mai mic sa se afiseze -> more
        daca un nr introdus de user este mai mare sa se afiseze -> less
        daca un nr introdus de user este egal sa se afiseze -> you won/guessed
         */

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(101);
        int attempts = 0;


        while (true) {
            System.out.println("Guess a number from 1 to 100");
            int guessNumber = sc.nextInt();
            attempts++; //attempts = incrementare; attempts-- decrementare
            //atempts++, attempts+=1, attempts=attempts+1/2/3/4; --> sunt identice

            if (guessNumber < hiddenNumber) {
                System.out.println("More");
            } else if (guessNumber > hiddenNumber) {
                System.out.println("Less");
            } else {
                System.out.println("You guessed the number");
                System.out.println("You used " + attempts + " attempts");
                break;
            }
        }
    }
}
// TODO: Implementeaza un sistem de vieti (8 vieti, la a noua GameOver + break)