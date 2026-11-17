import java.util.*;

class point{
    private double x;
    private double y;
    public point(){
        
    }
    public point(double x,double y){  
        this.x=x;
        this.y=y;
    }
    public point(point z){
        this.x=z.x;
        this.y=z.y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(point z){
        return Math.sqrt((z.x-this.x)*(z.x-this.x)+(z.y-this.y)*(z.y-this.y));
    }
    public double distance(point l,point k){
        return Math.sqrt((k.x-l.x)*(k.x-l.x)+(k.y-l.y)*(k.y-l.y));
    }
    @Override  
    public String toString(){
        return x+" "+y;
    }
    public static boolean check(point a,point b,point c){
        if(a.distance(b)+a.distance(c)<=b.distance(c)||a.distance(b)+b.distance(c)<=a.distance(c)||b.distance(c)+a.distance(c)<=a.distance(b)) return false;
        
        return true;
    }
}
public class j04008 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            point p1=new point(sc.nextDouble(),sc.nextDouble());
            point p2=new point(sc.nextDouble(),sc.nextDouble());
            point p3=new point(sc.nextDouble(),sc.nextDouble());
            if(!point.check(p1,p2,p3)) System.out.println("INVALID");
            else{
                System.out.printf("%.3f\n", p1.distance(p3)+p1.distance(p2)+p2.distance(p3));
            }
        }
    }
}
