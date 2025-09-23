package Chapter7.Inheritance;

public class MyCircle extends MyShape {

    private final double PI = 3.14;

    public MyCircle(int radius) {
        super(radius, 0);
    }

    @Override
    public double calcArea() {
        return PI * super.length * super.length; // πr²
    }

    @Override
    public void display(String shape) {
        System.out.println("\n================ " + shape + " ===============");
        System.out.println("Radius: " + this.length);
        System.out.println("Area: " + this.calcArea());
    }

}
