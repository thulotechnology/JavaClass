public class AddUsingMethodOverload {
    public static void main(String[] args) {
    add(50,50.2);
    }

    public static void add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }
    public static void add(int a, double b){
        System.out.println("The sum is "+(a+b));
    }

}
