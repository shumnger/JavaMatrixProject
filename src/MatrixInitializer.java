public class MatrixInitializer {
    public static Element[][] initializeMatrix(int rows, int cols) {
        Element[][] matrix = new Element[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = new Element(i, j);
            }
        }
        return matrix;
    }
}

