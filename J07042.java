package oopptit;
import java.util.*;
import java.io.*;

class Pair implements Serializable, Comparable<Pair> {
    private int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair o) {
        return this.first - o.first;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class J07042 {
    public static int check(int a, int b){
        while(b>0){
            int tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception{
        FileInputStream file=new FileInputStream("DATA.in");
        ObjectInputStream sc=new ObjectInputStream(new BufferedInputStream(file)){
            @Override
            protected ObjectStreamClass readClassDescriptor() throws IOException,ClassNotFoundException{
                ObjectStreamClass desc=super.readClassDescriptor();
                if(desc.getName().equals("test.Pair")) return ObjectStreamClass.lookup(Pair.class);
                return desc;
            } 
        };
        ArrayList<Pair> a=(ArrayList<Pair>) sc.readObject();
        Collections.sort(a);
        HashSet<String> set=new HashSet<>();
        for(Pair x:a){
            if(x.getFirst()<x.getSecond()&&check(x.getFirst(),x.getSecond())==1){
                String s=x.getFirst()+" "+x.getSecond();
                if(!set.contains(s)){
                    System.out.println("("+x.getFirst()+", "+x.getSecond()+")");
                    set.add(s);
                }
            }
        }
    }
}
