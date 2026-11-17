import java.util.*;
import java.io.*;

public class j07002 {
    public static void main(String[] args){
        try{
            File file=new File("DATA.in");
            Scanner sc=new Scanner(file);
            long res=0;
            while(sc.hasNext()){
                String s=sc.next();
                try{
                    int tmp=Integer.parseInt(s);
                    res+=tmp;
                }catch(NumberFormatException ex){
                    
                }
            }
            System.out.print(res);
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
}
