package entity.impl;

import gui.Frame;
import me.tim.BoundingBox2D;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class EntityPlayer extends ImageEntity {
    public EntityPlayer() throws IOException{
        super(new BoundingBox2D(Frame.SCREEN_WIDTH / 2f - 75, Frame.SCREEN_HEIGHT / 2f - 75, 75, 75), ImageIO.read(new File("./res/rakete.png")));
    }
}
