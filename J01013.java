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
public class j01013 {
    static int[] a=new int[2000005];
    public static void nto(){
        for(int i=1;i<2000005;i++) a[i]=i;
        for(int i=2;i<=Math.sqrt(2000005);i++){
            if(a[i]==i){
                for(int j=i*i;j<2000005;j+=i){
                    if(a[j]==j)
                    a[j]=i;
                }
            }
        }
    }
    public static int check(int n){
        int cnt=0;
            while(n>1){
                cnt+=a[n];
                n/=a[n];
            }
        if(n>1) cnt+=n;
        return cnt;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    nto();
    int t=sc.nextInt();
    long kq=0;
    for(int i=1;i<=t;i++){
        int n=sc.nextInt();
        kq+=check(n);
    }
    System.out.print(kq);
}
}
