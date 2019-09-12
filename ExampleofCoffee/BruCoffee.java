class Brucoffee extends CoffeeTemplate{
    @Override
    void boilWater(){
        System.out.println("Water Boiled");
    }
    @Override
    void addMilk(){
        System.out.println("Milk Added");
    }
    @Override
    void addSugar(){
        System.out.println("Sugar added");
    }
    @Override
    void addCoffeePowder(){
        System.out.println("Coffee Bru powder added");
    }
}