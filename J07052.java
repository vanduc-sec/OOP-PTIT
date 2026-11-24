import java.util.*;
import java.io.*;

class ts{
    private String mats,hoten;
    private double toan,ly,hoa;
    public ts(String mats,String hoten,double toan,double ly,double hoa){
        this.mats=mats;
        this.hoten=hoten;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
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
    public double tongdiem(){
        return toan*2+ly+hoa+diemuutien();
    }
    public double diemuutien(){
        String c=this.mats.substring(0,3);
        if(c.equals("KV1")) return 0.5;
        else if(c.equals("KV2")) return 1.0;
        else return 2.5;
    }

    public String getMats() {
        return mats;
    }
    private String chuanhoa(double d){
        if(d==(int)d) return String.format("%.0f",d);
        return String.format("%.1f",d);
    }
    @Override
    public String toString(){
        return mats+" "+hoten+" "+chuanhoa(diemuutien())+" "+chuanhoa(tongdiem())+" ";
    }
}
public class J07052 {
    public static void main(String[] args) throws Exception{
        File file=new File("THISINH.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ts> a=new ArrayList<>();
        while(t-->0){
            ts b=new ts(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
            a.add(b);
        }
        int chitieu=sc.nextInt();
        Collections.sort(a,new Comparator<ts>(){
            @Override
            public int compare(ts x,ts y){
                if(Double.compare(x.tongdiem(),y.tongdiem())!=0)
                    return Double.compare(y.tongdiem(),x.tongdiem());
                return x.getMats().compareTo(y.getMats());
            }
        });
        double diemchuan=a.get(Math.min(chitieu,a.size())-1).tongdiem();
        System.out.printf("%.1f\n",diemchuan);
        for(ts x:a){
            if(Double.compare(x.tongdiem(),diemchuan)>=0){
                System.out.println(x+"TRUNG TUYEN");
            }
            else{
                System.out.println(x+"TRUOT");
            }
        }
    }
}
