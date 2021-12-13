//Work 1. WAP IN JAVA THAT CHECK WATER LEVEL OF TANKER IS OVER 500m or not. 2. WAP in java that print diccount if user bought product,which price is more than 500.

public class JavaWork {
    public static void main(String[] args) {
    int waterLevel = 300;
    if(waterLevel <=500){
        System.out.println("Water Level is less than 500.");
    }else{
        System.out.println("Water Level is more than 500.");
    }
    // Program 2
      double productamt = 1200;
        if(productamt <=500){
            System.out.println("No discount");
        }else{
            System.out.println("You will discount.");
        }

    }
}
