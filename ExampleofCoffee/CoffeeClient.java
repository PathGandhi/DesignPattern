public class CoffeeClient{
    public static void main(String[] args) {
        CoffeeTemplate coffee = new Brucoffee();
        System.out.println("BruCoffee Created");
        coffee.preparecoffee();

        System.out.println();
        System.out.println("NestleCafe created");
        coffee.preparecoffee();
    }
}
