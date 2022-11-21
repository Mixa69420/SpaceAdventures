package entity.impl;

import entity.Entity;
import me.tim.BoundingBox2D;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEntity extends Entity {
    private final BufferedImage image;

    public ImageEntity(BoundingBox2D boundingBox2D, BufferedImage image) {
        super(boundingBox2D);
        this.image = image;
    }

    public ImageEntity(BoundingBox2D boundingBox2D, String fileName) throws IOException {
        super(boundingBox2D);
        this.image = ImageIO.read(new File(fileName));
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(
                this.getImage(),
                (int) this.getBoundingBox2D().getXPos(),
                (int) this.getBoundingBox2D().getYPos(),
                (int) this.getBoundingBox2D().getWidth(),
                (int) this.getBoundingBox2D().getHeight(), null
        );
    }

    public BufferedImage getImage() {
        return image;
    }
}
