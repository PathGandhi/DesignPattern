public class HousingClient{
    public static void main(String[] args) {
        System.out.println("Build a wooden house");
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();

        System.out.println("Build a Glass House");
        house = new GlassHouse();
        house.buildHouse();
    }
}