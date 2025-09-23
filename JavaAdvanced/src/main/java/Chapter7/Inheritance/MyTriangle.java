package Chapter7.Inheritance;

public class MyTriangle extends MyShape {

    public MyTriangle(int base, int width) {
        super(base, width);
    }

    @Override
    public double calcArea() {
        return 0.5 * super.length * super.width;
    }

    @Override
    public void display(String shape) {
        System.out.println("\n================ " + shape + " ===============");
        System.out.println("Base: " + this.length);
        System.out.println("Height: " + this.width);
        System.out.println("Area: " + this.calcArea());
    }
}
