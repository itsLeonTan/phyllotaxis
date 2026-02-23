
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
        //frame.setLayout(null);

        frame.add(new Panel());

        // Panel control = new Panel();
        // control.setBounds(0, 0, 400, 600);
        // frame.add(control);

        frame.setVisible(true);
    }    
}
