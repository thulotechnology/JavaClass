public class MobilePhone {
    public static void main(String[] args) {
    Mobile m1 = new Mobile("A1");
    Mobile m2 = new Mobile("M1", "apple", 5, 780000, false);
    m1.isSold = true;
        m1.printPhoneDetails();
        m2.printPhoneDetails();

    }
}

class Mobile{
    String model;
    String name;
    int ram;
    double price;
    boolean isSold;

    public Mobile(String model, String name, int ram, double price, boolean isSold) {
        this.model = model;
        this.name = name;
        this.ram = ram;
        this.price = price;
        this.isSold = isSold;

    }
    public Mobile(String model){
    this.model = model;
    }

    // Method
    void printPhoneDetails(){
        System.out.println("Mobile name is "+this.name);
        System.out.println("Mobile model is "+this.model);
        System.out.println("Mobile RAM is "+this.ram);
        System.out.println("Mobile price is "+this.price);
        if(this.isSold){
            System.out.println("This mobile is sold.");
        }else{
            System.out.println("This mobile is not sold.");
        }
    }

}

