

public interface Observer
{	
	// updates board with user/computer moves
	public GameState updateMoves(MoveStrategy move);
	
	//displays board when requested
	public void updateShowBoard(boolean is_player);
	
	//updates the placement of ships
	public int updatePlacement(ShipStrategy ship_strategy);

}