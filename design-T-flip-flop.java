import java.util.Scanner;

public class TFlipFlop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== T Flip-Flop =====");

        System.out.print("Enter T (0 or 1): ");
        int T = sc.nextInt();

        System.out.print("Enter Previous Q (0 or 1): ");
        int Q = sc.nextInt();

        int nextQ;

        if (T == 0) {
            nextQ = Q;
        } 
        else if (T == 1) {
            nextQ = 1 - Q;
        } 
        else {
            System.out.println("Invalid input! Enter only 0 or 1.");
            return;
        }

        System.out.println("Next State Q = " + nextQ);

        sc.close();
    }
}
