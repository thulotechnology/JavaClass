import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
       try {
           File f = new File("hello.txt");
           Scanner reader = new Scanner(f);
          while (reader.hasNextLine()){
              String data = reader.nextLine();
              System.out.println(data);
          }
       }catch (Exception ex){
           System.out.println("Something went wrong");
       }
    }
}
