import java.util.*;
import java.io.*;

public class J07015 {
    public static boolean check(Integer x){
            if(x<2) return false;
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0) return false;
            }
            return true;
        }
    public static void main(String[] args){       
        try{
            FileInputStream file=new FileInputStream("SONGUYEN.in");
            ObjectInputStream sc=new ObjectInputStream(file);
            ArrayList<Integer> sn=(ArrayList<Integer>) sc.readObject();
            int[] in=new int[10000];
            for(Integer x:sn){        
                in[x]++;
            }
            for(int i=2;i<10000;i++){
                if(check(i)&&in[i]>0)
                System.out.println(i+" "+in[i]);
            }
        }catch(Exception ex){
            
        }
    }
}