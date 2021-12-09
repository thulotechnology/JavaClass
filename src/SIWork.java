import java.util.Scanner;

public class SIWork {
    public static void main(String[] args) {
        float p, t, r;
        // Making Scanner Object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter P: ");
        p = sc.nextFloat();
        System.out.println("Enter R: ");
        r = sc.nextFloat();
        System.out.println("Enter T: ");
        t = sc.nextFloat();
        float simpleInertrst = p * t * r /100;
        System.out.println("The simple interest is "+simpleInertrst);


    }
}
