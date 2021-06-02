  
public class DungeonMechanics {

   =    public static boolean playAgain()
    {
        char again;

        System.out.println("Play again (y/n)?");
        again = Keyboard.kb.next().trim().charAt(0);

        return (again == 'Y' || again == 'y');
    }

       public static void battle(Hero theHero, Monster theMonster)
    {
        char pause = 'p';
        System.out.println(theHero.getName() + " battles " +
                theMonster.getName());
        System.out.println("---------------------------------------------");

                while (theHero.isAlive() && theMonster.isAlive() && pause != 'q')
        {
                        theHero.battleChoices(theMonster);

            if (theMonster.isAlive())
            theMonster.normalAttack(theHero);

                        System.out.print("\n-->q to quit, anything else to continue: ");
            pause = Keyboard.kb.next().trim().charAt(0);

        }

        if (!theMonster.isAlive())
            System.out.println(theHero.getName() + " was victorious!");
        else if (!theHero.isAlive())
            System.out.println(theHero.getName() + " was defeated :-(");
        else
            System.out.println("Quitters never win ;-)");

    }


}