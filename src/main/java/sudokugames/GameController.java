package sudokugames;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameController implements ActionListener {

    Main vista;
    private final String MESSAGE_WON = "congratulations you won the game";
    private final String MESSAGE_LOST = "You entered wrong values.Try again";
    public GameController(Main vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Integer a = -1, b = -1, c = -1;
        String command = (String) e.getActionCommand();
        String message;

        if(command.equals("back")) {
            vista.changeGamePanel(new Menu(vista, null));
        } else if(command.equals("finish")) {
            System.out.println("Game finished");
        }
        else {
            Object valueA  = JOptionPane.showInputDialog("write the value of a: ");
            if(valueA instanceof Integer) {
                a = (Integer) valueA;
            }

            Object valueB  = JOptionPane.showInputDialog("write the value of b: ");
            if(valueB instanceof Integer) {
                b = (Integer) valueB;
            }


            Object valueC  = JOptionPane.showInputDialog("write the value of c: ");
            if(valueC instanceof Integer) {
                c = (Integer) valueC;
            }

            verify(a,b,c);
        }
    }

    public boolean verify(int a, int b, int c) {
        boolean answer = false;
        if (a==1 && b==7  && c==4) {
            JOptionPane.showMessageDialog(null, MESSAGE_WON,"won" ,JOptionPane.INFORMATION_MESSAGE);
            answer = true;
        }
        else {
            JOptionPane.showMessageDialog(null, MESSAGE_LOST,"fail" ,JOptionPane.INFORMATION_MESSAGE);
        }
        return answer;
    }
}
