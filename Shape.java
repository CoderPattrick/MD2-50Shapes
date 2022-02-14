public class Shape {
    private String color="black";
    private boolean filled=false;
    public Shape(){};
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String toString(){
        String string = "A Shape with color "+color+" and " + (filled?"filled":"not filled");
        return string;
    }
}
