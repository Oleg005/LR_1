package Task3;

import java.lang.Math;

public class Main {
    public static void main(final String[] args) {
        final int[] num = {5, 10, 1, 4, 3, 0, 6, 9, 3};
        final char[] ch = {'a', 'k', 'n', 'o', 'm', 'l', 'r'};

        System.out.println(combine(num, ch));
    }

    public static String combine(final int[] num, final char[] ch) {
        String str = "";
        final int size = Math.max(num.length, ch.length);
        for (int i = 0; i < size; i++) {
            if (i < num.length)
                str += num[i];
            if (i < ch.length)
                str += ch[i];
        }
        return str;
    }
}