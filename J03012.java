import java.util.*;

import java.math.BigInteger;
public class j03012 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            BigInteger num1= sc.nextBigInteger();
            BigInteger num2=sc.nextBigInteger();
            System.out.println(num1.add(num2));
        }
    }
}
