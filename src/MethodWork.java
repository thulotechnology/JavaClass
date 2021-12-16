public class MethodWork {
    public static void main(String[] args) {
        // here 1000 2 8 are arguments
        calculateInterest(1000,2,8);
        calculateInterest(2000,2,8);
    }
    public static void displayName(){
        System.out.println("Hello I am from method.");
    }
    // Here name is parameter
    public static void greetUser(String name){
        System.out.println("Hello "+name);
    }
    public static void calculateInterest(double p, double t, double r){
    double interest = p * t * r / 100;
        System.out.println("The Inerest is "+interest);
    }
    // Find sum of 3 numbers



}
