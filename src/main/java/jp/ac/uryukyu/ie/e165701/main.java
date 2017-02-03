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

    public int rrr;
    public Thread bbb;
    public ImageIcon icon1;
    public JLabel label1;
    public JLabel label2;
    public long start;
    public long end;
    public int ddd;
    public boolean aaa;


    public static void main(String args[]) {
        main frame = new main("反射神経テスト");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


    public class jjj extends Thread {
        public void run() {


                int ran = (int) (Math.random() * 10000);
                try {
                    Thread.sleep(ran);
                } catch (InterruptedException t) {
                }
            if(aaa) {
                if (ddd == 0) {
                    start = System.currentTimeMillis();
                    ddd++;
                }
                icon1 = new ImageIcon("/Users/e165701/IdeaProjects/report7/src/main/java/02F012A0003.png");
                label1.setIcon(icon1);
                repaint();
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (rrr == 0) {
            bbb.start();
            rrr++;
        }else if(start == 0){
            label2.setText("結果: 失敗");
            aaa = false;
        } else if (rrr == 1) {
            end = System.currentTimeMillis();
            label2.setText("結果: " + (end - start) + "ms");
            rrr++;
        }
    }


    main(String title) {
        jjj www = new jjj();
        bbb = new Thread(www);
        rrr = 0;
        ddd = 0;
        aaa = true;
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






