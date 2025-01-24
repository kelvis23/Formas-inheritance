package org.ies.shapes.componentes;

import org.ies.shapes.model.Circle;

import java.util.Scanner;

public class CircleReader {
    private final Scanner scanner;

    public CircleReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Circle read (){
        System.out.println("introduse los datos del circulo");
        System.out.println("color");
        String color =scanner.nextLine();
        System.out.println("radio");
        double radio = scanner.nextDouble();
        scanner.nextLine();
        return new Circle(
                color,
                radio
        );
    }
}
