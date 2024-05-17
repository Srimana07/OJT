import java.util.Scanner;

public class absolute {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your input: ");
        int input = in.nextInt();

        if(input<0){
            System.out.println("Output is: " + ((-1)*input));
        }
        else{
            System.out.println("Output is: " + input);
        }
    }   
}
