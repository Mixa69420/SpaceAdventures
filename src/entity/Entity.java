package entity;

import me.tim.BoundingBox2D;

import java.awt.*;

public abstract class Entity {
    private BoundingBox2D boundingBox2D;

    public Entity(BoundingBox2D boundingBox2D) {
        this.boundingBox2D = boundingBox2D;
    }

    /**
     * Used to draw any entity
     *
     * @param graphics2D Java AWT Graphics object
     */
    public abstract void draw(Graphics2D graphics2D);

    public void move(float x, float y) {
        this.boundingBox2D.setXPos(this.boundingBox2D.getXPos() + x);
        this.boundingBox2D.setYPos(this.boundingBox2D.getYPos() + y);
    }

    public BoundingBox2D getBoundingBox2D() {
        return boundingBox2D;
    }

    public void setBoundingBox2D(BoundingBox2D boundingBox2D) {
        this.boundingBox2D = boundingBox2D;
    }
}
