package timer;

public class Demo {
    public static void main(String[] args) {
        TimerThread timer = new TimerThread(3, 24);
        timer.start();
    }
}
