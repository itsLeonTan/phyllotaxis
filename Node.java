public class Node {
    public int nodeR; // node's radius
    public float r; // c * sqrt(n)
    public float deg;

    public float x;
    public float y;
    
    public Node(int count) {
        nodeR = 3;

        r = (float) (4f * Math.sqrt(count));
        deg = (count * 137.5f) % 360f;
        float rad = (float) Math.toRadians(deg);

        x = (float) (Math.sin(rad) * r);
        y = (float) (Math.cos(rad) * r);

        x += Phyllotaxis.WIDTH / 2 - nodeR;
        y += Phyllotaxis.HEIGHT / 2 - nodeR;
    }
}
