import java.util.Objects;

public class Circle extends Shapes{
    private  double radio;

    public Circle(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public void area(double area) {
        area= 3.14*radio*radio;
    }

    @Override
    public void shoInfo() {
        System.out.println("Circulo "+radio+" de color"+color);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(radio, circle.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
