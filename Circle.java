public class Circle extends Shape{
    private double radius=1;
    public Circle(){
    }
    public Circle(String color,boolean filled,double radius){
        super(color, filled);
        this.radius=radius;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area =radius*radius*Math.PI;
        return area;
    }
    public double getPerimeter(){
        double p = 2*radius*Math.PI;
        return p;
    }
    public String toString(){
        String string = "A Circle with radius="+radius+", which is a subclass of "+super.toString();
        return string;
    }
}
