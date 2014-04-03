package bosspuzzle;

import java.util.ArrayList;
import java.util.List;

/**
 * The game model indexing looks a following
 * 
 * 			
 * 		0 1 2
 * 		3 4 5
 * 		6 7 8
 * 
 * @author livio
 *
 */
public class BossPuzzleModel {
	/**
	 * 	The two dimensional map is 
	 * 	simple represented as a one dimensional 
	 *  map which contain the current value at 
	 *  their position:
	 * 	
	 * 		0 1 2
	 *  	3 4 5
	 *  	6 7 8
	 */
	List<String> gameMapStatesModel = new ArrayList<String>(9);

	public BossPuzzleModel () {
		resetBossPuzzle();
	}
	
	public void resetBossPuzzle () {
		// just initialize all 1 - 9
		for(Integer i = 0; i <= 8; i++) {
			gameMapStatesModel.set(i, i.toString());
		}
		
		// the last field is empty
		gameMapStatesModel.set(8, "");
	}
	
	/** Tries to make the desired move. 
	 * @return true if move is done and the model changed; false if gameMapStatesModel didn't change */
	public boolean makeMove (int indexOfMove) {
		boolean gameMapStatesModelChanged = false;
		
		if(isEmptyTileLeft(indexOfMove) || isEmptyTileRight(indexOfMove) ||
		   isEmtpyTileBelow(indexOfMove) || isEmptyTileAbove(indexOfMove)) {
			// there will be a change
			gameMapStatesModelChanged = true;
			makeMoveOnTile(indexOfMove);
		}
		
		return gameMapStatesModelChanged;
	}

	private void makeMoveOnTile(int indexOfMove) {
		// TODO Auto-generated method stub
		
	}

	private boolean isEmptyTileAbove(int indexOfMove) {
		return false;
	}

	private boolean isEmptyTileLeft(int indexOfMove) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isEmtpyTileBelow(int indexOfMove) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isEmptyTileRight(int indexOfMove) {
		// TODO Auto-generated method stub
		return false;
	}
}
