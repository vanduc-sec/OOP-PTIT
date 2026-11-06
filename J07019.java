import java.util.*;
import java.io.*;

class qa{
    private String ml,tsp;
    private int l1,l2;
    public qa(String ml,String tsp,int l1,int l2){
        this.ml=ml;
        this.tsp=tsp;
        this.l1=l1;
        this.l2=l2;
    }
    public long thanhtien(char c,int x){
        if(c=='1') return (long)this.l1*x;
        return (long)this.l2*x;
    }
    public long giamgia(char c,int x){
        long tien=this.thanhtien(c, x);
        if(x>=150) return (long)(tien*0.5);
        else if(x>=100) return (long)(tien*0.3);
        else if(x>=50) return (long)(tien*0.15);
        return 0;
    }

    public String getMl() {
        return ml;
    }

    public String getTsp() {
        return tsp;
    }
    
}
public class J07019 {
    public static void main(String[] args){
        try{
            File file1=new File("DATA1.in");
            File file2=new File("DATA2.in");
            Scanner sc1=new Scanner(file1);
            Scanner sc2=new Scanner(file2);
            ArrayList<qa> a=new ArrayList<>();
            int n=Integer.parseInt(sc1.nextLine());
            for(int i=0;i<n;i++){
                qa quanao=new qa(sc1.nextLine(),sc1.nextLine(),Integer.parseInt(sc1.nextLine()),Integer.parseInt(sc1.nextLine()));
                a.add(quanao);
            }
            int t=Integer.parseInt(sc2.nextLine());
            for(int i=1;i<=t;i++){
                String msd=sc2.next();
                int sl=sc2.nextInt();
                String maloai=msd.substring(0,2);
                char loai=msd.charAt(2);
                qa timsp=null;
                for(qa x:a){
                    if(x.getMl().equals(maloai)){
                        timsp=x;
                        break;
                    }
                }
                if(timsp!=null){
                    long tiengiam=timsp.giamgia(loai,sl);
                    long tongtien=timsp.thanhtien(loai, sl);
                    long tientra=tongtien-tiengiam;
                    System.out.println(msd+"-"+String.format("%03d",i)+" "+timsp.getTsp()+" "+tiengiam+" "+tientra);
                }
            }
            
        }catch(Exception ex){
            
        }
    }
}
