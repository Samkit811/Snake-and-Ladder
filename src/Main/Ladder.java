package Main;

import java.util.HashMap;

public class Ladder {
    private HashMap<Integer, Integer> ladderPositions;

    public Ladder(){
        this.ladderPositions = new HashMap<>();
        this.ladderPositions.put(5, 19);
        this.ladderPositions.put(15, 35);
    }

    public boolean playerGetLadder(int position){
        return this.ladderPositions.containsKey(position);
    }

    public int playerPositionAfterLadder(int position){
        return this.ladderPositions.get(position);
    }
}
