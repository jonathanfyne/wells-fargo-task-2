import javax.persistence.*;
package com.example.entities;

@Entity
public class Securities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer securityId;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "type")
    private String type;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Double price;

    @Column(name = "purchase_date")
    private String purchaseDate;


    public Securities(String symbol, String type, Integer quantity, Double price, String purchaseDate) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }


    public Integer getSecurityId() {
        return securityId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
