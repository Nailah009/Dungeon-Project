package oldpackage;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

public class HomeBasePanel extends javax.swing.JFrame {

    private javax.swing.JPanel levelUpPanel;
    private javax.swing.JPanel evolvePanel;
    private javax.swing.JPanel healPanel;
    private javax.swing.JPanel buyItemPanel;
    public HomeBasee home;
    private ArrayList<Monster> monsters;
    private Image backgroundImage;

    public HomeBasePanel(List<Monster> monsters) {
        this.monsters = new ArrayList<>(monsters); // Copy the monsters list
        home = new HomeBasee();
        home.setMonsters(this.monsters);
        try {
            backgroundImage = ImageIO.read(new File("MonsterTiga.jpg")); // replace with your image path
        } catch (IOException e) {
            e.printStackTrace();
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new BackgroundPanel(backgroundImage);
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        JLabel titleLabel = new JLabel("HOME BASE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Set title font
        titleLabel.setFont(new Font("Arial", Font.BOLD, 48));
        titleLabel.setForeground(Color.WHITE); // Set color to white
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // Center align

        // Center the buttons
        jPanel1.setLayout(new CardLayout());
        JPanel homePanel = new BackgroundPanel(backgroundImage);
        homePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Add title to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        homePanel.add(titleLabel, gbc);

        // Add buttons below title
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        homePanel.add(jToggleButton1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        homePanel.add(jToggleButton2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        homePanel.add(jToggleButton3, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        homePanel.add(jToggleButton4, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        homePanel.add(jToggleButton5, gbc);

        jToggleButton1.setText("Level Up Monster");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Evolve Monster");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Heal Monster");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Buy Item");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setText("Exit Home Base ");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        // Set button colors to pink
        Color pink = new Color(255, 182, 193);
        jToggleButton1.setBackground(pink);
        jToggleButton2.setBackground(pink);
        jToggleButton3.setBackground(pink);
        jToggleButton4.setBackground(pink);
        jToggleButton5.setBackground(pink);

        levelUpPanel = new BackgroundPanel(backgroundImage);
        levelUpPanel.setLayout(new BorderLayout());
        JButton backButton = new JButton("Back to Home Base");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(jPanel1.getLayout());
                cl.show(jPanel1, "homeBase");
            }
        });
        levelUpPanel.add(backButton, BorderLayout.SOUTH);

        healPanel = new BackgroundPanel(backgroundImage);
        healPanel.setLayout(new BorderLayout());
        JButton backButtonHeal = new JButton("Back to Home Base");
        backButtonHeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(jPanel1.getLayout());
                cl.show(jPanel1, "homeBase");
            }
        });
        healPanel.add(backButtonHeal, BorderLayout.SOUTH);

        jPanel1.add(homePanel, "homeBase");
        jPanel1.add(levelUpPanel, "levelUp");
        jPanel1.add(healPanel, "heal");

        CardLayout cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1, "homeBase");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Monster monster = home.chooseMonster();
        if (monster != null) {
            home.levelUpMonster(monster);
            JOptionPane.showMessageDialog(null, monster.getName() + " has leveled up!", "Level Up", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        home.evolveMonster();
    }

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        Monster monster = home.chooseMonster();
        if (monster != null) {
            home.healMonster(monster);
            JOptionPane.showMessageDialog(null, monster.getName() + " has been healed.", "Heal Monster", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        home.buyItem();
    }

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        GameDulu gdl = new GameDulu(monsters);
        gdl.setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeBasePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeBasePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeBasePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeBasePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        List<Monster> monsters = new ArrayList<>();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeBasePanel(monsters).setVisible(true);
            }
        });
    }

    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;

    class BackgroundPanel extends JPanel {
        private Image image;

        public BackgroundPanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}

class HomeBasee {
    private Scanner scanner;
    private List<Monster> monsters;
    public static List<Item> inventory = new ArrayList<>();
    public static final List<Item> shopItems = new ArrayList<>();

