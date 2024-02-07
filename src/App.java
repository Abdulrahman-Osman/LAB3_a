import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,from sec53");
        generateGroups(readStudents(),4);
        
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

    public static void generateGroups(ArrayList<String> students,int n){
        Collections.shuffle(students);

        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String>> ();

        for(int i = 0 ; i < n ; i++){
            groups.add(new ArrayList<String>());
        }
        for(int i = 0 ; i < students.size() ; i++){
            groups.get(i%n).add(students.get(i));
        }
        System.out.println(groups);
    
    }
}
