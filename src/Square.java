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
    public double area( ) {
        return side*side;

    }

    @Override
    public void info() {
        color();
        System.out.println("cuadrado"+side);
    }


    @Override
    public boolean equals(Object o) {
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
