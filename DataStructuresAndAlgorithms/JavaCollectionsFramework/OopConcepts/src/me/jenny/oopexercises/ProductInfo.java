package me.jenny.oopexercises;

public class ProductInfo {
    private String productCode;
    private String productName;
    private String category;
    private float price;
    private short stockQuantity;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStockQuantity(short stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public short getStockQuantity() {
        return stockQuantity;
    }

    public ProductInfo(String productCode, String productName, short stockQuantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.stockQuantity = stockQuantity;
    }
    public ProductInfo(String productCode, String productName, String category,float price,short stockQuantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.category = category;
        this.price=price;
        this.stockQuantity=stockQuantity;
    }
    public void displayDetails(){
        System.out.println("Product code :"+this.productCode);
        System.out.println("Product Name :"+this.productName);
        System.out.println("Category :"+this.category);
        System.out.println("Price :"+this.price);
        System.out.println("Stock Quantity :"+this.stockQuantity);
    }
}
