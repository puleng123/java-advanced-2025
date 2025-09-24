package Chapter7.Inheritance;

public class MyShapeRunner
{
    public static void main(String[] args) {
        MyShape objShape = new MyShape(8, 12);
        objShape.display("Shape");

        MyRectangle objRec = new MyRectangle(9,4);
        objRec.display("Rectangle");

        MySquare objSquare = new MySquare(5);
        objSquare.display("Square");

        //ADDED HOMEWORK
        MyCircle objCircle = new MyCircle(5);
        objCircle.display("Circle");

        MyTriangle objTriangle = new MyTriangle(5,6);
        objTriangle.display("Triangle");

        MyParallelogram objParallelogram = new MyParallelogram(5,6);
        objParallelogram.display("Parallelogram");
    }


}
