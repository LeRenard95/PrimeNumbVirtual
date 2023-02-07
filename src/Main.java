import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner primeScan = new Scanner(System.in);
        System.out.println();

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel UP = new JLabel();


        panel.add(UP);

        UP.setText("For next Prime Number press arrow up");


        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
         {

        frame.add(panel);
    }
}