import java.util.*;

public class j02037 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            int cnt,c=0,le=0;
            
            
                String s=sc.nextLine();
                String[] tmp=s.trim().split("\\s+");
                for(int i=0;i<tmp.length;i++){
                    int x=Integer.parseInt(tmp[i]);
                if(x%2==0) c++;
                else le++;
                }
                cnt=tmp.length;
            
            if(cnt%2==0&&c>le) System.out.println("YES");
            else if(cnt%2==1&&le>c) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}
