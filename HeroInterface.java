package DungeonSource;

public interface HeroInterface extends DungeonCharacterInterface{

    public void readName();
    public boolean defend();
    public void subtractHitPoints(int hitPoints);
	public void battleChoices(DungeonCharacter opponent);
}
