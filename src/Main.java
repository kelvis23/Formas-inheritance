//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Square square =new Square("red",4);
        Circle circle =new Circle("blue",6);
        SquareTriangle squareTriangle = new SquareTriangle("amarillo",5,4);

        square.area();
        square.info();
        circle.area();
        circle.info();
        squareTriangle.info( );
    }



}
