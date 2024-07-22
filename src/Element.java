public class Element {
    int x, y;

    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Element(" + "x=" + x + ", y=" + y + ')';
    }
}

