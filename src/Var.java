import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Var {

    static JFrame jf1;

    static int screenwidth = 800, screenheight = 600;
    static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed =5;
    static int x = 400, y = 400;
    static int speedup = 3, speeddown =2, speedleft = 2, speedright = 2;
    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static Label lbl1 = new Label();

    static BufferedImage ib1,ib2;
    static BufferedImage irakete;

    public Var(){

            try{
                //Background
                ib1 = ImageIO.read(new File("Rsc/Space.jpg"));
                ib2 = ImageIO.read(new File("Rsc/Space.jpg"));
                //Rakete
                irakete = ImageIO.read(new File("Rsc/rakete.png"));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Bilder konnten nicht laden");
            }
    }

}
