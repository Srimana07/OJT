import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {    
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number 1: ");
        int num1 = in.nextInt();

        System.out.print("Enter your number 2: ");
        int num2 = in.nextInt();

        if (num1>num2){
            System.out.println("The greatest number is:" + num1);
        }
        else if(num1<num2){
            System.out.println("The greatest number is:" + num2);
        }
        else{
            System.out.println("both numbers are equal");
        }
    }
}
