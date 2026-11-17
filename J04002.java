import java.util.*;

class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange() {
        width=1;
        height=1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor(){
        
        return color.substring(0, 1).toUpperCase()+color.substring(1).toLowerCase();
    }
    public void setColor(String color){
        this.color=color;
    }
    public double findArea(){
        return this.height*this.width;
    }
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
}
public class j04002 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Rectange r=new Rectange(sc.nextDouble(),sc.nextDouble(),sc.next());
        if(r.getHeight()>0&&r.getWidth()>0){
            System.out.printf("%.0f %.0f %s",r.findPerimeter(),r.findArea(),r.getColor());
        }
        else System.out.print("INVALID");
    }
}
