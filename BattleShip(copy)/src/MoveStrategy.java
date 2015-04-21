

public interface MoveStrategy
{
	public void move(int x, int y);
	public int x();
	public int y();
	//method so computer can get info about the state of his turn 
	public void gameState(GameState state);
	
	//method so that computer can where has it last got successful hit
	public void lastHit(int x, int y);
}