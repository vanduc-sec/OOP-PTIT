import java.util.*;
import java.io.*;
class sv{
    private String msv,hoten,lop,ns;
    private float gpa;
    public sv(String msv,String hoten,String lop,String ns,float gpa){
        
        this.msv=msv;
        this.hoten=hoten;
        this.lop=lop;
        this.ns=ns;
        this.gpa=gpa;
    }
    public void chuanhoans(){
        String[] tmp=this.ns.trim().split("/");
        String res="";
        
         res+=String.format("%02d/%02d/%4d",Integer.parseInt(tmp[0]),Integer.parseInt(tmp[1]),Integer.parseInt(tmp[2]));
       
        this.ns=res;
    }
    
    public String toString(){
        return this.msv+" "+this.hoten+" "+this.lop+" "+this.ns+" "+String.format("%.2f",this.gpa);
    }
}
public class j07010 {
    public static void main(String[] args){
        try{
            File file=new File("SV.in");
            Scanner sc=new Scanner(file);
            int t=Integer.parseInt(sc.nextLine());
            ArrayList<sv> sinhvien=new ArrayList<>();
            for(int i=1;i<=t;i++){
                String mahs="B20DCCN"+String.format("%03d", i);
                sv a=new sv(mahs,sc.nextLine(),sc.nextLine(),sc.nextLine(),Float.parseFloat(sc.nextLine().trim()));
                a.chuanhoans();
                sinhvien.add(a);
            }
            for(sv tm:sinhvien) System.out.println(tm);
        }catch(Exception ex){
            
        }
    }
}
