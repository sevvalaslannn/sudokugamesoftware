package sudokugames;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GameControllerTest {
    Main vista;
    GameController gameController;

    @Before
    public void setUp() {
        vista = new Main();
       gameController = new GameController(vista);
    }

    @Test
    public void testC() {
        int a = 1;
        int b = 7;
        int c = 4;

        Assert.assertTrue(gameController.verify(a,b,c));
    }


}

