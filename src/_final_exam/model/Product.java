package _final_exam.model;

import java.io.Serializable;
public abstract class Product implements Serializable {
    private int id;
    private String productID;
    private String productName;
    private int price;
    private int amount;
    private String companyProduct;

    public Product() {
    }

    public Product(int id, String productID, String productName, int price, int amount, String companyProduct) {
        this.id = id;
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.companyProduct = companyProduct;
    }

    public Product(int id, String productID, String productName, int price, int amount, String companyProduct, int importedPrice, String importedCity, int importedTax) {
    }

    public Product(int id, String productID, String productName, int price, int amount, String companyProduct, int exportedPrice, String exportedCountry) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCompanyProduct() {
        return companyProduct;
    }

    public void setCompanyProduct(String companyProduct) {
        this.companyProduct = companyProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", companyProduct='" + companyProduct + '\'' +
                '}';
    }
}
