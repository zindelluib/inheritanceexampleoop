
package inheritance;


public class Rectangle extends Quadrilateral {
    
    private double l;
    private double w;
  
    public Rectangle(int l,int w){
        this.l = l;
        this.w = w;
    }
    public void setL(double l) { this.l  = l; }
    public double getL() { return l;}
    public void setW(double w) { this.w   = w; }
    public  double getW(){ return w; }
    public double getPerimeter() {return 2 * (l + w); }
    public double getArea() { return  l * w; }
    public void rectangleInfo(){
        System.out.println("=== Rectangle ===");
        System.out.println("A rectangle has " +  noOfSides + " sides.");
        System.out.println("Length: " + l);
        System.out.println("Width: " + w);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}


