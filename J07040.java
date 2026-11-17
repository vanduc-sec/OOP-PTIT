
package oopptit;

import java.util.*;
import java.io.*;

public class J07040 {
    public static void main(String[] args) throws Exception{
        File file1=new File("VANBAN.in");
        Scanner sc1=new Scanner(file1);
        FileInputStream file2=new FileInputStream("NHIPHAN.in");
        ObjectInputStream sc2=new ObjectInputStream(new BufferedInputStream(file2));
        LinkedHashSet<String> set=new LinkedHashSet<>();
        while(sc1.hasNextLine()){
            String[] s=sc1.nextLine().trim().toLowerCase().split("\\s+");
            for(String x:s) set.add(x);
        }
        ArrayList<String> a=(ArrayList<String>)sc2.readObject();
        HashSet<String> set2=new HashSet<>();
        for(String x:a){
            String[] t=x.trim().toLowerCase().split("\\s+");
            for(String b:t) set2.add(b);
        }
        for(String x:set){
            if(set2.contains(x)) System.out.println(x);
        }
    }
}
