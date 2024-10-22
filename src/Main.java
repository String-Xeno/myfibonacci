
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!\n");
        System.out.println("This is the Fibonacci sequence helper, enter the placement of the number you want in the sequence,\n" + "and you will get the value for that place in the sequence!\n");
        System.out.println("for example: the value for the 4th placement is 2, and the 5th is 3, but the 6th is 5.");
        int first = 0, second = 1;
        int needed = 0;
        int rollback = 0;
        //while used to rollback into the input part
        while (rollback == 0) {
            //setting a scanner and getting the input
            Scanner input = new Scanner(System.in);
            System.out.println();
            int placeinsequence = input.nextInt();
            System.out.println();
            System.out.print("processing");
            for (int u = 1; u <= 3; u++){
                Thread.sleep(750);
                System.out.print(".");
            }

            //0 and 1 are variables that are ea
            if (placeinsequence == 0) {
                System.out.println("The value is 0");
                rollback = 1;
            }
            if (placeinsequence == 1) {
                System.out.println("The value is 1");
                rollback = 2;
            }
            if (placeinsequence >= 2) {
                for (int i = 1; i < placeinsequence; i++) {
                    needed = first + second;
                    first = second;
                    second = needed;
                }
                System.out.println("The value is: " + needed);
                rollback = 1;
            }
            //variables that arent in the sequence
            if (placeinsequence <= -1) {
                System.out.print("Error! restarting");
                for (int u = 1; u <= 3; u++) {
                    Thread.sleep(750);
                    System.out.print(".");
                }
                System.out.println();
            }
        }
    }
}
