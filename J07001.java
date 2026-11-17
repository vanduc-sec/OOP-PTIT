import java.util.*;
import java.io.File;

public class j07001 {
    public static void main(String[] args){
        try {
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                System.out.println(s);
            }
        } catch (Exception ex) {
            System.out.println("FILE NOT FOUND");
        }
    }
}
