import java.util.*;

final class sinhvien{
    private String masv;
    private String hoten;
    private String lop;
    private String ngsinh;
    private double gpa;
    public sinhvien(){
        this.masv="B20DCCN001";
        this.hoten="";
        this.lop="";
        this.ngsinh="";
        this.gpa=0;
    }

    public sinhvien(String hoten, String lop,String ngsinh, double gpa) {
        this.masv="B20DCCN001";
        this.hoten = hoten;
        this.lop = lop;
        this.ngsinh=this.chuanhoangasinh(ngsinh);
        this.gpa = gpa;
    }
    
    public String chuanhoangasinh(String ngsinh){
        String[] res=ngsinh.trim().split("/");
        for(int i=0;i<=1;i++){
            if(res[i].length()==1) res[i]="0"+res[i];
        }
        String tmp=res[0]+"/"+res[1]+"/"+res[2];
        return tmp;
    }
    @Override
    public String toString(){
      return masv+" "+hoten+" "+lop+" "+ngsinh+" "+String.format("%.2f", gpa);  
    }
    public double getGpa(){
        return gpa;
    }
    public void setNgsinh(String ngsinh){
        this.ngsinh=ngsinh;
    }
}
public class j04006 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sinhvien sv=new sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine().trim()));
        System.out.print(sv.toString());
    }
}
