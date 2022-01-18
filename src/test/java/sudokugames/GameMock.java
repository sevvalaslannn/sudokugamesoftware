package sudokugames;

import org.easymock.EasyMock;
import org.easymock.EasyMockSupport;
import org.junit.Before;
import org.junit.Test;

public class GameMock extends EasyMockSupport {

    private Main vista;
    private Game game;
    private GameOne gameOne;

    @Before
    public void setUp(){
        vista = new Main();
        game = EasyMock.mock(Game.class);
         gameOne= new GameOne(vista, game);
    }


    @Test
    public void testPrintMessage() {
        game.display("Hello!");
        replayAll();

        game.display("Hello!");
        verifyAll();
    }
}
