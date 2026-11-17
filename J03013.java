import java.util.Scanner;

import java.math.BigInteger;
public class J03013 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String s=sc.next();
            String s2=sc.next();
            int len=Math.max(s.length(),s2.length());
            BigInteger num1=new BigInteger(s);
            BigInteger num2=new BigInteger(s2);
            String res=num1.subtract(num2).abs().toString();
            while(res.length()<len){
                res="0"+res;
            }
            System.out.println(res);
        }
    }
}
