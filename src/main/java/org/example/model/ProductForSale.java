package org.example.model;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // can override in subclass. if u use final word then method can't override.
    public void printHello(){
        System.out.println("hello");
    }
    // abstract method have to override in subclass
    public abstract void showDetails();

    public int getSalesPrice(int quantity){
        return (int) (quantity * this.price);
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ProductForSale{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
