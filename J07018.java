package oopptit;
import java.util.*;
import java.io.*;
class sv{
    private String msv,hoten,ns,lop;
    private float gpa;
    public sv(int x,String hoten,String lop,String ns,float gpa){
        this.msv="B20DCCN"+String.format("%03d",x);
        this.hoten=hoten;
        this.ns=ns;
        this.lop=lop;
        this.gpa=gpa;
        this.chuanhoans();
        this.chuanhoa();
    }
    private void chuanhoans(){
        String[] b=this.ns.split("/");
        this.ns = String.format("%02d/%02d/%02d", Integer.parseInt(b[0]),Integer.parseInt(b[1]),Integer.parseInt(b[2]));
    }
    private void chuanhoa(){
        String[] c=this.hoten.trim().toLowerCase().split("\\s+");
        String res="";
        for(String x:c){
            String res1="";
            res1+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++) res1+=x.charAt(i);
            res+=" "+res1;
        }
        this.hoten=res.trim();
    }
    public String toString(){
        return this.msv+" "+this.hoten+" "+this.lop+" "+this.ns+" "+String.format("%.2f",this.gpa);
    }
}
public class J07018 {
    public static void main(String[] args){
        try {
            File file=new File("SINHVIEN.in");
            Scanner sc=new Scanner(file);
            int n=Integer.parseInt(sc.nextLine());
            ArrayList<sv> s=new ArrayList<>();
            for(int i=1;i<=n;i++){
                sv c=new sv(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine()));
                s.add(c);
            }
            for(sv d:s) System.out.println(d);
        } catch (FileNotFoundException ex) {
        }
        
    }
}
