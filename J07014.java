import java.util.*;
import java.io.*;

class WordSet{
    private TreeSet<String> set;
    public WordSet(String filename) throws FileNotFoundException{
        this.set=new TreeSet<>();
        File file=new File(filename);
        Scanner sc=new Scanner(file);
        while(sc.hasNext()){
            String w=sc.next().toLowerCase();
            set.add(w);
        }
        sc.close();
    }
    public WordSet(TreeSet<String> a){
        this.set=a;
    }
    public WordSet union(WordSet b){
        TreeSet<String> tmp=new TreeSet<>(this.set);
        tmp.addAll(b.set);
        return new WordSet(tmp);
    }
    public WordSet intersection(WordSet b){
        TreeSet<String> tmp=new TreeSet<>(this.set);
        tmp.retainAll(b.set);
        return new WordSet(tmp);
    }
    public String toString(){
        String res="";
        for(String x:this.set) res+=x+" ";
        return res;
    }
}
public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
