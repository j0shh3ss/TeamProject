public class DungeonCharacterFactoryInterface {
    protected String name;
    protected int hitPoints;
    protected int attackSpeed;
    protected double chanceToHit;
    protected int damageMin;
    protected int damageMax;
    //protected stuff because i want to encapsolate it

    public DungeonCharacterStats(String name, int hitPoints, int attackSpeed, int damageMin, int damageMax, double chanceToHit, double chanceToBlock)
    {

        this.name = name;
        this.hitPoints = hitPoints;
        this.attackSpeed = attackSpeed;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.chanceToHit = chanceToHit;
        this.chanceToBlock = chanceToBlock;
 
    }
}
