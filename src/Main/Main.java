package Main;

public class Main {
    public static void main(String[] args) {
        Arena playingArena = new Arena();

        Player p1 = new Player(1,"Harsh");
        playingArena.addPlayer(p1);
        Player p2 = new Player(2,"Rudra");
        playingArena.addPlayer(p2);
        Player p3 = new Player(3,"Prasham");
        playingArena.addPlayer(p3);
        Player p4 = new Player(4,"Samkit");
        playingArena.addPlayer(p4);

        Dice dice = new Dice(1);
        playingArena.setDice(dice);

        playingArena.setWinningDestination(100);
        playingArena.startGame();
    }
}