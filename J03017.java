import java.util.*;

public class j03017 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s=sc.nextLine();
            int n=s.length();
            int[] a=new int[n+2];
            int cs=0;
            a[cs++]=-1;
            for(int i=0;i<n;i++){
                a[cs++]=i;
                if(cs>=4){
                    if(s.charAt(a[cs-3])=='1'&&s.charAt(a[cs-2])=='0'&&
                        s.charAt(a[cs-1])=='0'    ) cs-=3;
                }
            }
            a[cs]=n;
            int res=0;
            for(int i=1;i<=cs;i++){
                if(a[i]-a[i-1]>res){
                    res=a[i]-a[i-1]-1;
                }
            }
            System.out.println(res);
        }
    }
}
