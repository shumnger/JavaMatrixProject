import java.util.List;

public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        Element[][] matrix = MatrixInitializer.initializeMatrix(rows, cols);

        Element target = matrix[2][2];
        List<Element> neighbors = NeighborFinder.getNeighbors(matrix, target);

        System.out.println("Target: " + target);
        System.out.println("Neighbors:");
        for (Element neighbor : neighbors) {
            System.out.println(neighbor);
        }
    }
}
