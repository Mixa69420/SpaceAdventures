import java.util.Timer;
import java.util.TimerTask;

public class Feueranimation {
    Timer Feuer;
    private int temp=0;
    public Feueranimation(){
        Feuer = new Timer();
        Feuer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(temp == 0){
                    Var.feueranimation =0;
                    temp++;
                }else if(temp == 1){
                    Var.feueranimation=1;
                    temp--;
                }

            }
        },0, 100);
    }
}
