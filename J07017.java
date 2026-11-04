import java.util.*;
import java.io.*;

class Pair<k,v>{
        private k first;
        private v second;
        public Pair(k x,v y){
            this.first=x;
            this.second=y;
        }
        private boolean check(int n){
            if(n<2) return false;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
        public boolean isPrime(){
            int tmp1=(Integer) this.first;
            int tmp2=(Integer) this.second;
            return check(tmp1)&&check(tmp2);
        }
        public String toString(){
            return this.first+" "+this.second;
        }
    }
public class J07017 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
