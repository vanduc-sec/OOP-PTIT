import java.util.*;
import java.io.*;

class kh{
    private String makh,tenkh,gt,ns,dc;
    public kh(int makh,String tenkh,String gt,String ns,String dc){
        this.makh="KH"+String.format("%03d",makh);
        this.tenkh=tenkh;
        this.gt=gt;
        this.ns=ns;
        this.dc=dc;
    }
    public String getMakh(){
        return this.makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getDc() {
        return dc;
    }
    
}
class mh{
    private String mamh,tenmh,dvi;
    private int giamua,giaban;
    public mh(int mamh,String tenmh,String dvi,int giamua,int giaban){
        this.mamh="MH"+String.format("%03d",mamh);
        this.tenmh=tenmh;
        this.dvi=dvi;
        this.giamua=giamua;
        this.giaban=giaban;
    }

    public String getMamh() {
        return mamh;
    }

    public String getTenmh() {
        return tenmh;
    }

    public String getDvi() {
        return dvi;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
    
}
class hd{
    private String mahd,khachhang,mathang;
    private int soluong;
    public hd(int mahd,String kh,String mh,int soluong){
        this.mahd="HD"+String.format("%03d",mahd);
        this.khachhang=kh;
        this.mathang=mh;
        this.soluong=soluong;
    }

    public String getKhachhang() {
        return khachhang;
    }

    public String getMathang() {
        return mathang;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getMahd() {
        return mahd;
    }
    
}
public class J07020 {
    public static void main(String[] args){
        try {
            File file1=new File("KH.in");
            File file2=new File("MH.in");
            File file3=new File("HD.in");
            Scanner sc1=new Scanner(file1);
            Scanner sc2=new Scanner(file2);
            Scanner sc3=new Scanner(file3);
            ArrayList<kh> khachhang=new ArrayList<>();
            int n1=Integer.parseInt(sc1.nextLine());
            for(int i=1;i<=n1;i++){
                kh a=new kh(i,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
                khachhang.add(a);
            }
            int n2=Integer.parseInt(sc2.nextLine());
            ArrayList<mh> mathang=new ArrayList<>();
            for(int i=1;i<=n2;i++){
                mh b=new mh(i,sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()),Integer.parseInt(sc2.nextLine()));
                mathang.add(b);
            }
            int n3=Integer.parseInt(sc3.nextLine());
            ArrayList<hd> hoadon=new ArrayList<>();
            for(int i=1;i<=n3;i++){
                hd c=new hd(i,sc3.next(),sc3.next(),sc3.nextInt());
                hoadon.add(c);
            }
            for(hd x:hoadon){
                String ten="",diachi="";
                for(kh y:khachhang){
                    if(x.getKhachhang().equals(y.getMakh())){
                        ten=y.getTenkh();
                        diachi=y.getDc();
                    }
                }
                String tenmh="",dvi="";
                int gimua=0,giban=0;
                for(mh z:mathang){
                    if(x.getMathang().equals(z.getMamh())){
                        tenmh=z.getTenmh();
                        dvi=z.getDvi();
                        gimua=z.getGiamua();
                        giban=z.getGiaban();
                    }
                }
                String res=x.getMahd()+" "+ten+" "+diachi+" "+tenmh+" "+dvi+" "+gimua+" "+giban+" "+x.getSoluong()+" "+(long)giban*x.getSoluong();
                System.out.println(res);
            }
        } catch (FileNotFoundException ex) {
        }
    }
}
