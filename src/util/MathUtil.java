package util;

import java.util.Random;

public class MathUtil {
    public static int random(int min, int max) {
        return new Random().nextInt(max + 1 - min) + min;
    }
}
