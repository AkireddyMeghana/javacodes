package org.example;

public class Product {
   private String productName,category;
    private int productId, price;

  public Product(String productName,String category,int productId,int price){
      this.productName = productName;
      this.category=category;
      this.productId=productId;
      this.price=price;
  }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", productId=" + productId +
                ", price=" + price +
                '}';
    }
}