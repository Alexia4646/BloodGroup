import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BloodGUI extends JFrame {
    private JTextField bloodTypeField;
    private JTextField rhFactorField;
    public BloodGUI(){
        
        //I am setting the JFrame
        setTitle("Blood Data Information");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(200, 80, 155)); // I set the background color to Mullbery
        setLayout(null);
        
        // I am creating and adding the Blood Type label
        JLabel bloodTypeLabel = new JLabel("Blood Type:");
        bloodTypeLabel.setBounds(30, 30, 90, 35);
        bloodTypeLabel.setForeground(Color.WHITE);
        add(bloodTypeLabel);
        
       // I am creating and adding the Blood Type field
        bloodTypeField = new JTextField();
        bloodTypeField.setBounds(130, 30, 210, 35);
        add(bloodTypeField);
        
        // I am creating and adding the Rh Factor label
        JLabel rhFactorLabel = new JLabel("Rh Factor:");
        rhFactorLabel.setBounds(30, 70, 90, 35);
        rhFactorLabel.setForeground(Color.WHITE);
        add(rhFactorLabel);
        
        // I am creating and adding the Rh Factor field
        rhFactorField = new JTextField();
        rhFactorField.setBounds(130, 70, 210, 35);
        add(rhFactorField);
        
        // I am creating and adding the Submit button
        JButton submitButton = new JButton("Submit:");
        submitButton.setBounds(160, 110, 110, 40);
        submitButton.setBackground(Color.WHITE);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bloodTypeText = bloodTypeField.getText();
                String rhFactorText = rhFactorField.getText();

                // adding the exceptions
                try{
                    BloodType bloodType = BloodType.valueOf(bloodTypeText.toUpperCase());
                    if(!(rhFactorText.length() == 1 && (rhFactorText.charAt(0) == '+' || rhFactorText.charAt(0) == '-'))){
                        throw new IllegalArgumentException("Rh Factor must be '+' or '-'.");
                    }
                    char rhFactor = rhFactorText.charAt(0);
                    BloodData bloodData = new BloodData(bloodType, rhFactor);
                    JOptionPane.showMessageDialog(null, "Blood Data Information:\n" + bloodData.toString());
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args){
        new BloodGUI();
    }

}
