import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);


        System.out.print("Enter your service year: ");
        int year = in.nextInt();

        if(year>=5){
            System.out.print("Enter your salary: ");
            int salary = in.nextInt();
            System.out.println("Your net bonus amount: " + (salary*0.5));
        }
        else{
            System.out.println("You didn't get a bonus.");
        }
    }
}
