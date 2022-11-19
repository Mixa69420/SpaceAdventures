import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
    Timer movement;
    public PlayerMovement(){
        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(Var.moveup){
                    if(Var.y>0){
                        Var.y -= Var.speedup;
                    }
                }else  if(Var.movedown){
                    if(Var.y<=490){
                        Var.y += Var.speeddown;
                    }
                }
                if(Var.moveleft){
                    if(Var.x>0){
                        Var.x -= Var.speedleft;
                    }
                }else  if(Var.moveright){
                    if(Var.x<=730){
                        Var.x += Var.speedright;
                    }
                }

            }
        }, 0, 10);
    }
}
