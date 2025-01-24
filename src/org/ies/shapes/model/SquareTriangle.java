package org.ies.shapes.model;

import java.util.Objects;

public class SquareTriangle extends Shape {
    private double height;
    private double base;

    public SquareTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public void area(double area) {
        area = base * height / 2;
    }

    @Override
    public void showInfo() {
        System.out.println("Triangulo " + height + " altura " + base + " base " + color + " color");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SquareTriangle that = (SquareTriangle) o;
        return Double.compare(height, that.height) == 0 && Double.compare(base, that.base) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, base);
    }

    @Override
    public String toString() {
        return "org.ies.shapes.model.SquareTriangle{" +
                "color='" + color + '\'' +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