    public HomeBasee() {
        this.scanner = new Scanner(System.in);
        this.monsters = new ArrayList<>();
        shopItems.add(new Item("Potion", "HEAL", 20));
        shopItems.add(new Item("Rare Candy", "RARE", 50));
        shopItems.add(new Item("Revive", "REVIVE", 30));
    }

    public ArrayList<Monster> getMonsters() {
        return (ArrayList<Monster>) this.monsters;
    }
    
    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public void levelUpMonster(Monster monster) {
        if (monster != null) {
            monster.increaseExperience(100); // for testing purpose
        }
    }

    public void evolveMonster() {
        Monster monster = chooseMonster();
        if (monster != null) {
            String newElement = JOptionPane.showInputDialog(null, "Enter new element for evolution:", "Evolve Monster", JOptionPane.QUESTION_MESSAGE);
            if (newElement != null) {
                monster.evolve(newElement);
                JOptionPane.showMessageDialog(null, monster.getName() + " has evolved to " + newElement + "!", "Evolve Monster", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void healMonster(Monster monster) {
        if (monster != null) {
            monster.heal(20);
        }
    }

    public void buyItem() {
        displayBuyItemPanel();
    }

    private void displayBuyItemPanel() {
        JFrame buyItemFrame = new JFrame("Buy Item");
        buyItemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buyItemFrame.setSize(400, 300);
        buyItemFrame.setLayout(new BorderLayout());

        String[] columnNames = {"No", "Name", "Effect", "Value"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        for (int i = 0; i < shopItems.size(); i++) {
            Item item = shopItems.get(i);
            Object[] row = {i + 1, item.getName(), item.getEffect(), item.getValue()};
            tableModel.addRow(row);
        }
        JTable itemTable = new JTable(tableModel);
        itemTable.setRowHeight(25);
        itemTable.setFont(new Font("Arial", Font.PLAIN, 14));

        // Set custom renderer for coloring rows
        itemTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(255, 228, 225)); // light pink
                return c;
            }
        });

        JScrollPane scrollPane = new JScrollPane(itemTable);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Available items to buy"));

        JPanel inputPanel = new JPanel(new BorderLayout());
        JTextField inputField = new JTextField();
        JButton buyButton = new JButton("Buy");

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choiceStr = inputField.getText();
                if (choiceStr != null) {
                    try {
                        int choice = Integer.parseInt(choiceStr);
                        if (choice > 0 && choice <= shopItems.size()) {
                            Item selectedItem = shopItems.get(choice - 1);
                            inventory.add(selectedItem);
                            JOptionPane.showMessageDialog(buyItemFrame, selectedItem.getName() + " has been added to your inventory.", "Buy Item", JOptionPane.INFORMATION_MESSAGE);
                            buyItemFrame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(buyItemFrame, "Invalid choice.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(buyItemFrame, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(buyButton, BorderLayout.EAST);

        buyItemFrame.add(scrollPane, BorderLayout.CENTER);
        buyItemFrame.add(inputPanel, BorderLayout.SOUTH);
        buyItemFrame.setVisible(true);
    }

    public Monster chooseMonster() {
        if (monsters.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No monsters available.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        StringBuilder monsterList = new StringBuilder("Choose a monster:\n");
        for (int i = 0; i < monsters.size(); i++) {
            monsterList.append((i + 1)).append(". ").append(monsters.get(i).getName()).append("\n");
        }

        String choiceStr = JOptionPane.showInputDialog(null, monsterList.toString(), "Choose Monster", JOptionPane.QUESTION_MESSAGE);
        if (choiceStr != null) {
            try {
                int choice = Integer.parseInt(choiceStr);
                if (choice > 0 && choice <= monsters.size()) {
                    return monsters.get(choice - 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid choice.", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        } else {
            return null;
        }
    }
}

class Item {
    private String name;
    private String effect;
    private int value;

    public Item(String name, String effect, int value) {
        this.name = name;
        this.effect = effect;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public int getValue() {
        return value;
    }
}
