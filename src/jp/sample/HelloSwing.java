package jp.sample;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloSwing {
    public static void main(String[] args) {
        // GUIの作成はイベントディスパッチスレッドで行う
        SwingUtilities.invokeLater(() -> {
            // フレーム（ウィンドウ）作成
            JFrame frame = new JFrame("Swingの例");

            // ラベルに文字列を設定
            JLabel label = new JLabel("ようこそJavaの世界へ", JLabel.CENTER);
            JButton button = new JButton("文字変更");
            
            button.addActionListener(action -> label.setText("クリア"));
            
            label.setFont(new Font("Arual", Font.BOLD, 60));

            // フレームにラベルを追加
            frame.setLayout(new java.awt.BorderLayout());
            frame.add(label, BorderLayout.CENTER);
            frame.add(button, BorderLayout.SOUTH);

            // フレームのサイズを設定
            frame.setSize(800, 400);

            // 閉じるボタンでアプリ終了
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // ウィンドウを画面中央に表示
            frame.setLocationRelativeTo(null);

            // 表示
            frame.setVisible(true);
        });
    }
}