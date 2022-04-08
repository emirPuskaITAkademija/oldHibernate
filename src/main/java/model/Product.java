package model;

import java.io.Serializable;
import java.math.BigDecimal;

//POJO Plan Old Java Object klasa
//Java Bean -> implements Serializable , konstruktor bez parametara, get set
public class Product extends ActiveProduct implements Serializable {
    private Integer productId;
    private String name;
    private int quantityInStock;
    private BigDecimal unitPrice;

    public Product() {
    }

    public Product(Integer productId, String name, int quantityInStock, BigDecimal unitPrice) {
        this.productId = productId;
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
