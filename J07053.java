import java.util.*;
import java.io.*;

class xt{
    String matt,hoten,ns;
    double lt,th;
    public xt(int ma,String hoten,String ns,double lt,double th){
        this.matt="PH"+String.format("%02d", ma);
        this.hoten=hoten;
        this.ns=ns;
        this.lt=lt;
        this.th=th;
        chuanhoahoten();
    }
    private void chuanhoahoten(){
        String[] s=this.hoten.trim().toLowerCase().split("\\s+");
        String res="";
        for(String x:s){
            res+=Character.toUpperCase(x.charAt(0));
            res+=x.substring(1);
            res+=" ";
        }
        this.hoten=res.trim();
    }
    public int tuoi(){
        String[] s=this.ns.trim().split("/");
        int x=Integer.parseInt(s[2]);
        return 2021-x;
    }
    public double diemthuong(double x, double y){
        if(Double.compare(x, 8)>=0&&Double.compare(y,8)>=0) return 1;
        else if(Double.compare(x, 7.5)>=0&&Double.compare(y,7.5)>=0) return 0.5;
        return 0;
    }
    public int diemthi(){
        int tong=(int)(this.lt+this.th+2*diemthuong(this.lt,this.th)+1)/2;
        if(tong>10) tong=10;
        return tong;
    }
    public String xeploai(){
        int x=diemthi();
        if(x>=9) return "Xuat sac";
        else if(x>=8) return "Gioi";
        else if(x>=7) return "Kha";
        else if(x>=5) return "Trung binh";
        return "Truot";
    }
    @Override
    public String toString(){
        return matt+" "+hoten+" "+tuoi()+" "+diemthi()+" "+xeploai();
    }
}
public class J07053 {
    public static void main(String[] args) throws Exception{
        File file=new File("XETTUYEN.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<xt> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            xt b=new xt(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            a.add(b);
        }
        for(xt x:a){
            System.out.println(x);
        }
    }
}
