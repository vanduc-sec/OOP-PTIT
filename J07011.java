import java.util.*;
import java.io.*;

public class J07011 {
    public static void main(String[] args){
        try {
            File file=new File("VANBAN.in");
            Scanner sc=new Scanner(file);
            TreeMap<String,Integer> mp=new TreeMap<>();
            ArrayList<Map.Entry<String,Integer>> al=new ArrayList<>();
            Integer n=Integer.parseInt(sc.nextLine());
            for(int i=0;i<n;i++){
                String t=sc.nextLine();
                String[] s=t.trim().toLowerCase().split("[^a-z0-9]+");
                for(int j=0;j<s.length;j++){
                    if(s[j].isEmpty()) continue;
                    if(mp.containsKey(s[j])){
                        mp.put(s[j], mp.get(s[j])+1);
                    }
                    else{
                        mp.put(s[j], 1);
                    }
                }                
            }
            for(Map.Entry<String,Integer> x : mp.entrySet()){
                al.add(x);
            }
            Collections.sort(al,new Comparator<Map.Entry<String,Integer>>(){
                public int compare(Map.Entry<String,Integer> x,Map.Entry<String,Integer> y){                    
                    return y.getValue().compareTo(x.getValue());
                }                    
            });
            for(Map.Entry<String,Integer> x:al){
                System.out.println(x.getKey()+" "+x.getValue());
            }
        } catch (FileNotFoundException ex) {
            }        
    }
}
