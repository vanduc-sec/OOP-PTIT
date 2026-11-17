import java.util.*;

class hs{
    private String mahs;
    private String hoten;
    private float toan;
    private float ly;
    private float hoa;
    public hs(String mahs,String hoten,float toan,float ly,float hoa){
        this.mahs=mahs;
        this.hoten=hoten;
        this.toan=toan;
        this.ly=ly;
        this.hoa=hoa;
    }
    public float dut(){
        String tmp=this.mahs.substring(0, 3);
        if(tmp.equals("KV1")) return (float)0.5;
        else if(tmp.equals("KV2")) return 1;
        return (float)2.5;
    }
    public static String chuanhoa(float x){
        int res=(int)x;
        if(res==x) return res+"";
        return x+"";
    }
    @Override
    public String toString(){
        float res=this.toan*2+this.hoa+this.ly;
        String tmp="";
        if(res+this.dut()>=24) tmp+="TRUNG TUYEN";
        else tmp+="TRUOT";
        return this.mahs+" "+this.hoten+" "+chuanhoa(this.dut())+" "+chuanhoa(res)+" "+tmp;
    }
}
public class j04013 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        hs a=new hs(sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine().trim()),Float.parseFloat(sc.nextLine().trim()),Float.parseFloat(sc.nextLine().trim()));
        System.out.print(a.toString());
    }
}
