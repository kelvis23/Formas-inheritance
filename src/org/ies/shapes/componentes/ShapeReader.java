package org.ies.shapes.componentes;

import java.awt.*;
import java.util.Scanner;

public class ShapeReader {
    private  final Scanner scanner;
    private  final CircleReader circleReader;
    private  final SquareReader squareReader;
    private  final  TriangleReader triangleReader;

    public ShapeReader(Scanner scanner, CircleReader circleReader, SquareReader squareReader, TriangleReader triangleReader) {
        this.scanner = scanner;
        this.circleReader = circleReader;
        this.squareReader = squareReader;
        this.triangleReader = triangleReader;
    }
    public Shape read (){
        int opt;
        do {
            System.out.println("1. circulo");
            System.out.println("2. cuadrdo");
            System.out.println("3. triangulo");
            opt= scanner.nextInt();
            scanner.nextLine();
        }while (opt <0|| opt>3);
        if (opt == 1){
            circleReader.read();
        } else if (opt ==2) {
            squareReader.read();
        }else {
            triangleReader.read();
        }
    }
}
