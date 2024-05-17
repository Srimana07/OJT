import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.print("The character is lowercase.");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.print("The character is uppercase.");
        } 
        else {
            System.out.print("Invalid input. Please enter a valid alphabet character.");
        }
    }
}

