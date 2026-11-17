import java.util.*;

class Point{
    private double x;
    private double y;
    public Point(){       
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point x){
        this.x=x.x;
        this.y=x.y;
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }

    public double distance(Point x) {
        double res=Math.sqrt((x.x-this.x)*(x.x-this.x)+(x.y-this.y)*(x.y-this.y));
        return res;
    }

    public double distance(Point x, Point y) {
        double res=Math.sqrt((x.x-y.x)*(x.x-y.x)+(x.y-y.y)*(x.y-y.y));
        return res;
    }
    @Override
    public String toString(){
        return x+" "+y;
    }
    
}
public class j04001 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            Point x=new Point(sc.nextDouble(),sc.nextDouble());
            Point y=new Point(sc.nextDouble(),sc.nextDouble());
            System.out.printf("%.4f\n",x.distance(y));
        }
    }
    
    
}
