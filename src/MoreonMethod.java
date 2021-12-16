public class MoreonMethod {
    public static void main(String[] args) {
       // welcomeUser();
        //add(10,89);
        //int total = multiply(5,5);
        //System.out.println(total);

     double bs = basicSalary();
        System.out.println("The Basic Salary is "+ bs);
    }
    // 1. No parameter & no return type.
    public static void welcomeUser(){
        System.out.println("-----------------------");
        System.out.println("Welcome to my software.");
        System.out.println("-----------------------");

    }
    //2. Parameter  & no return type.
    public static void add(int a, int b){
        System.out.println("The sum is "+(a+b));
    }
    //3. Parameter  & return type.
    public static int multiply(int a, int b){
        int mul = a * b;
        return mul;
    }
    //No parameter & return type.
    public static double basicSalary(){
        return 3000;
    }

}

// WAP In Java that find area of circle using  Parameter  & return type method.
// 3.14 * radius * radius


