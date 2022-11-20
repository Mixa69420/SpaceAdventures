import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Label extends JLabel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //Grafiken zeichnen
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        //Hintergrund zeichnen
        g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600,  null);
        g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600,  null);

        for(int i=0; i<=4; i++){
            g.drawImage(Var.iFlagge1, Var.UDSSRx1[i], Var.UDSSRy1[i], 48, 38, null);
        }
        for(int i=0; i<=1; i++){
            g.drawImage(Var.iFlagge2, Var.UDSSRx2[i], Var.UDSSRy2[i], 48, 38, null);
        }
        g.drawImage(Var.iFlagge3, Var.UDSSRx3, Var.UDSSRy3, 48, 38, null);


        //Gegner zeichnen
        for(int i = 0; i<4; i++) {
            g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 80, 60, null);
        }

        //Feuer animation zeichnen
        if(Var.feueranimation == 0){
            g.drawImage(Var.ifeuer1, Var.x, Var.y+64, 50, 50,  null);
        } else if(Var.feueranimation == 1){
            g.drawImage(Var.ifeuer2, Var.x, Var.y+64, 50, 50,  null);
        }

        //Rakete zeichnen
        g.drawImage(Var.irakete, Var.x, Var.y, 50, 70,  null);

        repaint();
    }
}
