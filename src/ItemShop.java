import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemShop {
  public static void main(String[] args) {
    JFrame frame = new JFrame("道具屋");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();

    // アイテム一覧
    String[] items = {"やくそう", "どくけしそう", "まほうのせいすい","せいなるナイフ"};
    int[] stocks = {4,6,3,1};
    
    // 購入履歴のリストの作成
    ArrayList<String>history = new ArrayList<>();
    

    // ★ 案内ラベルと一覧ラベルの追加
    JLabel messageLabel = new JLabel("アイテムどれが欲しいですか？");
    StringBuilder itemList = new StringBuilder("<html>");
    for (int i = 0; i < items.length; i++) {
      itemList.append(i).append(": ").append(items[i]).append("在庫: ").append(stocks[i]).append("<br>");
    }
    itemList.append("</html>");
    JLabel itemListLabel = new JLabel(itemList.toString());

    JLabel label = new JLabel("アイテム番号を入力:");
    JTextField input = new JTextField(5);
    JButton button = new JButton("購入する");
    // 履歴の閲覧
    JButton historyButton = new JButton("履歴を見る");
    JLabel resultLabel = new JLabel("ここにメッセージが表示されます");

    button.addActionListener(e -> {
      try {
        int index = Integer.parseInt(input.getText());
        if(stocks[index] <= 0) {
        	JOptionPane.showMessageDialog(frame,"在庫がありません","在庫切れ",JOptionPane.WARNING_MESSAGE);
        	return;
        }
        
        String selectedItem = items[index];
        stocks[index]--;
        resultLabel.setText("「" + selectedItem + "」を購入しました！");
        
        history.add(selectedItem);
        itemList.setLength(0);
        itemList.append("<html>");
        
        for(int i = 0; i < items.length; i ++) {
        	itemList.append(i).append(":").append(items[i]).append(" (残り").append(stocks[i]).append("個) <br>");
        }
        itemList.append("</html>");
        itemListLabel.setText(itemList.toString());
      }catch (ArrayIndexOutOfBoundsException ex){
        JOptionPane.showMessageDialog(frame, "その番号のアイテムは売っていません！", "エラー",JOptionPane.ERROR_MESSAGE);
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "番号を半角数字で入力してください！", "入力エラー",
            JOptionPane.ERROR_MESSAGE);
      } catch (Exception ex) {
        //   ex.printStackTrace(); // ログ出力（開発者用）
        JOptionPane.showMessageDialog(frame,
            "想定外のエラーが発生しました。\n" + ex.toString(),
            "予期しないエラー",
            JOptionPane.ERROR_MESSAGE);
      }
    });
    
    historyButton.addActionListener(e -> {
    	if(history.isEmpty()) {
    		JOptionPane.showMessageDialog(frame,"まだ購入履歴がありません");
    	}else {
    		JOptionPane.showMessageDialog(frame,String.join(",\n",history),"購入履歴",JOptionPane.INFORMATION_MESSAGE);
    	}
    });
    

    // パネルに部品を追加
    panel.add(messageLabel);
    panel.add(itemListLabel);
    panel.add(label);
    panel.add(input);
    panel.add(button);
    panel.add(historyButton);
    panel.add(resultLabel);

    frame.add(panel);
    frame.setVisible(true);
  }
}
