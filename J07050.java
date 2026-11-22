import java.util.*;
import java.io.*;

class mh{
    private String mah,tenhang,nhomhang;
    private double giamua,giaban;
    public mh(int mah,String tenhang,String nhomhang,double giamua,double giaban){
        this.mah="MH"+String.format("%02d", mah);
        this.tenhang=tenhang;
        this.nhomhang=nhomhang;
        this.giamua=giamua;
        this.giaban=giaban;
    }
    public double loinhuan(){
        return giaban-giamua;
    }
    @Override
    public String toString(){
        return mah+" "+tenhang+" "+nhomhang+" "+String.format("%.02f",this.loinhuan());
    };
}
public class J07050 {
    public static void main(String[] args) throws Exception{
        File file=new File("MATHANG.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<mh> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            mh b=new mh(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            a.add(b);
        }
        Collections.sort(a,new Comparator<mh>(){
            @Override
            public int compare(mh x,mh y){
               return Double.compare(y.loinhuan(),x.loinhuan());
            }
        });
        for(mh x:a) System.out.println(x);
    }
}
