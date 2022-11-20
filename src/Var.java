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
    static int speedup = 3, speeddown =3, speedleft = 2, speedright = 2;
    static int feuer = 1, feueranimation;


    static int gegnerx[] = new int [5], gegnery[] = new int[5];
    static int gegnerspeed[] = new int [5];
    static int UDSSRx1[] = new int [5], UDSSRy1[] = new int [5];
    static int UDSSRx2[] = new int [5], UDSSRy2[] = new int [5];
    static int UDSSRx3, UDSSRy3;

    static int udssrspeed1[] = new int[5], udssrspeed2[] = new int [2], udssrspeed3;
    static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
    static Label lbl1 = new Label();

    static BufferedImage ib1,ib2;
    static BufferedImage irakete, ifeuer1, ifeuer2;
    static BufferedImage igegner1;

    public Var(){

            try{
                //Background
                ib1 = ImageIO.read(new File("Rsc/Space.jpg"));
                ib2 = ImageIO.read(new File("Rsc/Space.jpg"));
                //Rakete
                irakete = ImageIO.read(new File("Rsc/rakete.png"));
                //Feuer
                ifeuer1 = ImageIO.read(new File("Rsc/Feuer1.png"));
                ifeuer2 = ImageIO.read(new File("Rsc/Feuer2.png"));
                //Gegner
                igegner1 = ImageIO.read(new File("Rsc/gegner1.png"));


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Bilder konnten nicht laden");
            }

            gegnerspeed[0] = 3;
            gegnerspeed[1] = 4;
            gegnerspeed[2] = 3;
            gegnerspeed[3] = 4;
            gegnerspeed[4] = 3;

            udssrspeed1[0] = 2;
            udssrspeed1[1] = 3;
            udssrspeed1[2] = 2;
            udssrspeed1[3] = 4;
            udssrspeed1[4] = 3;

            udssrspeed2[0] = 4;
            udssrspeed2[1] = 5;

            udssrspeed3 = 6;

    }

}
