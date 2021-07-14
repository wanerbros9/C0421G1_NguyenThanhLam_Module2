package _final_exam.model;

public class ImportedProduct extends Product{
    private int importedPrice;
    private String importedCity;
    private int importedTax;

    public ImportedProduct() {
    }

    public ImportedProduct(int id, String productID, String productName, int price, int amount, String companyProduct, int importedPrice, String importedCity, int importedTax) {
        super(id, productID, productName, price, amount, companyProduct);
        this.importedPrice = importedPrice;
        this.importedCity = importedCity;
        this.importedTax = importedTax;
    }

    public int getImportedPrice() {
        return importedPrice;
    }

    public void setImportedPrice(int importedPrice) {
        this.importedPrice = importedPrice;
    }

    public String getImportedCity() {
        return importedCity;
    }

    public void setImportedCity(String importedCity) {
        this.importedCity = importedCity;
    }

    public int getImportedTax() {
        return importedTax;
    }

    public void setImportedTax(int importedTax) {
        this.importedTax = importedTax;
    }

    @Override
    public String toString() {
        return super.toString() +
                "importedPrice=" + importedPrice +
                ", importedCity='" + importedCity + '\'' +
                ", importedTax=" + importedTax +
                '}';
    }
}
