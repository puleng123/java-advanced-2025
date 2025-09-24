package Chapter8;

public class ProductRunner {
    public static void main(String[] args) {
        try {
            Product objProd = new Product("CK200", "Coca-cola", 0, 20);

            objProd.sell(5);
            objProd.increasePrice(5);
            System.out.println(objProd);
        }
        catch (IllegalArgumentException | HighPriceIncreaseException e)
        {
            System.err.println(e.getMessage());
        }
        finally
        {
            System.exit(0);
        }
    }
}
