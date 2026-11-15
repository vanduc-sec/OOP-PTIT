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
public class j01016 {
    public static boolean check(long n){
        int cnt4=0,cnt7=0;
        while(n!=0){
            long tmp=n%10;
            if(tmp==4) cnt4++;
            else if(tmp==7) cnt7++;
            n/=10;
        }
        if(cnt4+cnt7==4||cnt4+cnt7==7) return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(check(n)==true) System.out.print("YES");
        else System.out.print("NO");
    }
}
