import javax.swing.*;
import java.awt.GridLayout;

public class CreateMenu {
    public CreateMenu() {
            JFrame frame = new JFrame();
            frame.setTitle("Test");
            frame.setSize(200, 200);
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0,1));

            JButton button = new JButton("test");
            panel.add(button);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
