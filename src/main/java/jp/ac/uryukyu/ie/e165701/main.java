package jp.ac.uryukyu.ie.e165701;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.Container;


class main extends JFrame implements ActionListener {
    public JPanel p = new JPanel();

    public int first;
    public Thread thread;
    public ImageIcon icon1;
    public JLabel label1;
    public JLabel label2;
    public long start;
    public long end;
    public int count;
    public boolean ahead;


    public static void main(String args[]) {
        main frame = new main("反射神経テスト");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    public class time extends Thread {
        public void run() {


                int ran = (int) (Math.random() * 10000);
                try {
                    Thread.sleep(ran);
                } catch (InterruptedException t) {
                }
            if(ahead) {
                if (count == 0) {
                    start = System.currentTimeMillis();
                    count++;
                }
                icon1 = new ImageIcon("/Users/e165701/IdeaProjects/report7/src/main/java/02F012A0003.png");
                label1.setIcon(icon1);
                repaint();
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (first == 0) {
            thread.start();
            first++;
        }else if(start == 0){
            label2.setText("結果: 失敗");
            ahead = false;
        } else if (first == 1) {
            end = System.currentTimeMillis();
            label2.setText("結果: " + (end - start) + "ms");
            first++;
        }
    }


    main(String title) {
        time get = new time();
        thread = new Thread(get);
        first = 0;
        count = 0;
        ahead = true;
        setTitle(title);
        setBounds(200, 100, 500, 500);

        JButton button1 = new JButton("start");
        button1.addActionListener(this);

        label1 = new JLabel("");

        label2 = new JLabel("");

        p.add(button1);
        p.add(label1);
        p.add(label2);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);
    }
}






