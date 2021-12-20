import java.util.Scanner;
public class HouseWork {
    public static void main(String[] args) {

        House h1 = new House("Ram ko House",102393393);
        House h2 = new House("Hari ko House",8893393);
        House h3 = new House("Mina ko House",102393393);
        House h4 = new House("Gita ko House",1023933958);
        House h5 = new House("Babita ko House",183);

        House[] houses = {h1,h2, h3,h4, h5};

        for(int i=0; i<5; i++){
            houses[i].print();
        }

    }
}

class House{
String name;
double price;

    public House(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void print(){
        System.out.println("House name is "+this.name);
        System.out.println("House price is "+this.price);
    }
}
