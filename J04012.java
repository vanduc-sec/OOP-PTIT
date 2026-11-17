import java.util.*;

class nv{
    private String manv;
    private String hoten;
    private int lcb;
    private int snc;
    private String cv;
    public nv(String hoten,int lcb,int snc,String cv){
        this.hoten=hoten;
        this.lcb=lcb;
        this.snc=snc;
        this.cv=cv;
    }
    public int tienthuong(int luong,int nc){
        if(nc>=25) return 20*luong*nc/100;
        else if(nc>=22) return 10*luong*nc/100;
        else return 0;
    }
    public int phucap(String chucvu){
        if(chucvu.equals("GD")) return 250000;
        else if(chucvu.equals("PGD")) return 200000;
        else if(chucvu.equals("TP")) return 180000;
        return 150000;
    }
    public void setManv(String x){
        this.manv=x;
    }
    @Override
    public String toString(){
        int tt=this.tienthuong(lcb, snc);
        int pc=this.phucap(cv);
        int tong=this.lcb*this.snc+tt+pc;
        return manv+" "+hoten+" "+this.lcb*this.snc+" "+tt+" "+pc+" "+tong;
    }
}
public class j04012 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        nv a=new nv(sc.nextLine(),Integer.parseInt(sc.nextLine().trim()),Integer.parseInt(sc.nextLine().trim()),sc.nextLine());
        a.setManv("NV01");
        System.out.print(a.toString());
    }
}
