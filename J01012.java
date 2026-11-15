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
public class j01012 {
    public static int check(int n){
        int cnt=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i%2==0) cnt++;
                int tmp=n/i;
                if(tmp*tmp!=n){
                    if(tmp%2==0) cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0){
    t--;
    int n=sc.nextInt();
    System.out.println(check(n));
}
    }
    
}
