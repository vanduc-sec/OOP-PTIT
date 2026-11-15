import java.util.Scanner;
public class J01007{
    public static boolean check(long n){
        long kq=0,l,r=1;
        while(kq<n){
            l=kq;
            kq=r;
            r+=l;
        }
        return kq==n;
        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            long n=sc.nextLong();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}