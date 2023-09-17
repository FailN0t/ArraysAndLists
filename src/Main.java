public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("milk", 75),
                new Product("Butter", 120),
                new Product("chise", 180),
                new Product("teapod", 1890),
                new Product("water filter", 1200)
        };

        int MIN_PRICE_FOR_DISCOUNT = 1000;

        double discount = 0.1;
        for(int i = 0; i<products.length; i++){
            if(products[i].getPrice() >= MIN_PRICE_FOR_DISCOUNT){
                products[i] = new Product(products[i].getName(), (int)(products[i].getPrice() * (1 - discount)));
            }
        }

        for(Product product:products){
            System.out.println(product);
        }
    }
}
