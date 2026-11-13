import java.util.Scanner;
public class j01006{
    static long[] a= new long[93];
    public static void fib(){
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=92;i++) a[i]=a[i-1]+a[i-2];
    }
    public static void main(String[] args){
        fib();
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            System.out.println(a[n]);
        }
    }
}