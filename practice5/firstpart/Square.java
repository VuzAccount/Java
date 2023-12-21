package practice5.firstpart;

public class Square extends Rectangle{
    public Square(){
        width = 1;
        length = 1;
    }
    public Square(double side){
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled){
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    @Override
    public void setWidth(double side){
        width = side;
        length = side;
    }
    @Override
    public void setLength(double side){
        width = side;
        length = side;
    }
    @Override
    public String toString(){
        return "Square = width: "+width+", length: "+length;
    }
}
