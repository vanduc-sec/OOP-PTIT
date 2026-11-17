import java.util.*;

public class j03009 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
            String s2=sc.nextLine();
            TreeMap<String,Integer> mp=new TreeMap<>();
            String[] s3=s.trim().split("\\s+");
            String[] s4=s2.trim().split("\\s+");
            for(int i=0;i<s3.length;i++){
                if(!mp.containsKey(s3[i])){
                    mp.put(s3[i], 1);
                }
                 
            }
            for(int i=0;i<s4.length;i++){
                if(mp.containsKey(s4[i])){
                    mp.put(s4[i],2);
                }               
            }
            for(Map.Entry<String,Integer> entry:mp.entrySet()){
                if(entry.getValue()==1) System.out.print(entry.getKey()+" ");
            }
            System.out.println("");
        }
    }
}
