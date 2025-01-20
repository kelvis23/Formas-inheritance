import java.util.Objects;

public class Square extends Shapes {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square(String color) {
        super(color);
    }

    public double getSide() {
        return side;
    }

    @Override
    public void area( double area) {
        area=side*side;

    }

    @Override
    public void shoInfo() {
        System.out.println("Cuadrado "+side+" color"+color);
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                '}';
    }
}
