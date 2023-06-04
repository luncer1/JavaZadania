package com.company.Zadanie6_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NewJFrame extends JFrame {
    public NewJFrame() {
        initComponents();
        setSize(350, 250);
        watek = new Zamieniacz(jTextArea1);
        watek.start();
        cenzura = new Cenzura(jTextArea1);
        cenzura.start();
    }
    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        jTextArea1.setPreferredSize(new Dimension(300, 200));
        jScrollPane1.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane1, BorderLayout.CENTER);
        pack();
    }
    private void formWindowClosing(WindowEvent evt) {
        watek.zakonczyc = true;
        watek = null;
        cenzura.zakonczyc = true;
        cenzura = null;
    }
    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private Zamieniacz watek;
    private Cenzura cenzura;
}
