class WoodenHouse extends HouseTemplate{
    
    @Override
    public void buildFoundation(){
        System.out.println("Building House with cement,iron,rods,sand and woods");
    }

    @Override
    public void buildPillars(){
        System.out.println("Building house with Wooden coating");
    }

    @Override
    public void buildWalls(){
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildWindows(){
        System.out.println("Buliding Wooden windows");
    }
}