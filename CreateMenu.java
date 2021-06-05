import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

public class CreateMenu {
    public CreateMenu() {
            JFrame frame = new JFrame();
            frame.setTitle("Create");
            frame.setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0,1));

            String[] items = {"Cube", "Sphere", "Torus", "Cone", "Truncated Cone", "Cylinder"};
            JComboBox<String> cb = new JComboBox<>(items);
            panel.add(cb);

            JButton button = new JButton("Create");
            button.addActionListener(actionEvent -> {
                switch (Objects.requireNonNull(cb.getSelectedItem()).toString().toLowerCase(Locale.ROOT)) {
                    case "cube": Util.createCuboid(0, 0, 0, 10, 10, 10);
                        break;
                    case "sphere": Util.createSphere(0, 0, 0, 10);
                        break;
                    case "torus": Util.createTorus(0, 0, 0, 10, 10);
                        break;
                    case "cone": Util.createCone(0, 0, 0, 10, 10);
                        break;
                    case "truncated cone": Util.createTruncatedCone(0, 0, 0, 20, 10, 15);
                        break;
                    case "cylinder": Util.createCylinder(0, 0, 0, 10, 20);
                        break;
                    default: System.out.println("Tried to create not handheld object");
                }
                frame.dispose();
            });
            panel.add(button);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
    }
}
