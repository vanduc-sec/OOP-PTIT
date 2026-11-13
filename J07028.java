import java.util.*;
import java.io.*;

class mh{
    private String mamh,tenmh;
    public mh(String mamh,String tenmh){
        this.mamh=mamh;
        this.tenmh=tenmh;
    }
}
class gv{
    private String magv,tengv;
    public gv(String magv,String tengv){
        this.magv=magv;
        this.tengv=tengv;
    }

    public String getMagv() {
        return magv;
    }

    public String getTengv() {
        return tengv;
    }
    
}
class gc{
    private String magv,mamh;
    private float gioc;
    public gc(String magv,String mamh,float gioc){
        this.magv=magv;
        this.mamh=mamh;
        this.gioc=gioc;
    }

    public String getMagv() {
        return magv;
    }

    public String getMamh() {
        return mamh;
    }

    public float getGioc() {
        return gioc;
    }
    
}
public class J07028 {
    public static void main(String[] args) throws Exception{
        File file1=new File("MONHOC.in");
        File file2=new File("GIANGVIEN.in");
        File file3=new File("GIOCHUAN.in");
        Scanner sc1=new Scanner(file1);
        Scanner sc2=new Scanner(file2);
        Scanner sc3=new Scanner(file3);
        ArrayList<mh> a=new ArrayList<>();
        ArrayList<gv> b=new ArrayList<>();
        ArrayList<gc> c=new ArrayList<>();
        int t=Integer.parseInt(sc1.nextLine());
        while(t>0){
            t--;
            String s=sc1.nextLine().trim();
            String[] s1=s.split("\\s+",2);
            mh monhoc=new mh(s1[0],s1[1]);
            a.add(monhoc);
        }
        t=Integer.parseInt(sc2.nextLine());
        while(t>0){
            t--;
            String s=sc2.nextLine().trim();
            String[] s2=s.split("\\s+",2);
            gv giangvien=new gv(s2[0],s2[1]);
            b.add(giangvien);
        }
        t=Integer.parseInt(sc3.nextLine());
        while(t>0){
            t--;
            gc giochuan=new gc(sc3.next(),sc3.next(),sc3.nextFloat());
            c.add(giochuan);
        }
        HashMap<String,Float> d=new HashMap<>();
        for(gc x:c){
            d.put(x.getMagv(),d.getOrDefault(x.getMagv(),(float)0)+x.getGioc());
            
        }
        for(gv y:b){
            float res=d.getOrDefault(y.getMagv(),(float)0);
            System.out.printf("%s %.2f\n",y.getTengv(),res);
        }
    }
}
