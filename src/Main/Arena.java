package Main;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private List<Player> players;
    private Dice dice;
    private Ladder ladder;
    private Snake snake;
    private int winningDestination;

    public Arena(){
        this.players = new ArrayList<>();
        this.ladder = new Ladder();
        this.snake = new Snake();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setWinningDestination(int winningDestination) {
        this.winningDestination = winningDestination;
    }

    public void setDice(Dice dice){
        this.dice = dice;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
        while (players.size() > 1) {
            Player currentPlayer = selectPlayingPlayer(players);
            playGame(currentPlayer);
        }
        Player losingPlayer = players.get(0);
        System.out.println(losingPlayer.getName()+" is looser");
    }

    private Player selectPlayingPlayer(List<Player> players){
        Player playingPlayer  = players.get(0);
        players.remove(0);
        return playingPlayer;
    }

    private void playGame(Player player){
        int updatedPosition = player.getPosition() + dice.rollDice();

        if(isMatchFinished(updatedPosition)){
            System.out.println(player.getName()+" is winner");
            return;
        }

        if(isPlayerMovedOutside(updatedPosition)){
            addPlayer(player);
            return;
        }

        if(this.ladder.playerGetLadder(updatedPosition)){
            System.out.println(player.getName()+" got the ladder");
            updatedPosition = this.ladder.playerPositionAfterLadder(updatedPosition);
        }
        else if(this.snake.playerGetSnack(updatedPosition)){
            System.out.println(player.getName()+" got the snake");
            updatedPosition = this.snake.playerPositionAfterSnack(updatedPosition);
        }

        player.setPosition(updatedPosition);
        addPlayer(player);
    }

    private boolean isMatchFinished(int position){
        return position == this.winningDestination;
    }

    private boolean isPlayerMovedOutside(int position){
        return position > this.winningDestination;
    }
}
