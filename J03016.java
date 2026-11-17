import java.util.*;
import java.math.BigInteger;

public class j03016 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
//            int sum=0;
//            for(int i=0;i<s.length();i++){
//                if(i%2==0) sum+=s.charAt(i)-'0';
//                else sum-=s.charAt(i)-'0';
//            }
//            if(sum%11==0) System.out.println(1);
//            else System.out.println(0);
//////////////////CÁCH 2/////////////////////////
            BigInteger s1=new BigInteger(s);
            if(s1.mod(new BigInteger("11")).equals(new BigInteger("0"))){
                System.out.println(1);
            }
            else System.out.println(0);
        }
    }
}
