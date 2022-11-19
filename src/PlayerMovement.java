import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement;
    public PlayerMovement(){
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(Var.moveup = true){
                    if(Var.y>0){
                        Var.y -= Var.speedup;
                    }
                }else  if(Var.movedown = true){
                    if(Var.y<=490){
                        Var.y += Var.speeddown;
                    }
                }
                if(Var.moveleft = true){
                    if(Var.x>0){
                        Var.x -= Var.speedleft;
                    }
                }else  if(Var.moveright = true){
                    if(Var.x<=730){
                        Var.x += Var.speedright;
                    }
                }

            }
        }, 0, 10);

    }
}
