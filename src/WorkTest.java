//Print Even number between 1 to 1000 using while loop
public class WorkTest{
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            i++;
            if (i % 2 != 0) {
                System.out.println(i);


            }
        }
    }
}