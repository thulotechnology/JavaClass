import java.util.Scanner;
public class DayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of day: ");
        int noofDay = sc.nextInt();
        if(noofDay == 1){
            System.out.println("The day is sunday.");
        }else if(noofDay ==2){
            System.out.println("The day is monday");
        }else if(noofDay == 3){
            System.out.println("The day is tue.");
        }else if(noofDay == 4){
            System.out.println("The day is wed.");
        }else if(noofDay == 5){
            System.out.println("The day thu.");
        }else if(noofDay == 6){
            System.out.println("The day is fri.");
        }else if(noofDay == 7){
            System.out.println("The day is sat.");
        }else{
            System.out.println("Invalid number given.");
        }
    }
}
