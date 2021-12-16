public class MethodOverloading {
    public static void main(String[] args) {
    printName(1);
    }

    public static void printName(){
        System.out.println("Hello User");
    }
    public static void printName(String name){
        System.out.println("Hello "+name);
    }
    public static void printName(int a){
        System.out.println(a);
    }
}
