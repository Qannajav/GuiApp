import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiJava extends JFrame {

    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel jLabel = new JLabel("Input:");
    private JRadioButton jRadioButton1 = new JRadioButton("Select this");
    private JRadioButton jRadioButton2 = new JRadioButton("radio2");
    private JCheckBox jCheckBox = new JCheckBox("Check:", false);

    public SimpleGuiJava() {
        super();
        this.setBounds(100, 100, 250, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(jLabel);
        container.add(input);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);

        container.add(jRadioButton1);
        jRadioButton1.setSelected(true);

        container.add(jRadioButton2);
        container.add(jCheckBox);

        button.addActionListener(new ButtonEventListener());
        container.add(button);


    }

    class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was pressed\n";
            message += "Text is" + input.getText() + "\n";
            message += (jRadioButton1.isSelected() ? "Radio 1 #" : "Radio 2#") + "is selected \n";
            message += "Checkbox is " + ((jCheckBox.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
