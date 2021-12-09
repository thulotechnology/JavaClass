import java.util.Scanner;
public class RemainderWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Enter First Number: ");
        firstNumber = sc.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = sc.nextInt();

        int q = firstNumber / secondNumber;
        int r = firstNumber % secondNumber;

        System.out.println("The quotient is: "+q);
        System.out.println("The remainder is: "+r);
    }
}
