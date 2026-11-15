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
public class j01021 {
    public static long luythua(long a,long b){
        if(b==0) return 1;
        long tmp=luythua(a,b/2)%1000000007;
        long res=(tmp*tmp)%1000000007;
        if(b%2!=0){
            res=(res*(a%1000000007))%1000000007;
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==0&&b==0) return;
            System.out.println(luythua(a,b));
        }
    }
}
