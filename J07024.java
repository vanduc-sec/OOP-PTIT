import java.util.*;
import java.io.*;

class WordSet{
    private TreeSet<String> set;
    public WordSet(String name) throws IOException{
        File file=new File(name);
        Scanner sc=new Scanner(file);
        this.set=new TreeSet<>();
        while(sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }
    public String difference(WordSet s){
        String res="";
        for(String x:this.set){
            if(!s.set.contains(x)) res+=x+" ";
        }
        return res.trim();
    }
}
public class J07024 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
