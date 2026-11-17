import java.util.*;

class Point3D{
    private int x,y,z;
    public Point3D(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4){
        int p1p2x=p2.x-p1.x;
        int p1p2y=p2.y-p1.y;
        int p1p2z=p2.z-p1.z;
        int p1p3x=p3.x-p1.x;
        int p1p3y=p3.y-p1.y;
        int p1p3z=p3.z-p1.z;
        int p1p4x=p4.x-p1.x;
        int p1p4y=p4.y-p1.y;
        int p1p4z=p4.z-p1.z;
        int nx=p1p2y*p1p3z-p1p3y*p1p2z;
        int ny=p1p2z*p1p3x-p1p3z*p1p2x;
        int nz=p1p2x*p1p3y-p1p3x*p1p2y;
        long res=(long)nx*p1p4x+(long)ny*p1p4y+(long)nz*p1p4z;
        return res==0;
    }
}
public class j04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
        
        if(Point3D.check(p1,p2,p3,p4)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        }
    }
}
