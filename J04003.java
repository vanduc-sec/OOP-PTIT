import java.util.*;

class ps{
    long ts;
    long ms;

    public ps(long x,long y){
        this.ts=x;
        this.ms=y;
    }
    public long ucln(long a,long b){
        while(b!=0){
           long tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public void rutgon(){
        long tmp=this.ucln(this.ts,this.ms);
        this.ms=this.ms/tmp;
        this.ts=this.ts/tmp;
        System.out.print(this.ts+"/"+this.ms);
    }
}
public class j04003 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ps a=new ps(sc.nextLong(),sc.nextLong());
        a.rutgon();
    }
}
