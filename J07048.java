import java.util.*;
import java.io.*;

class sp{
    private String masp,tensp;
    private int giaban,bh;
    public sp(String masp,String tensp,int giaban,int bh){
        this.masp=masp;
        this.tensp=tensp;
        this.giaban=giaban;
        this.bh=bh;
    }
    @Override
    public String toString(){
        return masp+" "+tensp+" "+giaban+" "+bh;
    }

    public String getMasp() {
        return masp;
    }

    public int getGiaban() {
        return giaban;
    }
    
}
public class J07048 {
    public static void main(String[] args) throws Exception{
        File file=new File("SANPHAM.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sp> a=new ArrayList<>();
        while(t-->0){
            sp b=new sp(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            a.add(b);
        }
        Collections.sort(a,new Comparator<sp>(){
            @Override
            public int compare(sp x,sp y){
                if(x.getGiaban()!=y.getGiaban()) return y.getGiaban()-x.getGiaban();
                return x.getMasp().compareTo(y.getMasp());
            }
        });
        for(sp x:a) System.out.println(x);
    }
}
