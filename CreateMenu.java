import GLOOP.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Locale;
import java.util.Objects;

public class CreateMenu {
    public CreateMenu() {
        final String[] texturePath = {""};

      JFrame nameFrame = new JFrame();
      nameFrame.setSize(200,100);
      nameFrame.setVisible(false);
      nameFrame.setTitle("Name");
      nameFrame.setLocationRelativeTo(null);

      JPanel namePanel = new JPanel();
      namePanel.setLayout(new GridLayout(0,1));
      nameFrame.add(namePanel);

      JTextField text = new JTextField(1);
      text.setBounds(10,10,100,20);
      namePanel.add(text);

      JTextField answer = new JTextField("This name is already existing!");
      answer.setVisible(false);
      namePanel.add(answer);

      JButton nameButton = new JButton("Ok");
      namePanel.add(nameButton);

      JFrame frame = new JFrame();
      frame.setTitle("Create");
      frame.setLocationRelativeTo(null);

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(0,1));

      String[] items = {"Cube", "Sphere", "Torus", "Cone", "Truncated Cone", "Cylinder"};
      JComboBox<String> cb = new JComboBox<>(items);
      panel.add(cb);

        JFileChooser fileChooser = new JFileChooser();
        JButton addTexture = new JButton("Add a texture");
        addTexture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileChooser.showOpenDialog(nameFrame);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    texturePath[0] = file.getAbsolutePath();
                }
            }
        });
        namePanel.add(addTexture);

      JButton button = new JButton("Create");
      button.addActionListener(createEvent -> {
        nameFrame.setVisible(true);
        frame.dispose();
            });
            panel.add(button);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);

        nameButton.addActionListener(nameEvent -> {

            String input = text.getText();
            if(Main.objectname.contains(input)) {
              answer.setVisible(true);
            }

            else {
                Main.objectname.add(input);

            switch (Objects.requireNonNull(cb.getSelectedItem()).toString().toLowerCase(Locale.ROOT)) {
                case "cube": Util.createObject(new GLWuerfel(0, 0, 0, 10));
                    break;
                case "sphere": Util.createObject(new GLKugel(0, 0, 0, 10, texturePath[0]));
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
                    break;
            }
              nameFrame.dispose();
          }
        });

    }
}
