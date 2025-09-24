package Chapter7.Inheritance;

public class MyParallelogram extends MyShape {

    public MyParallelogram(int length, int width) {
        super(length, width);
    }

    @Override
    public double calcArea() {
        return this.length * this.width; // base × height
    }

    @Override
    public void display(String shape) {
        System.out.println("\n================ " + shape + " ===============");
        System.out.println("Base: " + this.length);
        System.out.println("Height: " + this.width);
        System.out.println("Area: " + this.calcArea());
    }
}