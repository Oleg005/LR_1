package Task6;

public class MATRIX {
    private final int rows;
    private final int columns;
    private final int[][] array;

    public MATRIX(final int rows, final int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }

    public MATRIX random(final int min, final int max) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.array[i][j] = (int) ((Math.random() * (max - min)) + min);
            }
        }
        return this;
    }

    public void printMATRIX() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public MATRIX multi(final MATRIX matrix) {
        if (this.columns != matrix.rows) {throw new IndexOutOfBoundsException("Wrong matrix dimensions!");}

        final MATRIX result = new MATRIX(this.rows, matrix.columns);

        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < matrix.columns; j++)
                for (int k = 0; k < matrix.rows; k++)
                    result.array[i][j] += (this.array[i][k] * matrix.array[k][j]);
        return result;
    }
}
