package gui;

import entity.Entity;
import entity.impl.EntityPlayer;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class RenderManager extends JLabel {
    private final ArrayList<Entity> entities;
    private final BufferedImage backgroundImage;

    public RenderManager(BufferedImage backgroundImage) throws IOException {
        this.entities = new ArrayList<>();
        this.entities.add(new EntityPlayer());

        this.backgroundImage = backgroundImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (this.backgroundImage == null) {
            g.fillRect(0, 0, Frame.SCREEN_WIDTH, Frame.SCREEN_HEIGHT);
        }else {
            g.drawImage(
                    this.backgroundImage,
                    0,
                    0,
                    Frame.SCREEN_WIDTH,
                    Frame.SCREEN_HEIGHT,
                    null
            );
        }

        for (Entity entity : this.entities) {
            entity.draw((Graphics2D) g);
        }
        this.repaint();
    }

    public Entity getEntity(Class<? extends Entity> clazz) {
        for (Entity entity : this.getEntities()) {
            if (entity.getClass().equals(clazz)) return entity;
        }
        return null;
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
