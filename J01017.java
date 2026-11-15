/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;

/**
 *
 * @author Admin
 */
import java.util.*;
public class j01017 {
    public static boolean check(long n){
        long tmp1=n%10;
        n/=10;
        long tmp2;
        while(n>=10){
            tmp2=n%10;
            n/=10;
           if(Math.abs(tmp1-tmp2)!=1) return false;
           tmp1=tmp2;
        }
        tmp2=n;
        return Math.abs(tmp1-tmp2) == 1;
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
