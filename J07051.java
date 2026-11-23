import java.util.*;
import java.io.*;
import java.text.*;

class kh{
    private String makh,tenkh,sop,nnp,ntp;
    private int tdv;
    public kh(int ma,String tenkh,String sop,String nnp,String ntp,int tdv){
        this.makh="KH"+String.format("%02d", ma);
        this.tenkh=tenkh;
        this.sop=sop;
        this.nnp=chuanhoangay(nnp);
        this.ntp=chuanhoangay(ntp);
        this.tdv=tdv;
        chuanhoahoten();
    }
    private void chuanhoahoten(){
        String res="";
        String[] s=this.tenkh.trim().toLowerCase().split("\\s+");
        for(String x:s){
            res+=Character.toUpperCase(x.charAt(0));
            res+=x.substring(1);
            res+=" ";
        }
        this.tenkh=res.trim();
    }
    private String chuanhoangay(String ngay){
        
        String[] s=ngay.trim().split("/");
        String res=String.format("%02d/%02d/%04d",Integer.parseInt(s[0]),Integer.parseInt(s[1]),Integer.parseInt(s[2]));
        return res.trim();
     }
    public int songayo(){
        try{
        SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
        Date d1=date.parse(this.nnp);
        Date d2=date.parse(this.ntp);
        return (int)((d2.getTime()-d1.getTime())/(1000*60*60*24))+1;
        }catch(Exception x){
            return 0;
        }
    }
    public int tongtien(){
        String c=sop.substring(0,1);
        int gia=0;
        if(c.equals("1")) gia=25;
        else if(c.equals("2")) gia=34;
        else if(c.equals("3")) gia=50;
        else if(c.equals("4")) gia=80;
        return tdv+gia*this.songayo();
    } 
    @Override
    public String toString(){
        return makh+" "+tenkh+" "+sop+" "+this.songayo()+" "+this.tongtien();
    }
}
public class J07051 {
    public static void main(String[] args) throws Exception{
        File file=new File("KHACHHANG.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<kh> a=new ArrayList<>();
        for(int i=1;i<=t;i++){
            kh b=new kh(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            a.add(b);
        }
        Collections.sort(a,new Comparator<kh>(){
            @Override
            public int compare(kh x,kh y){
                return y.tongtien()-x.tongtien();
            }
        });
        for(kh x:a) System.out.println(x);
    }
}
