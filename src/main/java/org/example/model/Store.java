package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet",10,"Dubai");
        products[1] = new Bread("Bakery",5,"Bread","Bread flour","white");
        products[2] = new Coke("Pepsi", 3,"Zero",false,2.5);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product :products){
            if(product != null){
                product.showDetails();
            }
        }
    }
}