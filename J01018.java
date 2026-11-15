/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;

/**
 *
 * @author Admin
 */import java.util.*;
public class j01018 {
    public static boolean check(long n){
        long cnt=0;
        long tmp1=n%10;
        cnt+=tmp1;
        n/=10;
        long tmp2;
        while(n!=0){
            tmp2=n%10;
            cnt+=tmp2;
            if(Math.abs(tmp1-tmp2)!=2) return false;
            tmp1=tmp2;
            n/=10;
        }
        return cnt%10==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            long n=sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
