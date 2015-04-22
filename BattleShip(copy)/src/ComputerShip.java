import java.security.SecureRandom;


public class ComputerShip implements ShipStrategy
{
	protected int x;
	protected int y;
	protected int shipSize;
	protected char shipOrientation;
	private int boardSize;
	private SecureRandom random = new SecureRandom();
	
	
	public ComputerShip(int newBoardSize){
		boardSize = newBoardSize;
	}
	
	
	@Override
	public void place(int x, int y, int shipSize, char newOrientation)
	{
		// TODO Auto-generated method stub
		
	}

	public void automatedShipPlacer(int newShipSize){
		
		
		int randomChoice;
		//gets a random x and y coordinate
		x = random.nextInt(boardSize);
 		y = random.nextInt(boardSize);
 		
 		//gets a random number to choose orientation
 		randomChoice = random.nextInt(1);
 		
 		if(randomChoice == 0)
 			shipOrientation = 'v';
 		
 		else
 			shipOrientation = 'h';
 		
 		shipSize = newShipSize;
	}


	public int x(){ return x;}
	public int y(){ return y;}
	public int shipSize(){ return shipSize;}
	public char shipOrientation(){return shipOrientation;} 

}
