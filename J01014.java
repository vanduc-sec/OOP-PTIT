/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class j01014 {
    public static long check(long n){
        long tmp=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                tmp=i;
                while(n%i==0) n/=i;
            }
        }
        if(n>1) tmp=n;
        return tmp;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long n=sc.nextLong();
            System.out.println(check(n));
        }
    }
}
