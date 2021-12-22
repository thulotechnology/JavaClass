import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("hello.csv");
        f.delete();
    }
}
