package org.ies.shapes.componentes;

import org.ies.shapes.model.Draw;
import org.ies.shapes.model.Shape;

import java.util.Scanner;

public class DrawReader {
    private final Scanner scanner;
    private final ShapeReader shapeReader;

    public DrawReader(Scanner scanner, ShapeReader shapeReader) {
        this.scanner = scanner;
        this.shapeReader = shapeReader;
    }

    public Draw read(){
        System.out.println("Ingresa las coordenadas X:");
        Double x = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresa las coordenadas Y:");
        Double y = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresa la forma del dibujo:");
        Shape shape = shapeReader.read();
        return new Draw(
                x,
                y,
                shape
        );
    }
}
