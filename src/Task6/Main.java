package Task6;

public class Main {
    public static void main(final String[] args) {
        try {
            final MATRIX mat1 = new MATRIX(7, 3);
            final MATRIX mat2 = new MATRIX(3, 7);

            mat1.random(4, 0);
            mat2.random(4, 0);

            mat1.printMATRIX();
            mat2.printMATRIX();

            mat1.multi(mat2).printMATRIX();
        } catch (final IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}