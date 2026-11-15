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

public class j01010 {
    public static String check(String n){
        String kq="";
        for(int i=0;i<n.length();i++){
            char tmp=n.charAt(i);
            if(tmp=='0'||tmp=='8'||tmp=='9') kq+="0";
            else if(tmp=='1') kq+="1";
            else return "INVALID";
        }
        kq=kq.replaceFirst("^0+","");
        if(kq.length()==0) return "INVALID";
        return kq;
           
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            String n=sc.next();
            System.out.println(check(n));
        }
    }
}
