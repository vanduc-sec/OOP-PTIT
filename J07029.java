import java.util.*;
import java.io.*;

public class J07029 {
    private static int[] check=new int[1000005];
    public static void nto(){
        for(int i=1;i<=1000000;i++) check[i]=1;
        check[0]=0;
        check[1]=0;
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(check[i]==1){
                for(int j=i*i;j<=1000000;j+=i){
                    check[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws Exception{
        nto();
        FileInputStream file=new FileInputStream("DATA.in");
        ObjectInputStream sc=new ObjectInputStream(new BufferedInputStream(file));
        ArrayList<Integer> arr=(ArrayList<Integer>)sc.readObject();
        TreeMap<Integer,Integer> mp=new TreeMap<>(Collections.reverseOrder());
        for(Integer x : arr){
            if(check[x]==1)
            mp.put(x,mp.getOrDefault(x, 0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> x:mp.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
            count++;
            if(count==10) break;
        }
    }
}
