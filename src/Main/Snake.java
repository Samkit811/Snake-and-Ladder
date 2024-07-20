package Main;

import java.util.HashMap;

public class Snake {
    private HashMap<Integer, Integer> snakePositions;

    public Snake(){
        this.snakePositions = new HashMap<>();
        this.snakePositions.put(25, 10);
        this.snakePositions.put(90, 20);
    }

    public boolean playerGetSnack(int position){
        return this.snakePositions.containsKey(position);
    }

    public int playerPositionAfterSnack(int position){
        return this.snakePositions.get(position);
    }
}
