import java.util.*;
import java.io.*;

public class J07007 {
    public static void main(String[] args){
        try {
            File file=new File("VANBAN.in");
            Scanner sc=new Scanner(file);
            TreeSet<String> s=new TreeSet<>();
            while(sc.hasNextLine()){
                String tmp=sc.nextLine().trim();
                String[] s2= tmp.toLowerCase().split("\\s+");
                for(int i=0;i<s2.length;i++) s.add(s2[i]);
            }
            for(String x:s) System.out.println(x);
        } catch (FileNotFoundException ex) {
        }
        
    }
}
