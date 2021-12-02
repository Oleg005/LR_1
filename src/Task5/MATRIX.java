package Task5;

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

    public MATRIX transposition() {
        final MATRIX tMATRIX = new MATRIX (this.columns, this.rows);

        for (int i = 0; i < tMATRIX.rows; i++) {
            for (int j = 0; j < tMATRIX.columns; j++) {
                tMATRIX.array[i][j] = this.array[j][i];
            }
        }
        return tMATRIX;
    }

}
