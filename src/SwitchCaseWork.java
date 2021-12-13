import java.util.Scanner;
public class SwitchCaseWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of day");
        int noofDay = sc.nextInt();
        switch (noofDay){
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tues");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thr");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
