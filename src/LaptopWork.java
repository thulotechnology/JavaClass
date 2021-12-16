import java.util.Scanner;
public class LaptopWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Laptop l1 = new Laptop();
        l1.name = "MSI";
        l1.screensize = 16.9;
        l1.color = "Black";

        Laptop l2 = new Laptop();
        System.out.println("Enter Laptop name: ");
        l2.name = sc.nextLine();
        System.out.println("Enter Laptop color");
        l2.color = sc.nextLine();
        System.out.println("Enter Laptop Screensize");
        l2.screensize = s.nextDouble();

        printLaptopDetails(l1);
        printLaptopDetails(l2);

    }

    public static void printLaptopDetails(Laptop l){
        System.out.println("Laptop name is "+l.name);
        System.out.println("Laptop color is "+l.color);
        System.out.println("Laptop screensize is "+l.screensize);
        System.out.println("\n");
    }

}
// WAP in Java to Create Class Camera Prop[name, model, price] , create its
// object and print details
