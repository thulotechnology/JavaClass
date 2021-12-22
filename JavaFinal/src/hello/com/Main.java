package hello.com;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();

        names.add("Banira Dahal");
        names.add("Simran");
        names.add("Akash");
        names.add("Prakash");
        names.remove(3);
        names.add("Prithvi");
        names.add("Sanjaya");
        names.add("Sudha");
        names.remove("Sudha");
        System.out.println(names);

    }

}
