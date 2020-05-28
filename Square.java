
package inheritance;

public class Square extends Quadrilateral {
    private double s;
    public Square(double s){
        this.s = s;
    }
    public double getS() { return s;}
    public void setS(double s) { this.s   =s;}
    public double getPerimeter() { return noOfSides * s;}
    public double getArea() { return s * s;}
    public void squareInfo(){
        System.out.println("== Square ==");
        System.out.println("A square has " + noOfSides  + " sides" );
        System.out.println("Side: " + s);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
    
}

