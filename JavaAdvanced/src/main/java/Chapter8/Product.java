package Chapter8;
/*
* @ Puleng Senyatso
* This class will throw exceptions based on the following rules
* - a product description should be at least 5 char long
* - price cannot be zero or negative
*
* */

public class Product {
    private String productCode, description;
    private double price;
    private int quantityInStock;

    public Product(String productCode, String description, double price, int quantityInStock) {
        setCode(productCode);
        setDescription(description);
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    public void increasePrice(double percentageIncrease){
        setPrice(getPrice() + (percentageIncrease * getPrice()));
    }

    public void sell(int quantityToSell){
        if (quantityToSell <= getQuantityInStock()){
            setQuantityInStock(getQuantityInStock() - quantityToSell);
        }
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setCode(String productCode) {
        this.productCode = productCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description.length()<5)
        {
            throw new IllegalArgumentException("Description length should be greater than 5" +
                    "\nCurrent description is: [" + description + "]");
        }
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0)
        {
            throw new IllegalArgumentException("Price should be greater than 0" +
                    "\nCurrent price is: [R" + price + "]");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "productCode = " + getProductCode() + ", description = " + getDescription() + ", price = " + getPrice() + ", quantityInStock = " + getQuantityInStock() + '}';
    }


}
