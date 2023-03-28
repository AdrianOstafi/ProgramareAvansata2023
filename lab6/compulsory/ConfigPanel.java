package lab6.compulsory;

//import jdk.internal.icu.util.CodePointMap;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ConfigPanel extends JPanel {
    final MainFrame frame;
    //public CodePointMap.Range dotsField;
    JLabel dotsLabel;
    JSpinner dotsSpinner;
    JComboBox linesCombo;
    JButton createButton;
    private int numVertices;

    public ConfigPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        //create the label and the spinner
        dotsLabel = new JLabel("Number of dots:");
        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));

        createButton = new JButton("Create new game");

        add(dotsLabel);
        add(dotsSpinner);
        add(createButton);

    }

//    public int getNumberOfDots() {
//
//        dotsSpinner = new JSpinner(new SpinnerNumberModel(6, 3, 100, 1));
//
//        Number number = (Number) dotsSpinner.getValue();
//
//        return number.intValue();
//    }
}
