import java.util.*;
import java.io.*;

public class J07022 {
    public static void main(String[] args){
        try {
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            ArrayList<String> arr=new ArrayList<>();
            while(sc.hasNext()){
                if(sc.hasNextInt()) sc.nextInt();
                else arr.add(sc.next());
            }
            Collections.sort(arr);
            for(String x:arr) System.out.print(x+" ");
        } catch (FileNotFoundException ex) {
        }
    }
}
