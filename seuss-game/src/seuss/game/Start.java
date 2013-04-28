package seuss.game;

import org.newdawn.slick.SlickException;

/**
 *
 * @author juho karenko
 */
public class Start {
    public static void main(String[] args) throws SlickException {
        SeussGame game = new SeussGame("seuss-game");
        game.runGame();
    }
}
