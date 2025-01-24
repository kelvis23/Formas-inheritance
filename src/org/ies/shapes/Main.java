package org.ies.shapes;

import org.ies.shapes.componentes.CircleReader;
import org.ies.shapes.componentes.ShapeReader;
import org.ies.shapes.componentes.SquareReader;
import org.ies.shapes.componentes.TriangleReader;
import org.ies.shapes.model.Circle;
import org.ies.shapes.model.Square;
import org.ies.shapes.model.SquareTriangle;

import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircleReader circleReader = new CircleReader(scanner);
         SquareReader squareReader = new SquareReader(scanner);
         TriangleReader triangleReader =new TriangleReader(scanner);
        ShapeReader shapeReader = new ShapeReader(scanner,circleReader,squareReader,triangleReader);
        Shape shape = shapeReader.read();
        ;
        Square square =new Square("red",4);
        Circle circle =new Circle("blue",6);
        SquareTriangle squareTriangle = new SquareTriangle("amarillo",5,4);

        squareTriangle.showInfo();
        square.showInfo();
        circle.showInfo();

        System.out.println(squareTriangle.area());
        System.out.println(square.area());
        System.out.println(circle.area());
    }



}
