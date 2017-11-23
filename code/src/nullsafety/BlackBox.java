package nullsafety;

import java.util.Random;

public class BlackBox {
    public static String foo() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            return null;
        } else {
            return "Not Null";
        }
    }
}
