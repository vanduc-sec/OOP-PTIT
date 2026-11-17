import java.util.*;

class Matrix{
    private int a;
    private int b;
    private int[][] c;
    public Matrix(int a,int b){
        this.a=a;
        this.b=b;
        this.c=new int[a][b];
    }
    public void nextMatrix(Scanner sc){
        for(int i=0;i<this.a;i++){
            for(int j=0;j<this.b;j++){
                this.c[i][j]=sc.nextInt();
            }
        }
    }
    public Matrix mul(Matrix b){
        Matrix tmp=new Matrix(this.a,b.b);
        for(int i=0;i<this.a;i++){
            for(int j=0;j<b.b;j++){
                int res=0;
                for(int k=0;k<this.b;k++){
                    
                    res+=(this.c[i][k]*b.c[k][j]);
                    tmp.c[i][j]=res;
                }
            }
        }
        return tmp;
    }
    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<this.a;i++){
            for(int j=0;j<this.b;j++){
                sb.append(this.c[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
public class j04016 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
