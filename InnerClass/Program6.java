
class CoffeeShop {
    void serveCustomer(String customerType) {
        class Coffee {
            private String type;
            Coffee(String type) {
                this.type = type;
            }
            void serve() {
                System.out.println("Serving " + type + " to " + customerType);
            }
        }

        Coffee espresso = new Coffee("Espresso");
        espresso.serve();
    }
}

public class Program6 {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        shop.serveCustomer("Regular");
    }
}
