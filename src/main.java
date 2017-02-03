import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

/**
 * Created by e165701 on 2017/02/02.
 */
class main extends JFrame {
    public static void main(String args[]){
        main frame = new main("タイトル");
        frame.setVisible(true);
    }

    main(String title){
        setTitle(title);
        setBounds(100,100,300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel();

        JButton button1 = new JButton();
        JButton button2 = new JButton("確認");
        button3.setText("キャンセル");

        p.add(button1);
        p.add(button2);
        p.add(button3);

        Container contentPane = getContentPane();
        contentPane.add(p,BorderLayout.CENTER);
    }
}

