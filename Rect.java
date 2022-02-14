public class Rect extends Shape{
    private double width=1;
    private double height=1;
    public Rect(){}
    public Rect(double w,double h){
        height=h;
        width=w;
    }
    public Rect(String color,boolean filled,double w,double h){
        super(color,filled);
        height=h;
        width=w;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        double area = width*height;
        return area;
    }
    public double getPerimeter(){
        double p=2*(height+width);
        return p;
    }
    public String toString(){
        String string ="A Rectangle with width="+width+" and height="+height+", which is a subclass of "+super.toString();
        return string;
    }
}
