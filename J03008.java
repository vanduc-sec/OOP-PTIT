import java.util.*;

public class j03008 {
    public static boolean check(String s){
        int n=s.length();
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)) return false;
        }
        for(char x:s.toCharArray()){
            if(x!='2'&&x!='3'&&x!='5'&&x!='7') return false;
        }
        return true;
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
