import java.util.ArrayList;
import java.util.List;

public class NeighborFinder {
    public static List<Element> getNeighbors(Element[][] matrix, Element element) {
        List<Element> neighbors = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = element.x;
        int y = element.y;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                neighbors.add(matrix[newX][newY]);
            }
        }
        return neighbors;
    }
}

