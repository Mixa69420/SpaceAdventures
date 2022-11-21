package gui;

import game.MoveHandler;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Frame extends JFrame {
    public static final int SCREEN_WIDTH = 1920, SCREEN_HEIGHT = 1080;
    public static final String backgroundImage = "./res/Space.jpg";

    private final RenderManager renderManager;

    public Frame() throws IOException {
        this.renderManager = new RenderManager(ImageIO.read(new File(backgroundImage)));
        this.load();
    }

    private void load() {
        this.setTitle("Space Adventures");
        this.requestFocus();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.setResizable(false);
        this.addKeyListener(new MoveHandler(this.renderManager));

        this.add(this.renderManager);
        this.renderManager.setVisible(true);
        this.setVisible(true);
    }

    public RenderManager getRenderManager() {
        return renderManager;
    }
}
