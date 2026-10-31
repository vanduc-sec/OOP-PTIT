package oopptit;
import java.util.*;
import java.io.*;

public class J07012 {
    public static void main(String[] args){
        try{
            FileInputStream file=new FileInputStream("DATA.in");
            ObjectInputStream sc=new ObjectInputStream(file);
            ArrayList<String> list=(ArrayList<String>)sc.readObject();
            TreeMap<String,Integer> mp=new TreeMap<>();
            for(String line : list){
                String[] s=line.trim().toLowerCase().split("[^a-z0-9]+");
                for(String x : s){
                    if(!x.isEmpty()){
                        mp.put(x,mp.getOrDefault(x,0)+1);
                    }
                }
            }
            ArrayList<Map.Entry<String,Integer>> rest=new ArrayList<>();
            for(Map.Entry<String,Integer> xx:mp.entrySet()){
                rest.add(xx);
            }
            Collections.sort(rest,new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> x1,Map.Entry<String,Integer> x2){
                    return x2.getValue().compareTo(x1.getValue());
                }
            });
            for(Map.Entry<String,Integer> t:rest) System.out.println(t.getKey()+" "+t.getValue());
        } catch(Exception ex){
            
        }
    }
}
