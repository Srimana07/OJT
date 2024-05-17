import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first person's age: ");
        int age1 = in.nextInt();

        System.out.print("Enter second person's age: ");
        int age2 = in.nextInt();

        System.out.print("Enter third person's age: ");
        int age3 = in.nextInt();

        //code to find 
        if (age1>=age2 && age1>=age3) {
            System.out.println("The oldest age is:" + age1);
        }
        else if (age2>=age1 && age2>=age3) {
            System.out.println("The oldest age is:" + age2);
        }
        else{
            System.out.println("The oldest age is:" + age3);
        }

        if (age1<=age2 && age1<=age3) {
            System.out.println("The youngest is:" + age1);
        }
        else if (age2<=age1 && age2<=age3) {
            System.out.println("The youngest is:" + age2);
        }
        else{
            System.out.println("The youngest is:" + age3);
        }
    }

    
}
