import java.util.*;
import java.io.*;
public class J07023 {
    private static int[] check=new int[10000];
    private static void nto(){
        for(int i=0;i<10000;i++) check[i]=1;
        check[0]=0;
        check[1]=0;
        for(int i=2;i<=Math.sqrt(10000);i++){
            if(check[i]==1){
                for(int j=i*i;j<10000;j+=i) check[j]=0;
            }
        }
    }
    private static boolean tn(int x){
        String s=x+"";
        StringBuilder t=new StringBuilder(s);
        t.reverse();
        return s.equals(t.toString());
    }
    public static void main(String[] args){
        nto();
        try{
            FileInputStream file1=new FileInputStream("DATA1.in");
            FileInputStream file2=new FileInputStream("DATA2.in");
            BufferedInputStream bf1=new BufferedInputStream(file1);
            BufferedInputStream bf2=new BufferedInputStream(file2);
            ObjectInputStream sc1=new ObjectInputStream(bf1);
            ObjectInputStream sc2=new ObjectInputStream(bf2);
            TreeMap<Integer,Integer> mp=new TreeMap<>();
            TreeMap<Integer,Integer> mp2=new TreeMap<>();
            ArrayList<Integer> a1=(ArrayList<Integer>)sc1.readObject();
            ArrayList<Integer> a2=(ArrayList<Integer>)sc2.readObject();
            for(Integer x:a1){
                if(check[x]==1&&tn(x)){
                    mp.put(x,mp.getOrDefault(x, 0)+1);
                }
            }
            for(Integer x:a2){
                if(check[x]==1&&tn(x)&&mp.containsKey(x)){
                    mp2.put(x,mp2.getOrDefault(x, 0)+1);
                }
            }
            for(Map.Entry<Integer,Integer> x:mp.entrySet()){
                if(mp2.containsKey(x.getKey()))
                System.out.println(x.getKey()+" "+x.getValue()+" "+mp2.get(x.getKey()));
            }
        }catch(Exception ex){
        }
    }
}