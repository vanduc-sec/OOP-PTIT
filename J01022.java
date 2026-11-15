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
public class j01022 {
    public static int check(long a[],int n,long k){       
         if(n==1) return 0;
         if(n==2) return 1;
         if(k<=a[n-2]) return check(a,n-2,k);
         return check(a,n-1,k-a[n-2]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long[] a=new long[93];
            a[0]=0;a[1]=1;
            for(int i=2;i<93;i++) a[i]=a[i-1]+a[i-2];
        while(t!=0){
            t--;
            int n=sc.nextInt();
            long k=sc.nextLong();
            System.out.println(check(a,n,k));
        }
    }
}
