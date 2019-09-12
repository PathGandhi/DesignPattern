class GlassHouse extends HouseTemplate{
    
    @Override
    public void buildFoundation(){
        System.out.println("Building House with cement,iron roads");
    }

    @Override
    public void buildPillars(){
        System.out.println("Building house with Glass coating");
    }

    @Override
    public void buildWalls(){
        System.out.println("Building glass Walls");
    }

    @Override
    public void buildWindows(){
        System.out.println("Buliding Glass windows");
    }
}