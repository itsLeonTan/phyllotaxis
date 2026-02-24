public class Node {
    public int nodeR; // node's radius
    public float r; // c * sqrt(n)
    public float deg;

    public float x;
    public float y;
    
    public Node(int count, int nodeR) {
        this.nodeR = nodeR;

        r = (float) (6f * Math.sqrt(count));
        deg = (count * MainPanel.angle) % 360f;
        float rad = (float) Math.toRadians(deg);

        x = (float) (Math.sin(rad) * r);
        y = (float) (Math.cos(rad) * r);
        x += MainPanel.WIDTH / 2 - nodeR;
        y += MainPanel.HEIGHT / 2 - nodeR;
    }
}
