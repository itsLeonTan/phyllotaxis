
import javax.swing.JFrame;

public class Phyllotaxis {
    public static int WIDTH = 1000;
    public static int HEIGHT = 600;
    public static void main() {
        JFrame frame = new JFrame("Phyllotaxis");
        frame.setSize(WIDTH, HEIGHT);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        MainPanel mainPanel = new MainPanel();
        mainPanel.setBounds(400, 0, MainPanel.WIDTH, MainPanel.HEIGHT);
        frame.add(mainPanel);

        ControlPanel controlPanel = new ControlPanel();
        controlPanel.setBounds(0, 0, 400, 600);
        frame.add(controlPanel);

        frame.setVisible(true);
    }    
}
