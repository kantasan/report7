package jp.ac.uryukyu.ie.e165701;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.Container;


class main extends JFrame implements ActionListener{
    public JPanel p = new JPanel();

    public boolean rrr;
    public Thread bbb;
    public ImageIcon icon1;
    public JLabel label1;

    public static void main(String args[]) {
        main frame = new main("反射神経テスト");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    main(String title) {
        jjj www = new jjj();
        bbb = new Thread(www);
        rrr = true;
        setTitle(title);
        setBounds(100, 100, 300, 250);

        JButton button1 = new JButton("start");
        button1.addActionListener(this);

        label1 = new JLabel("");

        p.add(button1);
        p.add(label1);

        Container contentPane = getContentPane();
        contentPane.add(p, BorderLayout.CENTER);

    }

    public void actionPerformed(ActionEvent e) {
        if(rrr){
            bbb.start();
            rrr = false;

        }
    }

    public class jjj extends Thread {
        public void run() {


            int ran = (int) (Math.random() * 10000);
            try {
                Thread.sleep(ran);
            } catch (InterruptedException t) {}

            icon1 = new ImageIcon("/Users/e165701/IdeaProjects/report7/src/main/java/02F012A0003.png");
            label1.setIcon(icon1);
            long start = System.currentTimeMillis();
            repaint();

        }
    }
}






