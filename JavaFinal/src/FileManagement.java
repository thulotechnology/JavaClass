import java.io.File;
import java.util.Scanner;
public class FileManagement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        int a, b;
        try{
            System.out.println("Enter a: ");
            a = sc.nextInt();
            System.out.println("Enter b: ");
            b = sc.nextInt();
            int sum = a +b;
            System.out.println("The sum is "+sum);
        }catch (Exception ex){
            System.out.println("You entered wrong value.");
        }


    }
}
