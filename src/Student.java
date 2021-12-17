public class Student {
    // Class ko proporties define
    String name;
    int age;

    // Define Constructor
    Student(String n, int a){
        this.name = n;
        this.age =a;
    }
    // Self Method
    void findBirthYear(){
        int birthYear = 2021 - this.age;
        System.out.println("Your birth year is "+birthYear);
    }


}
