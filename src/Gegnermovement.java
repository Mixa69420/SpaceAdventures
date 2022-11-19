import java.util.Timer;
import java.util.TimerTask;

public class Gegnermovement {
    Timer movement;
    private int temp = 0;
    public Gegnermovement(){

        for(int i = 0; i<4; i++);
        {
            Var.gegnerx[i] = 20 + temp;
            Var.gegnery[i] = -100 - temp;

            temp += 160;
        }
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                for(int i=0; i<4; i++);
                {
                    Var.gegnery[i] += Var.gegnerspeed;
                    if (Var.gegnery[i] >= Var.screenheight) {
                        Var.gegnery[i] = -100;
                    }
                }
            }
        }, 0, 9);
    }
}
