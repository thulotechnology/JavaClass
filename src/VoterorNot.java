import java.util.Scanner;
public class VoterorNot {
    public static void main(String[] args) {
        int birthYear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        birthYear = sc.nextInt();
        // Find age
        int age = 2021 -birthYear;
        // Check condition
        if(age>=17){
            System.out.println("You are voter");
        }else{
            System.out.println("Sorry, you are not voter.");
        }
    }
}
