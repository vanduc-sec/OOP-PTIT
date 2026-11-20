import java.util.*;
import java.io.*;
import java.text.*;


class ks{
    private String khloaiphong,tenp;
    private int dongiangay;
    private double phipvu;
    public ks(String kh,String tenp,int dongiangay,double phi){
        this.khloaiphong=kh;
        this.tenp=tenp;
        this.dongiangay=dongiangay;
        this.phipvu=phi;
    }
    public double tienpvu(){
        return this.dongiangay*this.phipvu;
    }

    public String getKhloaiphong() {
        return khloaiphong;
    }

    public int getDongiangay() {
        return dongiangay;
    }

    public double getPhipvu() {
        return phipvu;
    }
    
    
}
class kh{
    private String makh,hoten,maphong,ngayden,ngaydi;
    public kh(int makh,String hoten,String maphong,String ngayden,String ngaydi){
        this.makh="KH"+String.format("%02d",makh);
        this.hoten=hoten;
        this.maphong=maphong;
        this.ngayden=ngayden;
        this.ngaydi=ngaydi;
    }
    public int tongngay(){
        SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date ngayden=date.parse(this.ngayden);
            Date ngaydi=date.parse(this.ngaydi);
            return (int)((ngaydi.getTime()-ngayden.getTime())/(1000*60*60*24));
        }catch(Exception x){
            return 0;
        }
    }
    public double giamgia(){
        int ngay=this.tongngay();
        if(ngay>=30) return 0.06;
        else if(ngay>=20) return 0.04;
        else if(ngay>=10) return 0.02;
        return 0;
    }

    public String getMaphong() {
        return maphong;
    }
    public String toString(){
        return makh+" "+hoten+" "+maphong;
    }
}
public class J07047 {
    public static void main(String[] args) throws Exception{
        ArrayList<ks> a=new ArrayList<>();
        ArrayList<kh> d=new ArrayList<>();
        File file=new File("DATA.in");
        Scanner sc=new Scanner(file);
        int t1=Integer.parseInt(sc.nextLine());
        while(t1-->0){
            ks b=new ks(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble());
            a.add(b);
        }
        sc.nextLine();
        int t2=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t2;i++){
            kh c=new kh(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            d.add(c);
        }
        Collections.sort(d,new Comparator<kh>(){
            @Override
            public int compare(kh x,kh y){
                return y.tongngay()-x.tongngay();
            }
        });
        for(kh x:d){
            int songay=x.tongngay();
            int tongngaytratien=1;
            if(songay!=0) tongngaytratien=songay;
            for(ks y:a){
                if(y.getKhloaiphong().equals(x.getMaphong().substring(2,3))){
                    Double tongtien=tongngaytratien*y.getDongiangay()*(1+y.getPhipvu())*(1-x.giamgia());
                    System.out.println(x+" "+songay+" "+String.format("%.02f",tongtien));
                }
            }
        }
    }
}
