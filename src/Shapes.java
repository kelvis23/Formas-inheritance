import java.util.Objects;

abstract class Shapes {
 protected String color ;

    public Shapes(String color) {
        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapes = (Shapes) o;
        return Objects.equals(color, shapes.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "color='" + color + '\'' +
                '}';
    }
   public abstract void  area (double area);
    public abstract void shoInfo();
}
