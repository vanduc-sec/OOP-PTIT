import java.util.*;

class ps{
    private long ts;
    private long ms;
    public ps(long a,long b){
        this.ms=b;
        this.ts=a;
    }
    public long ucln(long a,long b){
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
    public ps rutgon(ps a){
        long tmp=a.ucln(a.ts, a.ms);
        a.ts/=tmp;
        a.ms/=tmp;
        return a;
    }
    public ps cong(ps a,ps b){
        a=a.rutgon(a);
        b=b.rutgon(b);
        long tmp=bcnn(a.ms,b.ms);
        a.ts*=(tmp/a.ms);
        a.ms=tmp;
        b.ts*=(tmp/b.ms);
        b.ms=tmp;
        a.ts=a.ts+b.ts;
        a=a.rutgon(a);
        return a;
    }
    public long getTs(){
        return ts;
    }
    public long getMs(){
        return ms;
    }
}
public class j04004 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ps a=new ps(sc.nextLong(),sc.nextLong());
        ps b=new ps(sc.nextLong(),sc.nextLong());
        ps tmp1=a.rutgon(a);
        ps tmp2=b.rutgon(b);
        ps res=tmp1.cong(tmp1, tmp2);
        System.out.print(res.getTs()+"/"+res.getMs());
    }
}
