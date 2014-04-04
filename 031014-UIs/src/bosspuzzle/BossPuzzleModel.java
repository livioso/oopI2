package bosspuzzle;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

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
public class BossPuzzleModel extends Observable{
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

	/** 
	 * This is the string that represents the empty tile
	 */
	private final String EMPTYTILESTRING = "";
	
	public BossPuzzleModel () {
		resetBossPuzzle();
	}
	
	public void resetBossPuzzle () {
		// just initialize all 1 - 9
		for(Integer i = 0; i <= 8; i++) {
			gameMapStatesModel.set(i, i.toString());
		}
		
		// the last field is empty
		gameMapStatesModel.set(8, EMPTYTILESTRING);
	}
	
	public int getIndexOfEmptyTile() {
		int indexOfEmptyTile = gameMapStatesModel.indexOf(EMPTYTILESTRING);
		
		// there must be a empty tile
		// otherwise there is something 
		// seriously wrong.
		assert(indexOfEmptyTile != -1);
		
		return indexOfEmptyTile;
	}

	public void makeMoveOnTile(int indexOfMove) {
		if(isMoveOnTilePossible(indexOfMove)) {
			
			
			
			// there was a change notify 
			// our observers about this
			setChanged();
			notifyObservers(gameMapStatesModel);
		}	
	}

	private boolean isMoveOnTilePossible(int indexOfMove) {
		boolean moveOnTilePossible = false;
		
		moveOnTilePossible = moveOnTilePossible || isMoveUpPossible(indexOfMove);
		moveOnTilePossible = moveOnTilePossible || isMoveDownPossible(indexOfMove);
		moveOnTilePossible = moveOnTilePossible || isMoveLeftPossible(indexOfMove);
		moveOnTilePossible = moveOnTilePossible || isMoveRightPossible(indexOfMove);
		
		return moveOnTilePossible;
	}

	private boolean isMoveUpPossible(int indexOfMove) {
		int upTileIndex = indexOfMove - 3;
		return (upTileIndex >= 0 && upTileIndex <= 8);
	}
	
	private boolean isMoveDownPossible(int indexOfMove) {
		int upTileIndex = indexOfMove + 3;
		return (upTileIndex >= 0 && upTileIndex <= 8);
	}
	
	private boolean isMoveLeftPossible(int indexOfMove) {
		int upTileIndex = indexOfMove - 1;
		return (upTileIndex >= 0 && upTileIndex <= 8);
	}
	
	private boolean isMoveRightPossible(int indexOfMove) {
		int upTileIndex = indexOfMove + 3;
		return (upTileIndex >= 0 && upTileIndex <= 8);
	}
}
