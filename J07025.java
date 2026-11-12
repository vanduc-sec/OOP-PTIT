import java.util.*;
import java.io.*;

class kh{
    private String makh,tenkh,gt,ns,dc;
    public kh(int ma,String ten,String gt,String ns,String dc){
        this.makh="KH"+String.format("%03d",ma);
        this.tenkh=ten;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
        this.chuanhoaten();
        chuanhoans();
    }
    public void chuanhoaten(){
        String[] s=this.tenkh.trim().toLowerCase().split("\\s+");
        String res="";
        for(String x:s){
            res+=Character.toUpperCase(x.charAt(0));
            for(int i=1;i<x.length();i++) res+=x.charAt(i);
            res+=" ";
        }
        this.tenkh=res.trim();
    }
    private void chuanhoans(){
        String[] s=this.ns.split("/");
        this.ns=String.format("%02d/%02d/%04d",Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
    }
    public String biendoins(){
        String res="";
        String[] s=this.ns.split("/");
        res+=s[2]+s[1]+s[0];
        return res;
    }
    public String toString(){
        return this.makh+" "+this.tenkh+" "+this.gt+" "+this.dc+" "+this.ns;
    }
}
public class J07025 {
    public static void main(String[] args) throws Exception{
        File file=new File("KHACHHANG.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<kh> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            kh khachhang=new kh(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(khachhang);
        }
        Collections.sort(a,new Comparator<kh>(){
            @Override
            public int compare(kh a,kh b){
                return a.biendoins().compareTo(b.biendoins());
            }
        });
        for(kh x:a) System.out.println(x);
    }
}
