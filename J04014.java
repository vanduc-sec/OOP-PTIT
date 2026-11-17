import java.util.*;

class ps{
    private long ts;
    private long ms;
    public ps(long a,long b){
        this.ts=a;
        this.ms=b;
        this.rutgon();
       
    }
    private long ucln(long a,long b){
        while(b!=0){
            long tmp=b;
            b=a%b;
            a=tmp;
        }
        return a;
    }
    public long bcnn(long a,long b){
        return a/ucln(a,b)*b;
    }
    public ps rutgon(){
        long tmp=ucln(Math.abs(this.ts),Math.abs(this.ms));
        this.ts/=tmp;
        this.ms/=tmp;
        return this;
    }
    
    public ps ptc(ps a){
        long tmp3=bcnn(this.ms,a.ms);
        long tuso=this.ts*(tmp3/this.ms)+a.ts*(tmp3/a.ms);
        long mauso=tmp3;
        tuso*=tuso;
        mauso*=mauso;
        return new ps(tuso,mauso);
    }
    public ps ptd(ps b,ps c){
        long tusp=(this.ts*b.ts);
        long mauso=(this.ms*b.ms);
        ps res=new ps(tusp,mauso);
        tusp=(res.ts*c.ts);
        mauso=(res.ms*c.ms);
        return new ps(tusp,mauso);
       
    }
    @Override
    public String toString(){
        return ts+"/"+ms;
    }
}
public class j04014 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            ps a=new ps(sc.nextLong(),sc.nextLong());
            ps b=new ps(sc.nextLong(),sc.nextLong());
            ps res1=a.ptc(b);
            ps res2=a.ptd(b,res1);
            System.out.println(res1.toString()+" "+res2.toString());
        }
    }
}
