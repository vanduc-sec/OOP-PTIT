import java.util.*;

class thisinh{
    private String hoten;
    private String ngsinh;
    private double d1,d2,d3;
    public thisinh(String ten,String ngay,double d1,double d2,double d3){
        this.hoten=ten;
        this.ngsinh=ngay;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgsinh() {
        return ngsinh;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public double getD3() {
        return d3;
    }
    

    
    
}
public class j04005 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        thisinh a=new thisinh(sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine()));
        System.out.printf("%s %s %.1f",a.getHoten(),a.getNgsinh(),a.getD1()+a.getD2()+a.getD3());
    }
    }
