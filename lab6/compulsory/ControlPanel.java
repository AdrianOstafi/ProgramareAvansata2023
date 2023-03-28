package lab6.compulsory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton loadButton = new JButton("Load");
    JButton saveButton = new JButton("Save");
    JButton resetButton = new JButton("Reset");
    JButton exitButton = new JButton("Exit");

    public ControlPanel(MainFrame frame) {
        this.frame = frame;
        init();
    }
    private void init() {
        setLayout(new GridLayout(1, 4));

        loadButton.addActionListener(this::exitGame);
        saveButton.addActionListener(this::exitGame);
        resetButton.addActionListener(this::exitGame);
        exitButton.addActionListener(this::exitGame);

        add(loadButton);
        add(saveButton);
        add(resetButton);
        add(exitButton);
    }
    private void exitGame(ActionEvent e) {
        frame.dispose();
    }
    //...TODO
}

