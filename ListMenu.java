import GLOOP.GLObjekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListMenu {
    public ListMenu() {
        JFrame frame = new JFrame();
        frame.setTitle("Objects");
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        int size = Main.objectList.size();
        if (size < 1) size = 1;
        panel.setLayout(new GridLayout(0, 1));



        JLabel title = new JLabel("All Objects:");
        panel.add(title);
        for (GLObjekt obj : Main.objectList) {
            JButton button = new JButton(Main.objectname.get(Main.objectList.indexOf(obj)));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Util.attributesChanger(obj);
                }
            });
            panel.add(button);
        }

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
