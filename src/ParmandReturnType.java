public class ParmandReturnType {
    public static void main(String[] args) {
    int len = findLengthofText("Sita");
        System.out.println("The length is "+len);
    }
    // Parameter vako ani return type
    public static int findLengthofText(String value){
        int len = value.length();
        return  len;
    }
}
