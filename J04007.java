import java.util.*;

class nv1{
    private String manv;
    private String hoten;
    private String gt;
    private String ngsinh;
    private String dc;
    private String mst;
    private String ngaykhd;
    public nv1(String hoten,String gt,String ngsinh,String dc,String mst,String ngaykhd){
       this.manv="00001";
       this.hoten=hoten;
       this.gt=gt;
       this.ngsinh=ngsinh;
       this.dc=dc;
       this.mst=mst;
       this.ngaykhd=ngaykhd;
    }
    @Override
    public String toString(){
        return manv+" "+hoten+" "+gt+" "+ngsinh+" "+dc+" "+mst+" "+ngaykhd;
    
    }
}
public class j04007 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        nv1 a=new nv1(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.print(a.toString());
    }
}
