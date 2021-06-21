package timer;

public class TimerThread extends Thread {

    private int min;
    private int sec;

    public TimerThread(int min, int sec) {
        this.min = min;
        this.sec = sec;
    }

    @Override
    public void run() {
        while(min>=0){
            for(int i = sec; i>=0; i--) {
                System.out.println(min + ":" + sec--);
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
