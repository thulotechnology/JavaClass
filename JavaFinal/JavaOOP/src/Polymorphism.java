public class Polymorphism {
    public static void main(String[] args) {
        Hen a = new Hen();
        a.animalSound();
    }
}

class Animal{
    String name;

    void animalSound(){
        System.out.println("This is animal sound");
    }
}

class Hen extends Animal{
    void animalSound(){
        System.out.println("Kukhuri Ka");
    }
}