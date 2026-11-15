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
public class j01011 {
    public static long ucln(long a,long b){
        while(b!=0){
            long tmp=a;
            a=b;
            b=tmp%b;
        }
        return a;
    }
    public static long bcnn(long a,long b){
        return a*b/ucln(a,b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long a=sc.nextLong(),b=sc.nextLong();
            System.out.println(bcnn(a,b)+" "+ucln(a,b));
        }
    }
}
