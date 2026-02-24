import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MainPanel extends JPanel {
    final public static int WIDTH = 600;
    final public static int HEIGHT = 600;
    public static int delay = 100;
    static Timer timer;

    static Node[] nodes = new Node[2000];
    public static int nodeR = 4;
    public static float angle = 137.5f;
    public static char color = 'C'; // r - red, g - green, b - blue, R - Radius Gradient, C - Count Gradient
    public static boolean showBeam = true;
    public static int count = 0;

    public MainPanel() {
        setBackground(Color.BLACK);
        nodes[0] = new Node(0, nodeR);
        timer = new Timer(delay, this::update);
        timer.start();
    }

    public static void changeDelay(int delay) {
        MainPanel.delay = delay;
        timer.setDelay(delay);
    }
    public static void changeNodeRadius(int r) {
        nodeR = r;
        for (int i = 0; i <= count; i++) {
            nodes[i] = new Node(i, nodeR);
        }
    }
    public static void changeAngle(float angle) {
        MainPanel.angle = angle;
        for (int i = 0; i <= count; i++) {
            nodes[i] = new Node(i, nodeR);
        }
    }

    private void update(ActionEvent e) {
        if (count < nodes.length - 1) {
            count++;
            nodes[count] = new Node(count, nodeR);
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (color) {
            case 'r' -> { g.setColor(Color.RED); }
            case 'g' -> { g.setColor(Color.GREEN); }
            case 'b' -> { g.setColor(Color.BLUE); }
        }
        for (int i = 0; i <= count; i++) {
            switch (color) {
                case 'R' -> { g.setColor(Color.getHSBColor(nodes[i].r / (HEIGHT / 2f), 1f, 0.8f)); }
                case 'C' -> { g.setColor(Color.getHSBColor(i / 2000f, 1f, 0.8f)); }
                case 'A' -> { g.setColor(Color.getHSBColor((float) (nodes[i].deg / 360f), 1f, 0.8f)); }
            }
            g.fillOval((int) nodes[i].x, (int) nodes[i].y, nodes[i].nodeR * 2, nodes[i].nodeR * 2);
        }
        if (showBeam && count != nodes.length - 1) {
            g.setColor(Color.WHITE);
            g.drawLine(WIDTH / 2, HEIGHT / 2, (int) nodes[count].x + nodes[count].nodeR, (int) nodes[count].y + nodes[count].nodeR);
        }
    }
}
