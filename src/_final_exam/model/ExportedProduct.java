package _final_exam.model;

public class ExportedProduct extends Product{
    private int exportedPrice;
    private String exportedCountry;

    public ExportedProduct() {
    }

    public ExportedProduct(int id, String productID, String productName, int price, int amount, String companyProduct, int exportedPrice, String exportedCountry) {
        super(id, productID, productName, price, amount, companyProduct);
        this.exportedPrice = exportedPrice;
        this.exportedCountry = exportedCountry;
    }

    public int getExportedPrice() {
        return exportedPrice;
    }

    public void setExportedPrice(int exportedPrice) {
        this.exportedPrice = exportedPrice;
    }

    public String getExportedCountry() {
        return exportedCountry;
    }

    public void setExportedCountry(String exportedCountry) {
        this.exportedCountry = exportedCountry;
    }

    @Override
    public String toString() {
        return super.toString() +
                "exportedPrice=" + exportedPrice +
                ", exportedCountry='" + exportedCountry + '\'' +
                '}';
    }
}
