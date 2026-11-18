package oopptit;
import java.util.*;
import java.io.*;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String kh,tenp;
    private int dg;
    private float phi;
    public LoaiPhong(String s){
        String[] t=s.trim().split("\\s+");
        String kh=t[0];
        String tenp=t[1];
        int dg=Integer.parseInt(t[2]);
        float phi=Float.parseFloat(t[3]);
        this.kh=kh;
        this.dg=dg;
        this.tenp=tenp;
        this.phi=phi;
    }
    @Override
    public int compareTo(LoaiPhong x){
        return this.tenp.compareTo(x.tenp);
    }
    @Override
    public String toString(){
        return kh+" "+tenp+" "+dg+" "+phi;
    }
}
public class J07045 {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
