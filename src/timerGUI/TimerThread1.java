package timerGUI;

public class TimerThread1 extends Thread {

    private int min;
    private int sec;


    public TimerThread1(String minutes, String seconds) {
        this.min = Integer.parseInt(minutes);
        this.sec = Integer.parseInt(seconds);
    }

    @Override
    public void run() {
        boolean first = true;
        while(min>=0){
            if(!first)
                sec = 59;
            first = false;
            for(int i = sec; i>=0; i--) {
                if(i>=0&&i<=9&&min<=9){
                    GUI.myCounter.setText("0"+min + ":" + "0"+sec--);
                }else if(i>=0&&i<=9){
                    GUI.myCounter.setText(min + ":" + "0"+sec--);
                }else if(min<=9){
                    GUI.myCounter.setText("0"+min + ":" + sec--);
                }else
                    GUI.myCounter.setText(min + ":" + sec--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            min--;
        }

    }
}
