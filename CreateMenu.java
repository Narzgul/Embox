import javax.swing.*;
import java.awt.GridLayout;

public class CreateMenu {
    public CreateMenu() {
            JFrame frame = new JFrame();
            frame.setTitle("Test");
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0,1));

            String[] items = {"Cube", "Sphere", "Torus"};
            JComboBox<String> cb = new JComboBox<>(items);
            panel.add(cb);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
