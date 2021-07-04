package timerGUI;

import timer.TimerThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private static JLabel minutesLabel;
    private static JTextField counterMinutes;
    private static JLabel secondsLabel;
    private static JTextField counterSeconds;
    public static JLabel myCounter;


    public static void main(String[] args) {


        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        minutesLabel = new JLabel("minutes");
        minutesLabel.setBounds(10, 20, 80, 25);
        panel.add(minutesLabel);


        counterMinutes = new JTextField(20);
        counterMinutes.setBounds(100, 20, 165, 25);
        panel.add(counterMinutes);

        secondsLabel = new JLabel("seconds");
        secondsLabel.setBounds(10, 40, 100, 25);
        panel.add(secondsLabel);

        counterSeconds = new JTextField(20);
        counterSeconds.setBounds(100, 40, 165, 25);
        panel.add(counterSeconds);


        JButton button = new JButton("Count");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        myCounter = new JLabel("");
        myCounter.setBounds(10,110,300, 25);
        panel.add(myCounter);

        frame.setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String minutes = counterMinutes.getText();
        String seconds = counterSeconds.getText();
        TimerThread1 timer = new TimerThread1(minutes, seconds);
        timer.start();

    }
}
