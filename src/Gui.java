import javax.swing.*;

public class Gui {

    public Gui(){

        Var.jf1 = new JFrame();
        Var.jf1.setSize(Var.screenwidth, Var.screenheight);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.setResizable(false);
        Var.jf1.requestFocus();
        Var.jf1.setTitle("Space Adventure");
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.setVisible(true);


        Var.lbl1 = new Label();
        Var.lbl1.setBounds(0,0, Var.screenwidth, Var.screenheight);
        Var.lbl1.setVisible(true);
        Var.jf1.add(Var.lbl1);
    }
}
