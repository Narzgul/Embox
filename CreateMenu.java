import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

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

            JButton button = new JButton("Create");
            button.addActionListener(actionEvent -> {
                switch (Objects.requireNonNull(cb.getSelectedItem()).toString().toLowerCase(Locale.ROOT)) {
                    case "cube":
                        Main.createQuader(0, 0, 0, 10, 10, 10);
                        break;
                    case "sphere":
                        Main.createKugel(0, 0, 0, 10);
                        break;
                    default:
                        System.out.println("Neither cube nor sphere");
                }
                frame.dispose();
            });
            panel.add(button);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
