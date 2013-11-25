import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue Nov 12 13:32:15 IST 2013
 */



/**
 * @author unknown
 */
public class Candidate_Details extends JPanel {
    public Candidate_Details() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - AMIT JOGLEKAR
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        menu1 = new JMenu();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new FormLayout(
            "18*(default, $lcgap), default",
            "12*(default, $lgap), default"));

        //---- label1 ----
        label1.setText("Enter Name");
        add(label1, CC.xywh(15, 7, 5, 1));

        //---- textField1 ----
        textField1.setBackground(Color.yellow);
        textField1.setToolTipText("Your first name");
        add(textField1, CC.xywh(21, 7, 13, 1));

        //---- button1 ----
        button1.setText("Submit");
        add(button1, CC.xy(37, 7));

        //======== menu1 ========
        {
            menu1.setText("text");
        }
        add(menu1, CC.xy(9, 25));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - AMIT JOGLEKAR
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JMenu menu1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
