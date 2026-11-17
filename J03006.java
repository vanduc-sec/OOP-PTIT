import java.util.*;

public class j03006 {
    public static boolean check(String s){
        for(int i=0;i<=s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            if((int)s.charAt(i)%2==1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s=sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
