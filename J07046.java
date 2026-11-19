import java.util.*;
import java.io.*;
import java.text.*;

class ks{
    private String makh,hoten,map,ngayden,ngaydi;
    public ks(int i,String hoten,String map,String ngayden,String ngaydi){
        this.makh="KH"+String.format("%02d",i);
        this.hoten=hoten;
        this.map=map;
        this.ngayden=ngayden;
        this.ngaydi=ngaydi;
    }
    public int songayluutru(){
        SimpleDateFormat day=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date ngayden=day.parse(this.ngayden);
            Date ngaydi=day.parse(this.ngaydi);
            return (int)((ngaydi.getTime()-ngayden.getTime())/(1000*60*60*24));
        }
        catch(Exception x){
            return 0;
        }
    }
    @Override
    public String toString(){
        return makh+" "+hoten+" "+map+" "+this.songayluutru();
    }
}
public class J07046 {
    public static void main(String[] args) throws Exception{
        File file=new File("KHACH.in");
        Scanner sc=new Scanner(file);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ks> list=new ArrayList<>();
        for(int i=1;i<=t;i++){
            ks a=new ks(i,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            list.add(a);
        }
        Collections.sort(list,new Comparator<ks>(){
            @Override
            public int compare(ks x,ks y){
                return y.songayluutru()-x.songayluutru();
            }
        });
        for(ks x:list) System.out.println(x);
    }
}
