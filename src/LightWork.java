import java.util.Scanner;
public class LightWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int total = 5;
        Light [] lights = new Light[total];
        for(int i=0; i<total; i++){
            System.out.println("Enter light name of "+i);
            String name = sc.nextLine();
            System.out.println("Enter light price of  "+i);
            double price = s.nextDouble();
            lights[i] = new Light(name, price);
        }

        for (int i=0; i<total; i++){
            System.out.println("Light Name "+lights[i].name);
            System.out.println("Light Price "+lights[i].price);
        }


    }

}

class Light{
    String name;
    double price;

    public Light(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
