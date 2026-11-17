import java.util.*;
import java.io.*;

class mh{
    private String mamon,tenmon;
    private int tc;
    public mh(String mamon,String tenmon,int tc){
        this.mamon=mamon;
        this.tenmon=tenmon;
        this.tc=tc;
    }
    public String getTenmon(){
        return this.tenmon;
    }
    @Override
    public String toString(){
        return this.mamon+" "+this.tenmon+" "+this.tc;
    }
}

public class J07034 {
    public static void main(String[] args) throws Exception{
        File file=new File("MONHOC.in");
        Scanner sc=new Scanner(file);
        List<mh> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t>0){
            t--;
            mh a=new mh(sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            list.add(a);
        }
        Collections.sort(list,new Comparator<mh>(){
            @Override
            public int compare(mh a,mh b){
                return a.getTenmon().compareTo(b.getTenmon());
            }
        });
        for(mh x:list) System.out.println(x);
    }
}
