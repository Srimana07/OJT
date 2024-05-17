import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your quantity: ");
        int quantity = in.nextInt();

        if ((quantity*100)>=1000){
            System.err.println("Your purchased cost is: " + (quantity*100)); 
            System.out.println("Your discounted is: " + ((quantity * 100)*0.1)); 
            System.out.println("Your discounted cost is: " + ((quantity*100) - ((quantity * 100)*0.1)));
        } else {
            System.err.println("Your purchased cost is: " + (quantity*100));
            System.out.println("You didn't get a discount.");
        }
    }  
}



