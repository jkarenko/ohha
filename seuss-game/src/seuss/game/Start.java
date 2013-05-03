package seuss.game;

import org.newdawn.slick.SlickException;

/**
 *
 * @author juho karenko
 */
public class Start {
    
    /**
     * starts the game loop in SeussGame
     *
     * @param args command line arguments
     * @throws SlickException
     */
    public static void main(String[] args) throws SlickException {
        SeussGame game = new SeussGame("seuss-game");
        game.runGame();
    }
}
