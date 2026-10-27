import java.util.*;
import java.io.*;

public class J07005 {
    public static void main(String[] args){
        try{
            FileInputStream file=new FileInputStream("DATA.IN");
            DataInputStream sc = new DataInputStream(file);
            TreeMap<Integer,Integer> a=new TreeMap<>();
            for(int i=0;i<100000;i++){
                int x=sc.readInt();
                if(a.containsKey(x)){
                    a.put(x, a.get(x)+1);
                }
                else{
                    a.put(x,1);
                }
            }
            for(Map.Entry<Integer,Integer> b:a.entrySet()){
                System.out.println(b.getKey()+" "+b.getValue());
            }
        }catch(Exception ex){
            
        }
        
        
    }
}
