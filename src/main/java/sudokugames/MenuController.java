package sudokugames;



import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class MenuController implements ActionListener {

    Main vista;

    public MenuController(Main vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option = e.getActionCommand();

        switch (option) {
            case "game1":
                System.out.println("IS  PRESSING GAME 1");
                vista.changeGamePanel(new GameOne(vista));
                break;
            case "game2":
                System.out.println("IS  PRESSING GAME 2");
                vista.changeGamePanel(new GameTwo(vista));
                break;
            case "game3":
                System.out.println("IS  PRESSING GAME 3");
                //vista.changeGamePanel(new GameThree(vista));
                break;
            case "game4":
                System.out.println("IS  PRESSING GAME 4");
                //vista.changeGamePanel(new GameFour(vista));
                break;
            case "game5":
                System.out.println("IS  PRESSING GAME 5");
                //vista.changeGamePanel(new GameFive(vista));
                break;
            case "game6":
                System.out.println("IS  PRESSING GAME 6");
                //vista.changeGamePanel(new GameSix(vista));
                break;
            case "game7":
                System.out.println("IS  PRESSING GAME 7");
                //vista.changeGamePanel(new GameSeven(vista));
                break;
            case "game8":
                System.out.println("IS  PRESSING GAME 8");
                //vista.changeGamePanel(new GameEight(vista));
                break;
            case "game9":
                System.out.println("IS  PRESSING GAME 9");
                //vista.changeGamePanel(new GameNine(vista));
                break;
            case "game10":
                System.out.println("IS  PRESSING GAME 10");
                //vista.changeGamePanel(new GameTen(vista));
                break;
        }
    }
}

