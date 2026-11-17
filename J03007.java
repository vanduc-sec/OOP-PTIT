import java.util.*;

public class j03007 {
    public static boolean check(String s){
        int n=s.length();
        if(s.charAt(0)!='8'||s.charAt(n-1)!='8') return false;
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        int tong=0;
        for(char x:s.toCharArray()){
            tong+=x-'0';
        }
        return tong%10==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
