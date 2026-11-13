import java.util.Scanner;
public class j01004{
    static int[] a= new int[10000000];

    public static boolean check(int t){
        if(t<2) return false;
        for(int i=2;i<=Math.sqrt(t);i++){
            if(t%i==0) return false;
        }
        return true;
    }
    //ap dung cho n<=10^9
    public static void nto(){
        for(int i=1;i<10000000;i++) a[i]=1;
        a[0]=a[1]=0;
        for(int i=2;i<=Math.sqrt(10000000);i++){
            if(a[i]==1){
                for(int j=i*i;j<10000000;j+=i){
                if(a[j]==1) a[j]=0;
               }
            }
            
        }
    }
    // sang chi ap dung cho n<=10^7;
    public static void main(String[] args){
        nto();
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(a[n]==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}