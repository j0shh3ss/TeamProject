package DungeonSource;

public class MonsterFactory extends Monster {


    public MonsterFactory(String name, int hitPoints, int attackSpeed, double chanceToHit, double chanceToHeal, int damageMin, int damageMax, int minHeal, int maxHeal) {
        super(name, hitPoints, attackSpeed, chanceToHit, chanceToHeal, damageMin, damageMax, minHeal, maxHeal);
    }

    public static Monster generateMonster()
    {
        int choice;

        choice = (int)(Math.random() * 3) + 1;

        switch(choice)
        {
            case 1: return new Ogre();

            case 2: return new Gremlin();

            case 3: return new Skeleton();

            default: System.out.println("invalid choice, returning dungeon.Skeleton");
                return new Skeleton();

        }
    }
}