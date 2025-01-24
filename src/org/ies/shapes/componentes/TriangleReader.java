package org.ies.shapes.componentes;

import org.ies.shapes.model.Circle;
import org.ies.shapes.model.SquareTriangle;

import java.util.Scanner;

public class TriangleReader {
    private final Scanner scanner;

    public TriangleReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public SquareTriangle read (){
        System.out.println("introduse los datos del circulo");
        System.out.println("color");
        String color =scanner.nextLine();
        System.out.println("altura");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("base");
        double base = scanner.nextDouble();
        scanner.nextLine();
        return new SquareTriangle(
                color,
                height,
                base
        );
    }
}

