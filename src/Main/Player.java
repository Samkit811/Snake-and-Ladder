package Main;

public class Player {
    private int id;
    private String name;
    private int position;
    private int winnerPosition;

    public Player(int id,String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setWinnerPosition(int winnerPosition) {
        this.winnerPosition = winnerPosition;
    }

    public boolean isPlayerWinner(int currentPosition){
        return currentPosition == this.winnerPosition;
    }
}
