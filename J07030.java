import java.util.*;
import java.io.*;

public class J07030 {
    private static int[] check=new int[1000005];
    public static void nto(){
        for(int i=0;i<=1000000;i++) check[i]=1;
        check[0]=0;
        check[1]=0;
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(check[i]==1){
                for(int j=i*i;j<=1000000;j+=i) check[j]=0;
            }
        }
    }
    public static void main(String[] args) throws Exception{
        nto();
        FileInputStream file1=new FileInputStream("DATA1.in");
        FileInputStream file2=new FileInputStream("DATA2.in");
        ObjectInputStream sc1=new ObjectInputStream(new BufferedInputStream(file1));
        ObjectInputStream sc2=new ObjectInputStream(new BufferedInputStream(file2));
        ArrayList<Integer> a=(ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> b=(ArrayList<Integer>) sc2.readObject();
        Collections.sort(b);
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        for(int x:a){
            if(check[x]==1&&check[1000000-x]==1&&x<(1000000-x)){
                if(Collections.binarySearch(b, 1000000-x)>=0) mp.put(x, 1000000-x);
            }
        }
        for(Map.Entry<Integer,Integer> x : mp.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    }
}
