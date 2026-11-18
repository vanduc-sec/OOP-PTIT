import java.io.*;
import java.util.*;

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

public class J07041 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in")) {
            @Override
            protected ObjectStreamClass readClassDescriptor() throws IOException, ClassNotFoundException{
                ObjectStreamClass desc = super.readClassDescriptor();
                if (desc.getName().equals("test.Pair")) {
                    return ObjectStreamClass.lookup(Pair.class);
                }
                return desc;
            }
        };
        ArrayList<Pair> a = (ArrayList<Pair>) sc.readObject();        
        Collections.sort(a);
        HashSet<String> set = new HashSet<>();
        for (Pair p : a) {
            if (p.getFirst() < p.getSecond()) {
                String key = p.getFirst() + "_" + p.getSecond();
                if (!set.contains(key)) {
                    System.out.println(p);
                    set.add(key);
                }
            }
        }
    }
}