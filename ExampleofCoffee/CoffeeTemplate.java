abstract class CoffeeTemplate{
    
    abstract void boilWater();

    abstract void addMilk();

    abstract void addSugar();

    abstract void addCoffeePowder();

    public final void preparecoffee(){
        boilWater();
        addMilk();
        addSugar();
        addCoffeePowder();
    }
}