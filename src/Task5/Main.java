package Task5;

public class Main {
    public static void main(final String[] args) {
        final MATRIX mat = new MATRIX(7, 3);

        mat.random(4, 0);

        mat.printMATRIX();

        mat.transposition().printMATRIX();
    }
}
