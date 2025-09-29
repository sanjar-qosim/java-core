package lesson_3;

import java.util.ArrayList;

public class OnlineStore {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int count) {
        Product product = new Product(name, price, count);
        products.add(product);
    }

    public void getProducts() {
        System.out.println(products);
    }

    public void getProductInfo(int code) {
        for (Product tmp : products) {
            if (tmp.code == code) {
                System.out.println(tmp);
            }
        }
    }

    public void buyProduct(int code, int count) {
        for (Product tmp : products) {
            if (tmp.code == code && tmp.count > count) {
                tmp.count -= count;
                System.out.println("Buying was successful!");
                break;
            }
        }
    }

    // inner class for create product
    private class Product {

        private static int idForCode = 0;
        private int code;
        private String name;
        private double price;
        private int count;

        public Product(String name, double price, int count) {
            idForCode++;
            this.code = idForCode;
            this.name = name;
            this.price = price;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
        }
    }
}
