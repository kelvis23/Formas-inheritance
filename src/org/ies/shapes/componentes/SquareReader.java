package org.ies.shapes.componentes;

import org.ies.shapes.model.Circle;
import org.ies.shapes.model.Square;

import java.util.Scanner;

public class SquareReader {
    private final Scanner scanner;

    public SquareReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Square read (){
        System.out.println("introduse los datos del cuadrdo");
        System.out.println("color");
        String color =scanner.nextLine();
        System.out.println("tamaño");
        double size= scanner.nextDouble();
        scanner.nextLine();
        return new Square(
                color,
                size
        );
    }
}

