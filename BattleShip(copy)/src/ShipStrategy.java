

public interface ShipStrategy
{	
	//used by the player to place ships
	public abstract void place(int x,  int y,  int shipSize, char newOrientation);
	//used by the computer to place ships
	public abstract void automatedShipPlacer(int newShipSize);
	
	//returns information about ship
	public abstract int x();
	public abstract int y();
	public abstract int shipSize();
	public abstract char shipOrientation(); 
	
	
}