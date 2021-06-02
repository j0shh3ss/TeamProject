package DungeonSource;

public interface DungeonCharacterInterface {
	    
	    public String getName();
	//-----------------------------------------------------------------
		public int getHitPoints();
	//-----------------------------------------------------------------
		public int getAttackSpeed();
	//--------------------------------------------------
		public void addHitPoints(int hitPoints);
		//-----------------------------------------------------------------
		public void subtractHitPoints(int hitPoints);
	//--------------------------------------------------
		public boolean isAlive();
	//---------------------------------------------------
		public void attack(DungeonCharacter opponent);
	//---------------------------------------------------
	}
