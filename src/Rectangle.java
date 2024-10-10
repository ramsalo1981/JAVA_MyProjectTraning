import java.util.Objects;

public class Rectangle {
    private Double Width;
    private Double Length;

    public Rectangle(){

    }
    public Rectangle(Double width, Double length) {
        Width = width;
        Length = length;
    }

    public Double getWidth() {
        return Width;
    }

    public Double getLength() {
        return Length;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public void setLength(Double length) {
        Length = length;
    }
    public Double Area(){
        return Width * Length;
    }

    public Rectangle Add(Rectangle r){
        Rectangle Room = new Rectangle();
        Room.Length = this.Length + r.Length;
        Room.Width = this.Width + r.Width;

        return Room;
    }

    // Compare
    public boolean isEqual(Rectangle obj2){
        /*(1)if(this.Length == obj2.Length && this.Width ==obj2.Width){
            return true;
        }
        else
            return false;*/

        //(2)return this.Length == obj2.Length && this.Width == obj2.Width;

        //(3)
        return Objects.equals(this.Length, obj2.Length) && Objects.equals(this.Width, obj2.Width);
    }

    // Copy Constructor
    public Rectangle(Rectangle source){
        Length = source.Length;
        Width = source.Width;
    }
}
