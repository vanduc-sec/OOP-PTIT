import java.util.*;
import java.io.*;

public class J07032 {
    public static boolean check(int x){
        int tmp=0,cnt=0;
        int b=x;
        while(b>0){
            int c=b%10;
            if(c%2!=1) return false;
            tmp=tmp*10+c;
            b/=10;
            cnt++;
        }
        return x==tmp&&cnt%2==1&&cnt>1;
    }
    public static void main(String[] args) throws Exception{
        FileInputStream file1=new FileInputStream("DATA1.in");
        FileInputStream file2=new FileInputStream("DATA2.in");
        ObjectInputStream sc1=new ObjectInputStream(new BufferedInputStream(file1));
        ObjectInputStream sc2=new ObjectInputStream(new BufferedInputStream(file2));
        TreeMap<Integer,Integer> mp1=new TreeMap<>();
        TreeMap<Integer,Integer> mp2=new TreeMap<>();
        ArrayList<Integer> a=(ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> b=(ArrayList<Integer>)sc2.readObject();
        for(Integer x:a){
            if(check(x)) mp1.put(x,mp1.getOrDefault(x,0)+1);
        }
        for(Integer x:b){
            if(check(x)) mp2.put(x,mp2.getOrDefault(x,0)+1);
        }
        int id=0;
        for(Map.Entry<Integer,Integer> x:mp1.entrySet()){
            if(mp2.containsKey(x.getKey())){
                System.out.println(x.getKey()+" "+(x.getValue()+mp2.get(x.getKey())));
                id++;
                if(id==10) break;
            }            
        }
    }
}
