import java.io.File;
public class FileWork {
    public static void main(String[] args) {
        // Exception Handling
        try{
            File f = new File("hello.txt");

            if(f.createNewFile()){
                System.out.println("File is Created");
            }else{
                System.out.println("File is not created.");
            }
        }catch (Exception ex){
            System.out.println("Something Went Wrong");
        }

    }
}
