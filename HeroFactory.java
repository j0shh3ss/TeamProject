package DungeonSource;

public class HeroFactory extends Hero {


    public HeroFactory(String name, int hitPoints, int attackSpeed, double chanceToHit, int damageMin, int damageMax,double chanceToBlock) {
        super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax, chanceToBlock);   
   }

    public static Hero generateHero()
    {
        int choice;

        choice = (int)(Math.random() * 3) + 1;

        switch(choice)
        {
            case 1: return new Sorceress();

            case 2: return new Thief();

            case 3: return new Warrior();

            default: System.out.println("invalid choice, returning Theif.");
                return new Thief();

        }
    }
}