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
        boolean first = true;
        while (min >= 0) {
            if (!first)
                sec = 59;
            first = false;
            for (int i = sec; i >= 0; i--) {
                if (i >= 0 && i <= 9 && min <= 9) {
                    System.out.println("0" + min + ":" + "0" + sec--);
                } else if (i >= 0 && i <= 9) {
                    System.out.println(min + ":" + "0" + sec--);
                } else if (min <= 9) {
                    System.out.println("0" + min + ":" + sec--);
                } else
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
