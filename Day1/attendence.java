import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Number of classes held: ");
        int heldC = in.nextInt();

        System.out.print("Number of you classes attended: ");
        int attendC = in.nextInt();

        double attendenceP = ((double) attendC / heldC) * 100;
        System.out.println("Your attendence is: " + attendenceP);

        if (attendenceP>=75){
            System.out.println("You are allowed to sit in the exam.");
        }
        else{
            System.out.println("You are not allowed to sit in the exam.");
        }
    }
}
