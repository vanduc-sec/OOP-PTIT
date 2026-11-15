/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class j01024 {
    public static boolean check(int n){
        while(n>0){
            int tmp=n%10;
            if(tmp!=1&&tmp!=2&&tmp!=0) return false;
            n/=10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0){
            t--;
            int n=sc.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
