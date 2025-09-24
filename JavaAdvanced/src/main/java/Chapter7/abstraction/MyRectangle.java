package Chapter7.abstraction;

public class MyRectangle extends MyShape
{
    private int length, width;

    public MyRectangle(int l, int w){
        setLength(l);;
        setWidth(w);;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return getLength() * getWidth();
    }

    @Override
    public double calcParameter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public void display() {
        System.out.println(String.format("""
                ================= %s ===============
                Length: %d
                Width: %d
                Area: %.2f
                Parameter: %d
                """, getClass().getSimpleName(), getLength(),getWidth(), calcArea(), calcParameter()));
    }

    @Override
    public void draw() {
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < width; col++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

