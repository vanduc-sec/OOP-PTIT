import java.util.Scanner;

public class J01009 {
    public static long gt(int n){
    long tich=1;
    for(int i=1;i<=n;i++) tich*=i;
    return tich;
}
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long kq=0;
        for(int i=1;i<=n;i++) kq+=gt(i);
        System.out.print(kq);
    }
}
