import java.util.*;
import java.io.*;

class bd{
    private String masv,ten;
    private double d1,d2,d3;
    public bd(int ma,String ten,double d1,double d2,double d3){
        this.masv="SV"+String.format("%02d", ma);
        this.ten=ten;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        chuanhoahoten();
    }
    private void chuanhoahoten(){
        String[] s=this.ten.trim().toLowerCase().split("\\s+");
        String res="";
        for(String x:s){
            res+=Character.toUpperCase(x.charAt(0));
            res+=x.substring(1);
            res+=" ";
        }
        this.ten=res.trim();
    }
    public double tongdiem(){
        return (d1*3+d2*3+d3*2)/8;
    }

    public String getMasv() {
        return masv;
    }
    
    @Override
    public String toString(){
        return masv+" "+ten+" "+String.format("%.02f",tongdiem());
    }
}
public class J07054 {
    public static void main(String[] args) throws Exception{
        File file=new File("BANGDIEM.in");
        Scanner sc=new Scanner(file);
        ArrayList<bd> a=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            bd b=new bd(i,sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            a.add(b);
        }
        Collections.sort(a,new Comparator<bd>(){
            @Override
            public int compare(bd x,bd y){
                if(Double.compare(x.tongdiem(),y.tongdiem())!=0){
                    return Double.compare(y.tongdiem(),x.tongdiem());
                }
                return x.getMasv().compareTo(y.getMasv());
            }
        });
        int xephang=0,cnt=1;
        double diem=11;
        for(bd x:a){
            if(Double.compare(diem, x.tongdiem())>0){
                xephang=cnt;
                System.out.println(x+" "+xephang);
                diem=x.tongdiem();
            }
            else System.out.println(x+" "+xephang);
            cnt++;
        }
    }
}
