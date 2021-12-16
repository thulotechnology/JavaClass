public class NoParmandReturnType {
    public static void main(String[] args) {
        int ramAge = 21;
        if(ramAge < defaultVoterAge()){
            System.out.println("You are not ready for vote");
        }else{
            System.out.println("Ready to vote.");
        }
    }

    public static int defaultVoterAge(){
        return  18;
    }
}

// WAP in Java that pass first and last name using function and print
// total no of characters of full name.