import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        String fname, lname;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        fname = sc.nextLine();
        System.out.println("Enter last name: ");
        lname = sc.nextLine();

        String fullname = fname +" "+ lname;
        System.out.println("Full name is "+fullname);
    }
}
// WAP IN JAVA THAT FIND SUM OF TWO NUMBER USING SCANNER.
// WAP IN JAVA THAT ADDS PRICE AND TIP and FIND Total Amount