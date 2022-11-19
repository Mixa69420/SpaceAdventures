import java.util.Timer;
import java.util.TimerTask;

public class Feueranimation {
    Timer Feuer = new Timer();
    private int temp=0;
    public Feueranimation(){
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
