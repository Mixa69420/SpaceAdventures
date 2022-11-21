import gui.Frame;

import java.io.IOException;

public class Bootstrap {
    private static void start() throws IOException {
        new Frame();
    }

    public static void main(String[] args) throws IOException {
        Bootstrap.start();
    }
}
