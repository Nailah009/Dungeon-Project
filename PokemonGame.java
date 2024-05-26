package oldpackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PokemonGame extends javax.swing.JFrame {

    private ArrayList<Monster> monsters;
    private HomeBase homeBase;
    private int monsterCount = 0;
    private Image backgroundImage;
    private Image welcomeBackgroundImage;

    public PokemonGame() {
        monsters = new ArrayList<>();
        monsterCount = 0;
        homeBase = new HomeBase();
        loadImage();
        initComponents();
    }

    private void loadImage() {
        backgroundImage = new ImageIcon("Monster.jpg").getImage(); // Replace with the path to your game background image
        welcomeBackgroundImage = new ImageIcon("MonsterTiga.jpg").getImage(); // Replace with the path to your welcome background image
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Initial welcome panel with background
        WelcomePanel welcomePanel = new WelcomePanel();
        welcomePanel.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));

        JButton startButton = new JButton("Play Game");
        startButton.setFont(new Font("Dialog", Font.BOLD, 24));
        JButton helpButton = new JButton("Help");
        helpButton.setFont(new Font("Dialog", Font.BOLD, 24));
        JButton exitButton = new JButton("Exit Game");
        exitButton.setFont(new Font("Dialog", Font.BOLD, 24));

        buttonPanel.add(startButton);
        buttonPanel.add(helpButton);
        buttonPanel.add(exitButton);

        welcomePanel.add(buttonPanel, BorderLayout.SOUTH);

        // Main game panel with background
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(new GridBagLayout());

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        label3 = new java.awt.Label();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"FIRE", "WIND", "WATER", "ICE", "EARTH"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label1.setText("Nama Monster");
        label2.setText("Elemen");
        jTextField1.setText("Masukkan Nama");

        label3.setFont(new java.awt.Font("Dialog", Font.BOLD, 36));
        label3.setText("POKEMON GAME");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundPanel.add(label3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        backgroundPanel.add(label1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        backgroundPanel.add(jTextField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        backgroundPanel.add(label2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        backgroundPanel.add(jComboBox1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        backgroundPanel.add(jButton1, gbc);

        getContentPane().add(welcomePanel, BorderLayout.CENTER);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().remove(welcomePanel);
                getContentPane().add(backgroundPanel, BorderLayout.CENTER);
                revalidate();
                repaint();
            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(PokemonGame.this, "This is a help message for the game. Instructions go here.", "Help", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        pack();
    }
    
        public void startFromBeginning() {
        getContentPane().removeAll();
        // Main game panel with background
        BackgroundPanel backgroundPanel = new BackgroundPanel();
        backgroundPanel.setLayout(new GridBagLayout());

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        label3 = new java.awt.Label();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"FIRE", "WIND", "WATER", "ICE", "EARTH"}));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                dispose();
                GameDulu gameDulu = new GameDulu(monsters);
                gameDulu.setVisible(true);
            }
        });

        label1.setText("Nama Monster");
        label2.setText("Elemen");
        jTextField1.setText("Masukkan Nama");

        label3.setFont(new java.awt.Font("Dialog", Font.BOLD, 36));
        label3.setText("POKEMON GAME");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        backgroundPanel.add(label3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        backgroundPanel.add(label1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        backgroundPanel.add(jTextField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        backgroundPanel.add(label2, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        backgroundPanel.add(jComboBox1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        backgroundPanel.add(jButton1, gbc);

        getContentPane().add(backgroundPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSubmit();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        GameDulu gameDulu = new GameDulu(monsters);
        gameDulu.setVisible(true);
        
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
        handleSubmit();
    }

    public void handleSubmit() {
        String name = jTextField1.getText();
        String element = (String) jComboBox1.getSelectedItem();

        if (name.isEmpty() || element.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama dan Elemen harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Monster newMonster = new Monster(name, element) {};
        monsters.add(newMonster);
        monsterCount++;

        jButton1.requestFocusInWindow();

        if (monsterCount < 3) {
            JOptionPane.showMessageDialog(this, "Monster " + monsterCount + " berhasil dimasukkan. Silakan masukkan monster berikutnya.", "Info", JOptionPane.INFORMATION_MESSAGE);
            jTextField1.setText("");
            jComboBox1.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(this, "Semua monster telah dimasukkan.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public ArrayList<Monster> getMonsters() {
        return this.monsters;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonGame().setVisible(true);
            }
        });
    }

    private class BackgroundPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    }

    private class WelcomePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(welcomeBackgroundImage, 0, 0, getWidth(), getHeight(), this);
            
            // Draw the welcome message with bold text and outline
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setFont(new Font("Dialog", Font.BOLD, 60));
            g2d.setColor(Color.BLACK);
            String welcomeText = "Holla! Welcome to Pokemon Mystery!";
            FontMetrics fm = g2d.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(welcomeText)) / 2;
            int y = getHeight() / 2;

            // Draw outline
            g2d.setColor(Color.WHITE);
            g2d.drawString(welcomeText, x + 2, y + 2);
            g2d.drawString(welcomeText, x - 2, y - 2);
            g2d.drawString(welcomeText, x + 2, y - 2);
            g2d.drawString(welcomeText, x - 2, y + 2);

            // Draw text
            g2d.setColor(Color.BLACK);
            g2d.drawString(welcomeText, x, y);
        }
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    // End of variables declaration
}

interface MonsterActions {
    void basicAttack(Monster enemy);
    void specialAttack(Monster enemy) throws SpecialAttackException;
    void elementalAttack(Monster enemy);
}

abstract class Monster implements MonsterActions {
    protected String name;
    protected int level;
    protected int healthPoints;
    protected int experiencePoints;
    protected int maxHealthPoints;
    protected String element;
    protected boolean evolved;

    private static final Map<String, java.util.List<String>> evolutionChart = new HashMap<>() {{
        put("FIRE", Arrays.asList("WIND", "EARTH"));
        put("WIND", Arrays.asList("FIRE", "WATER"));
        put("WATER", Arrays.asList("WIND", "ICE"));
        put("ICE", Arrays.asList("WATER", "EARTH"));
        put("EARTH", Arrays.asList("FIRE", "ICE"));
    }};

    private static final Map<String, String> effectiveChart = new HashMap<>() {{
        put("FIRE", "WIND");
        put("WIND", "EARTH");
        put("EARTH", "WATER");
        put("WATER", "FIRE");
        put("ICE", "WIND");
    }};

    public Monster(String name, String element) {
        this.name = name;
        this.level = 1; 
        this.healthPoints = 100; 
        this.maxHealthPoints = 100;
        this.experiencePoints = 0;
        this.element = element;
        this.evolved = false;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public String getElement() {
        return element;
    }

    public boolean isEvolved() {
        return evolved;
    }

    public void increaseExperience(int points) {
        this.experiencePoints += points;
        if (this.experiencePoints >= 100) {
            levelUp();
        }
    }

    public void heal(int amount) {
        this.healthPoints = Math.min(this.maxHealthPoints, this.healthPoints + amount);
    }

    public void evolve(String newElement) {
        if (!this.evolved && evolutionChart.get(this.element).contains(newElement)) {
            this.element = newElement;
            this.evolved = true;
            System.out.println(this.name + " has evolved into " + newElement + " element!");
        } else if (this.evolved) {
            System.out.println(this.name + " has already evolved.");
        } else {
            System.out.println("Invalid evolution path.");
        }
    }

    protected void levelUp() {
        this.level++;
        this.experiencePoints = 0;
        this.maxHealthPoints += 10;
        this.healthPoints = this.maxHealthPoints;
        this.evolved = false;
        System.out.println(this.name + " leveled up to level " + this.level + "!");
    }

    public void increaseMaxHealthPoints(int amount) {
        this.maxHealthPoints += amount;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void basicAttack(Monster enemy) {};

    public void specialAttack(Monster enemy) throws SpecialAttackException {};

    public void elementalAttack(Monster enemy) {};
}

class SpecialAttackException extends Exception {
    public SpecialAttackException(String message) {
        super(message);
    }
}

class HomeBase {
    // Implementation of HomeBase class
}

class GameDulu extends JFrame {
    public GameDulu(ArrayList<Monster> monsters) {
        // Implementation of GameDulu class
    }
}
