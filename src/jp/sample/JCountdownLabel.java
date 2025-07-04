package jp.sample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class JCountdownLabel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("カウントダウン");
            JLabel label = new JLabel("10", JLabel.CENTER);
            frame.add(label);
            frame.setSize(500, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            Timer timer = new Timer(1000, new ActionListener() {
                int count = 10;
                public void actionPerformed(ActionEvent e) {
                    count--;
                    label.setText(String.valueOf(count));
                    if (count == 0) {
                        ((Timer)e.getSource()).stop();
                        label.setText("時間切れ！");
                    }
                }
            });
            timer.start();
        });
    }
}
