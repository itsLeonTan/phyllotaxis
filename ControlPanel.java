import java.awt.Color;
import javax.swing.*;

public class ControlPanel extends JPanel {
    final int SPACING = 37;

    public ControlPanel() {
        setBackground(new Color(230, 230, 230));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createVerticalStrut(SPACING));

        add(new JLabel("DELAY (ms)"));
        JSlider delaySlider = new JSlider(0, 500, 100);
        delaySlider.setMajorTickSpacing(100);
        delaySlider.setMinorTickSpacing(25);
        delaySlider.setPaintTicks(true);
        delaySlider.setPaintLabels(true);
        add(delaySlider);

        add(Box.createVerticalStrut(SPACING));

        add(new JLabel("NODE RADIUS"));
        JSlider sizeSlider = new JSlider(1, 10, 4);
        sizeSlider.setMajorTickSpacing(1);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setPaintLabels(true);
        add(sizeSlider);

        add(Box.createVerticalStrut(SPACING));

        add(new JLabel("DIVERGENT ANGLE (DEGREE)"));
        JSpinner angleSpinner = new JSpinner(new SpinnerNumberModel(137.5, 0.0, 360.0, 0.1));
        angleSpinner.setMaximumSize(angleSpinner.getPreferredSize());
        angleSpinner.setAlignmentX(LEFT_ALIGNMENT);
        add(angleSpinner);

        add(Box.createVerticalStrut(SPACING));

        add(new JLabel("COLOUR"));
        String[] options = {"Radius Gradient", "Count Gradient", "Angle Gradient", "Red", "Green", "Blue"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setMaximumSize(comboBox.getPreferredSize());
        comboBox.setAlignmentX(LEFT_ALIGNMENT);
        add(comboBox);

        add(Box.createVerticalStrut(SPACING));

        add(new JLabel("PLACEMENT BEAM"));
        JCheckBox beamCheckBox = new JCheckBox("Enable", true);
        beamCheckBox.setAlignmentX(LEFT_ALIGNMENT);
        add(beamCheckBox);

        add(Box.createVerticalStrut(SPACING));

        JButton restartButton = new JButton("Restart");
        restartButton.setAlignmentX(LEFT_ALIGNMENT);
        add(restartButton);


        delaySlider.addChangeListener(e -> {
            MainPanel.changeDelay(delaySlider.getValue());
        });
        sizeSlider.addChangeListener(e -> {
            MainPanel.changeNodeRadius(sizeSlider.getValue());
        });
        angleSpinner.addChangeListener(e -> {
            MainPanel.changeAngle((float) (double) angleSpinner.getValue());
        });
        comboBox.addActionListener(e -> {
            if (comboBox.getSelectedItem() == "Red") MainPanel.color = 'r';
            else if (comboBox.getSelectedItem() == "Blue") MainPanel.color = 'b';
            else if (comboBox.getSelectedItem() == "Green") MainPanel.color = 'g';
            else if (comboBox.getSelectedItem() == "Radius Gradient") MainPanel.color = 'R';
            else if (comboBox.getSelectedItem() == "Count Gradient") MainPanel.color = 'C';
            else MainPanel.color = 'A';
        });
        beamCheckBox.addActionListener(e -> {
            MainPanel.showBeam = beamCheckBox.isSelected();
        });
        restartButton.addActionListener(e -> {
            MainPanel.count = 0;
        });
    }
}
