import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;

public class CreateMenu {
    public CreateMenu() {

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

      JButton button = new JButton("Create");
      button.addActionListener(actionEvent -> {
        nameFrame.setVisible(true);
        frame.dispose();
            });
            panel.add(button);
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);

      nameButton.addActionListener(actionEvent2 -> {

            String input = text.getText();
            if(Main.objectname.contains(input)) {

              answer.setVisible(true);
            }

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
                nameFrame.dispose();
                }
            });
    }
}
