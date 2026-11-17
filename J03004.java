import java.util.*;

public class j03004 {
    public static String chuanhoa(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(0,(char)(s.charAt(0)-32));
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
            String[] tmp=s.trim().toLowerCase().split("\\s+");
            String kq="";
            for(String x:tmp){
                kq+=" ";
                kq+=chuanhoa(x);
            }
            kq=kq.trim();
            System.out.println(kq);
        }
    }
}
