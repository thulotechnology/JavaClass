public class ParmNoReturnType {
    public static void main(String[] args) {
    calculateStringLength("Metaverse");
    }
    // Parameter vako tara return type navako
    public static  void calculateStringLength(String val){
        int len = val.length();
        System.out.println("The length of "+val + " is "+len);

    }
}
