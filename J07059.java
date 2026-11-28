import java.util.*;
import java.io.*;

class ct{
    private String mact,nt,gt,pt;
    public ct(int i,String nt,String gt,String pt){
        this.mact="C"+String.format("%03d", i);
        this.nt=nt;
        this.gt=gt;
        this.pt=pt;
    }
    public String ngaythi(){
        String[] s=this.nt.trim().split("/");
        return s[2]+s[1]+s[0];
    }
    public int giothi(){
        String[] s=this.gt.trim().split(":");
        return Integer.parseInt(s[0])*60+Integer.parseInt(s[1]);
    }
    public String getMact(){
        return mact;
    }
    @Override
    public String toString(){
        return mact+" "+nt+" "+gt+" "+pt;
    }
}
public class J07059 {
    public static void main(String[] args) throws Exception{
        File file=new File("CATHI.in");
        Scanner sc=new Scanner(file);
        ArrayList<ct> a=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=t;i++){
            ct b=new ct(i,sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(b);
        }
        Collections.sort(a,new Comparator<ct>(){
            @Override
            public int compare(ct x,ct y){
                if(x.ngaythi().compareTo(y.ngaythi())!=0)
                    return x.ngaythi().compareTo(y.ngaythi());
                if(x.giothi()!=y.giothi()) return x.giothi()-y.giothi();
                return x.getMact().compareTo(y.getMact());
            }
        });
        for(ct x:a) System.out.println(x);
    }
}
