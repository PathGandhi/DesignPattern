abstract class HouseTemplate{
    public abstract void buildFoundation();

    public abstract void buildPillars();

    public abstract void buildWalls();

    public abstract void buildWindows();

    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House Built");
    }


}