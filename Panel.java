import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel {
    Node[] nodes = new Node[8000];
    private int count = 0;

    public Panel() {
        setBackground(Color.BLACK);
        nodes[0] = new Node(count);
        Timer timer = new Timer(100, this::update);
        timer.start();
    }

    private void update(ActionEvent e) {
        if (count < nodes.length) {
            count++;
            nodes[count] = new Node(count);
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        for (int i = 0; i <= count; i++) {
            g.fillOval((int) nodes[i].x, (int) nodes[i].y, nodes[i].nodeR * 2, nodes[i].nodeR * 2);
        }
    }
}
