import GLOOP.*;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

public class CreateMenu {
    public CreateMenu() {
            JFrame frame = new JFrame();
            frame.setTitle("Create");
            frame.setLocationRelativeTo(null); // Middle of the screen

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0,1));

            String[] items = {"Cube", "Sphere", "Torus", "Cone", "Truncated Cone", "Cylinder"};
            JComboBox<String> cb = new JComboBox<>(items);
            panel.add(cb);

            JButton button = new JButton("Create");
            button.addActionListener(actionEvent -> {
                switch (Objects.requireNonNull(cb.getSelectedItem()).toString().toLowerCase(Locale.ROOT)) {
                    case "cube": Util.createObject(new GLWuerfel(0, 0, 0, 10));
                        break;
                    case "sphere": Util.createObject(new GLKugel(0, 0, 0, 10));
                        break;
                    case "torus": Util.createObject(new GLTorus(0, 0, 0, 0, 0));
                        break;
                    case "cone": Util.createObject(new GLKegel(0, 0, 0, 10, 10));
                        break;
                    case "truncated cone": Util.createObject(new GLKegelstumpf(0,0,0,10,10,10));
                        break;
                    case "cylinder": Util.createObject(new GLZylinder(0, 0, 0, 10, 10));
                        break;
                    default: System.out.println("Tried to create not handheld object");
                }
                frame.dispose(); // Close the frame
            });
            panel.add(button);

            frame.add(panel);
            frame.pack();
            frame.setVisible(true); // Open the frame
    }
}
