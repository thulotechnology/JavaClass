import java.io.File;
import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            File f = new File("hello.csv");
            f.createNewFile();
            FileWriter fw = new FileWriter("hello.csv");
            fw.write("Maile Kehi Lekhdai xu");
            fw.close();
        }catch (Exception ex){
            System.out.println("Something Went wrong");
        }

    }
}
// Create file with name nepal.txt and write "Hello" to it.