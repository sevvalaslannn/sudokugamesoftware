package sudokugames;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    Main vista;
    MenuController menuController;
    private final int MAX_GAMES = 10;


    public Menu(Main vista, Game game) {
        super();
        this.vista = vista;
        menuController = new MenuController(vista, null);

        this.setLayout(new GridLayout(5,5));
        for (int i = 1; i <= MAX_GAMES; i++) {
            this.add(createMenuPanel(i, "Game - " + i));
        }
    }

    private Component createMenuPanel(int gameNumber, String name) {
        JPanel jPanel = new JPanel(new BorderLayout());

        jPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(10,10,10,10),BorderFactory.createTitledBorder(name)));

        JButton btnA = createBtn("Game-"+gameNumber, "image/sudoku.png","game"+gameNumber);

        jPanel.add(btnA);

        return jPanel;
    }

    private JButton createBtn(String name, String iconName, String actionCommand) {
        JButton btn = new JButton();
        btn.setName(name);
        Icon icon = new ImageIcon(iconName);
        btn.setIcon(icon);
        btn.setActionCommand(actionCommand);
        btn.addActionListener(menuController);
        return btn;
    }



}
