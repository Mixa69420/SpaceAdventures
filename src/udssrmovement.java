import java.util.Timer;
import java.util.TimerTask;

public class udssrmovement {
    Timer movement;
    private int temp =0;
    public udssrmovement(){

        for(int i = 0; i<4; i++ ){
            Var.UDSSRx1[i]=20+temp;
            Var.UDSSRy1[i]=-200-temp;

            temp +=160;

        }
        Var.UDSSRx2[0]=266;
        Var.UDSSRx2[1]=532;
        Var.UDSSRy2[0]=-1000;
        Var.UDSSRy2[1]=-1500;

        Var.UDSSRx3 = 375;
        Var.UDSSRy3 = -4000;

        movement = new Timer();
        movement.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                for (int i = 0; i < 4; i++) {
                    Var.UDSSRy1[1] += Var.udssrspeed1[i];

                    if (Var.UDSSRy1[1] >= Var.screenheight) {
                        Var.UDSSRy1[i] = -350;
                    }
                }
                for (int i = 0; i < 1; i++) {
                    Var.UDSSRy2[1] += Var.udssrspeed2[i];

                    if (Var.UDSSRy2[1] >= Var.screenheight) {
                        Var.UDSSRy2[i] = -1500;
                    }
                }
                Var.UDSSRy3 += Var.udssrspeed3;
                if(Var.UDSSRy3>=Var.screenheight){
                    Var.UDSSRy3 =- 4000;
                }
            }
        },0, 9);

    }

}
