package oopptit;
import java.util.*;
import java.io.*;
public class J07021 {
    public static String chuanhoa(String s){
            String[] t=s.trim().toLowerCase().split("\\s+");
            String res="";
            for(String x:t){
                res+=Character.toUpperCase(x.charAt(0));
                res+=x.substring(1)+" ";
            }
            return res.trim();
        }
    public static void main(String[] args){       
        try {
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            while(true){
                String s=sc.nextLine();
                if(s.equals("END")) break;
                else{
                    s=chuanhoa(s);
                    System.out.println(s);
                }
            }
        } catch (FileNotFoundException ex) {
        }
    }
}
