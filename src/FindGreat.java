public class FindGreat {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 300;
        int num3 = 300;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1+" is great.");
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is great.");
        }else if(num3> num1 && num3 > num2){
            System.out.println(num3+ " is great.");
        }else{
            System.out.println("Invlid");
        }

    }
}
