package sudokugames;


import javax.swing.*;

import java.awt.*;

public class Main extends JFrame {

    JPanel mainPanel;
    Menu menuScreen;

    public Main() throws HeadlessException {
        this.setTitle("Sudoku Game");
        this.setSize(840,790);
        this.setLocationRelativeTo(null);

        this.setContentPane(createMenu());
        this.repaint();
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private Container createMenu() {
        mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(new Menu(this), BorderLayout.CENTER);
        return mainPanel;
    }

    public void changeGamePanel(JPanel panel) {
        BorderLayout layout = (BorderLayout) mainPanel.getLayout();
        mainPanel.remove(layout.getLayoutComponent(BorderLayout.CENTER));
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.validate();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Main main = new Main();
    }
}
