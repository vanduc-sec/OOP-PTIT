
import java.util.*;

class gv{
    private String mngach;
    private String hoten;
    private int lcb;
    public gv(String mn,String hoten,int lcb){
        this.mngach=mn;
        this.hoten=hoten;
        this.lcb=lcb;
    }
    public int pc(){
        String res=this.mngach.substring(0,2);
        if(res.equals("HT")) return 2000000;
        else if(res.equals("HP")) return 900000;
        return 500000;
    }
    public int bl(){
        return Integer.parseInt(this.mngach.substring(2));
    }
    @Override
    public String toString(){
        int res=this.lcb*this.bl()+this.pc();
        return this.mngach+" "+this.hoten+" "+this.bl()+" "+this.pc()+" "+res;
    }
}
public class j04015 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        gv a=new gv(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine().trim()));
        System.out.print(a.toString());
    }
}
