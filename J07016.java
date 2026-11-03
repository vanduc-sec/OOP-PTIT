import java.util.*;
import java.io.*;
public class J07016 {
    private static int[] check=new int[10002];
    public static void nto(){
        for(int i=0;i<10000;i++) check[i]=1;
        check[0]=0;
        check[1]=1;
        for(int i=2;i<=Math.sqrt(10000);i++){
            if(check[i]==1){
                for(int j=i*i;j<10000;j+=i){
                    check[j]=0;
                }
            }
        }
    }
    public static void main(String[] args){
        nto();
        try{
            FileInputStream file1=new FileInputStream("DATA1.in");
            FileInputStream file2=new FileInputStream("DATA2.in");
            ObjectInputStream sc1=new ObjectInputStream(file1);
            ObjectInputStream sc2=new ObjectInputStream(file2);
            ArrayList<Integer> list1=(ArrayList<Integer>)sc1.readObject();
            ArrayList<Integer> list2=(ArrayList<Integer>)sc2.readObject();
            int[] a1=new int[10000];
            int[] a2=new int[10000];
            for(int x:list1){
                if(check[x]==1) a1[x]++;
            }
            for(int x:list2){
                if(check[x]==1) a2[x]++;
            }
            for(int i=2;i<10000;i++){
                if(a1[i]>0&&a2[i]>0){
                    System.out.println(i+" "+a1[i]+" "+a2[i]);
                }
            }
        }catch(Exception ex){
            
        }
    }
}
