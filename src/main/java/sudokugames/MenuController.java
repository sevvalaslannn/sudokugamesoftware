package sudokugames;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    Main vista;
    private final Game game;
    public MenuController(Main vista, Game game) {
        this.vista = vista;
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option = e.getActionCommand();

        switch (option) {
            case "game1":
                System.out.println("IS  PRESSING GAME 1");
                vista.changeGamePanel(new GameOne(vista, null));
                break;
            case "game2":
                System.out.println("IS  PRESSING GAME 2");
                vista.changeGamePanel(new GameTwo(vista,null));
                break;
            case "game3":
                System.out.println("IS  PRESSING GAME 3");
                vista.changeGamePanel(new GameThree(vista,null));
                break;
            case "game4":
                System.out.println("IS  PRESSING GAME 4");
                vista.changeGamePanel(new GameFour(vista,null));
                break;
            case "game5":
                System.out.println("IS  PRESSING GAME 5");
                vista.changeGamePanel(new GameFive(vista,null));
                break;
            case "game6":
                System.out.println("IS  PRESSING GAME 6");
                vista.changeGamePanel(new GameSix(vista,null));
                break;
            case "game7":
                System.out.println("IS  PRESSING GAME 7");
                vista.changeGamePanel(new GameSeven(vista,null));
                break;
            case "game8":
                System.out.println("IS  PRESSING GAME 8");
                vista.changeGamePanel(new GameEight(vista,null));
                break;
            case "game9":
                System.out.println("IS  PRESSING GAME 9");
                vista.changeGamePanel(new GameNine(vista,null));
                break;
            case "game10":
                System.out.println("IS  PRESSING GAME 10");
                vista.changeGamePanel(new GameTen(vista,null));
                break;
        }
    }
}

