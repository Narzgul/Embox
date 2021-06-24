import GLOOP.GLObjekt;

import javax.swing.*;
import java.awt.*;

public class ListMenu {
    public ListMenu() {
        JFrame frame = new JFrame();
        frame.setTitle("Objects");
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JLabel title = new JLabel("All Objects:");
        panel.add(title);
        for (GLObjekt obj : Main.objectList) {
            JButton button = new JButton(Main.objectName.get(Main.objectList.indexOf(obj))); // Button with name of the object
            button.addActionListener(e -> Util.attributesChanger(obj)); // Open the attributes changer on button press
            panel.add(button);
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
