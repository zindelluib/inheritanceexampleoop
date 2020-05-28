package inheritance;


public class Triangle extends Polygon{
    private double s1,s2,s3; // sides
    public Triangle(double s1,double s2,double s3){
        super(3,"triangle");
        this.s1  = s1;
        this.s2  = s2;
        this.s3  = s3;
        
    }
    
    public double getPerimeter(){
        return s1 + s2 + s3;
    }
}



