import GLOOP.GLObjekt;

import javax.swing.*;
import java.awt.*;

public interface Util {
    // A methode to set defaults for all objects that are created
    static void createObject(GLObjekt object) {
        object.setzeSelbstleuchten(255, 255, 255); // Make object shine
        Main.objectList.add(object); // Adds tho object to the list
    }

    static void attributesChanger(GLObjekt object) {
        JFrame frame = new JFrame();
        frame.setTitle("Change Obj");
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        panel.add(new JLabel()); // Spacer

        JButton up = new JButton("up");
        up.addActionListener(e -> object.setzePosition(object.gibX(), object.gibY() + 1, object.gibZ())); //Moves up
        panel.add(up);
        panel.add(new JLabel());

        JButton left = new JButton("left");
        left.addActionListener(e -> object.setzePosition(object.gibX() - 1, object.gibY(), object.gibZ())); //Moves down
        panel.add(left);

        JButton back = new JButton("back");
        back.addActionListener(e -> object.setzePosition(object.gibX(), object.gibY(), object.gibZ() - 1)); //Moved back
        panel.add(back);

        JButton right = new JButton("right");
        right.addActionListener(e -> object.setzePosition(object.gibX() + 1, object.gibY(), object.gibZ())); //Moves right
        panel.add(right);

        panel.add(new JLabel()); //Spacer

        /*
        JSlider XRot = new JSlider(SwingConstants.VERTICAL, -360, 360, 0);
        XRot.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                object.setzeDrehung(XRot.getValue(), 0, 0);
            }
        });
        panel.add(XRot);
         */

        JButton front = new JButton("front");
        front.addActionListener(e -> object.setzePosition(object.gibX(), object.gibY(), object.gibZ() + 1)); //Moves front
        panel.add(front);

        panel.add(new JLabel()); //Spacer
        panel.add(new JLabel()); //Spacer

        JButton down = new JButton("down");
        down.addActionListener(e -> object.setzePosition(object.gibX(), object.gibY() - 1, object.gibZ())); //Moves down
        panel.add(down);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}