import java.util.*;

public class j03005 {
    public static String chuanhoa(String s){
        StringBuilder tmp=new StringBuilder(s);
        tmp.setCharAt(0, (char)(s.charAt(0)-32));
        return tmp.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
            String[] s1=s.trim().toLowerCase().split("\\s+");
            String kq="";
            for(int i=1;i<s1.length;i++){
                kq+=" "+chuanhoa(s1[i]);
            }
            kq+=", "+ s1[0].toUpperCase();
            kq=kq.trim();
            System.out.println(kq);
        }
    }
}
