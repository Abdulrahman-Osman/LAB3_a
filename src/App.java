import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println(readStudents());
    }

    public static ArrayList<String> readStudents(){
        ArrayList studetns = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("Student List.txt"));
            
            while(sc.hasNextLine()){
                studetns.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


        return studetns;
    }
}
