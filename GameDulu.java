package oldpackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class GameDulu extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private ArrayList<Monster> monsters;
    private Image backgroundImage;

    public GameDulu(ArrayList<Monster> monsters) {
        this.monsters = monsters;
        initComponents();
        loadImage();
        additionalComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jFrame1 = new javax.swing.JFrame();
        panel1 = new java.awt.Panel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Home Base");

        pack();
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        HomeBasePanel hbp = new HomeBasePanel(monsters);
        hbp.setVisible(true);
        this.dispose();
    }

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        DungeonPanel dungeonPanel = new DungeonPanel(monsters);
        dungeonPanel.setVisible(true);
        this.dispose();
    }

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void loadImage() {
        ImageIcon icon = new ImageIcon("Monster.jpg");
        backgroundImage = icon.getImage();
    }

    private void additionalComponents() {
        mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        mainPanel.setLayout(null);

        JButton homeBaseButton = new JButton("Home Base");
        JButton dungeonButton = new JButton("Dungeon");
        JButton exitButton = new JButton("Exit Game");
        JLabel optionLabel = new JLabel("OPTION", SwingConstants.CENTER);

        Font buttonFont = new Font("Serif", Font.BOLD, 20);
        Font titleFont = new Font("Serif", Font.BOLD, 50);
        Color buttonColor = new Color(255, 192, 203); // Pink color

        homeBaseButton.setFont(buttonFont);
        dungeonButton.setFont(buttonFont);
        exitButton.setFont(buttonFont);
        optionLabel.setFont(titleFont);

        homeBaseButton.setBackground(buttonColor);
        dungeonButton.setBackground(buttonColor);
        exitButton.setBackground(buttonColor);

        optionLabel.setBounds(390, 50, 500, 60);
        homeBaseButton.setBounds(540, 200, 200, 50);
        dungeonButton.setBounds(540, 270, 200, 50);
        exitButton.setBounds(540, 340, 200, 50);

        homeBaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HomeBasePanel homeBasePanel = new HomeBasePanel(monsters);
                homeBasePanel.setVisible(true);
                dispose();
            }
        });

        dungeonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DungeonPanel dungeonPanel = new DungeonPanel(monsters);
                dungeonPanel.setVisible(true);
                dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        mainPanel.add(optionLabel);
        mainPanel.add(homeBaseButton);
        mainPanel.add(dungeonButton);
        mainPanel.add(exitButton);

        getContentPane().add(mainPanel);
        setSize(1280, 720);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameDulu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameDulu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameDulu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameDulu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameDulu(new ArrayList<>()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private java.awt.Panel panel1;
    // End of variables declaration
}
