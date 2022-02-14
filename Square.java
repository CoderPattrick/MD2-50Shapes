public class Square extends Rect{
    double side=1;
    public Square(){}
    public Square(double side){
//        this.side=side;
        super(side,side);
    }
    public Square(String color,boolean filled,double side){
        super(color,filled,side,side);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double w){
//        this.side=w;
        setSide(w);
    }
    @Override
    public void setHeight(double h){
//        this.side=h;
        setSide(h);
    }
    public String toString(){
        String string ="A Square with side="+side+", which is a subclass of "+super.toString();
        return string;
    }
}
