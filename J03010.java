import java.util.*;

public class j03010 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        TreeMap<String,Integer> mp=new TreeMap<>();
        while(t>0){
            t--;
            String s=sc.nextLine();
            String[] s1=s.trim().toLowerCase().split("\\s+");
            String res="";
            res+=s1[s1.length-1];
            for(int i=0;i<s1.length-1;i++){
                res+=s1[i].charAt(0);
            }
            if(mp.containsKey(res)){
                mp.put(res,mp.get(res)+1);
            }
            else mp.put(res,1);
            if(mp.get(res)==1) 
            res+="@ptit.edu.vn";
            else res+=mp.get(res)+"@ptit.edu.vn";
            System.out.println(res);
        }
    }
}
