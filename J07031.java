import java.util.*;
import java.io.*;

public class J07031 {
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
        ArrayList<Integer> b=(ArrayList<Integer>)sc2.readObject();
        TreeSet<Integer> set1=new TreeSet<>(a);
        HashSet<Integer> set2=new HashSet<>(b);
        for(Integer x:set1){
            if(x>500000) break;
            if(check[x]==1&&check[1000000-x]==1){
                if(set1.contains(1000000-x)&&!set2.contains(x)&&!set2.contains(1000000-x)){
                    System.out.println(x+" "+(1000000-x));
                }
            }
        }
    }
}
