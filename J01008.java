import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class J01008{
    public static void ptich(int n){
        Map<Integer,Integer> mp = new TreeMap();
        for(int i=2;i<=Math.sqrt(n);i++){
            while(n%i==0){
                mp.put(i, mp.getOrDefault(i,0)+1);
                n/=i;
            }
        }
        if(n>1) mp.put(n,mp.getOrDefault(n,0)+1);
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.print(entry.getKey()+"("+entry.getValue()+")"+" ");
        }
        System.out.println();
    }
    public static void ptich2(int n){
        int[] a=new int[1000];
        int[] mu=new int[100];
        int chay=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                int cnt=0;
                a[chay]=i;
                while(n%i==0){
                    cnt++;
                    n/=i;
                }
                mu[chay]=cnt;
                chay++;
            }
}
        if(n>1) {
            a[chay]=n;
            mu[chay]=1;
            chay++;
        }
        for(int i=0;i<chay;i++){
            System.out.print(a[i]+"("+mu[i]+")"+" ");
          
        
}
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            System.out.printf("Test %d: ",i);
            ptich2(n);
        }
    }    
}
       