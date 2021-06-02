public class DungeonCharacterFactoryInterface {
    protected String name;
    protected int hitPoints;
    
    //protected stuff because i want to encapsolate it

    public DungeonCharacterStats(String name, int hitPoints)
    {

        this.name = name;
        this.hitPoints = hitPoints;
    }
}