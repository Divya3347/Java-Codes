package Product;

class Product {
     String name;
     double price;
     int quantity;
     static int totalSold;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int quantity){
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + " " + "solds");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    public static int getTotalSold() {
        return totalSold;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Iphone 13", 110000, 5);
        Product p2 = new Product("Samsung s23", 90000, 7);
        Product p3 = new Product("Vivo v27", 50000, 15);

        p1.sell(4);
        p2.sell(5);
        p3.sell(10);

        int totalSold = Product.getTotalSold();
        System.out.println("Total quantity of products sold: " + totalSold);

        System.out.println("Remaining quantity of products:");
        System.out.println(p1.getName() + ": " + p1.getQuantity());
        System.out.println(p2.getName() + ": " + p2.getQuantity());
        System.out.println(p3.getName() + ": " + p3.getQuantity());
    }
}

