import java.util.*;

public class square {
    public static void main(String[] args) {
          @SuppressWarnings("resource")
          Scanner in = new Scanner(System.in);
          
          System.out.print("Enter length: ");
          int l = in.nextInt();

          System.out.print("Enter breadth: ");
          int b = in.nextInt();
          
          if (l>b){
               System.out.println("It is not a square.");
          }
          else if(l<b){
               System.out.println("It is not a square.");
          }
          else{
               System.out.println("It is a square");
          }

    }
}
