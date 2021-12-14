import java.util.Scanner;
public class SwitchWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = sc.nextLine().toUpperCase();

        char firstChar = word.charAt(0);

        switch (firstChar){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This is vowel");
                break;
            default:
                System.out.println("This is consonent");
        }


    }
}

// WAP in java to find number is even or not.
//if(2 le divide garda remainder == 0){
//    even
//        }else{
//    odd
//        }