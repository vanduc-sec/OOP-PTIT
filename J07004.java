package oopptit;
import java.util.*;
import java.io.*;

public class J07004 {
    public static void main(String[] args){
        try{
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            TreeMap<Integer,Integer> res=new TreeMap<>();
            while(sc.hasNext()){
                int x=sc.nextInt();
                
                if(res.containsKey(x)){
                    res.put(x, res.get(x)+1);
                }
                else{
                    res.put(x, 1);
                }
            }
            for(Map.Entry<Integer,Integer> x:res.entrySet()){
                System.out.println(x.getKey()+" "+x.getValue());
            }

        }catch(FileNotFoundException ex){
            
        }        
    }
}
