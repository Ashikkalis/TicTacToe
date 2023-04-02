
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stavr
 */
public class Java_TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form Java_TicTacToe
     */
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public Java_TicTacToe() {
        initComponents();
    }
    
    private void gameScore(){
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame = "X";
        }
    }
    
    public int jbtnCount = 0;
   
    
    private void winningGame(){
        String b1 = jbtnTic1.getText();
        String b2 = jbtnTic2.getText();
        String b3 = jbtnTic3.getText();
        String b4 = jbtnTic4.getText();
        String b5 = jbtnTic5.getText();
        String b6 = jbtnTic6.getText();
        String b7 = jbtnTic7.getText();
        String b8 = jbtnTic8.getText();
        String b9 = jbtnTic9.getText();
        
        jbtnCount++;
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.BLUE);
            jbtnTic2.setBackground(Color.BLUE);
            jbtnTic3.setBackground(Color.BLUE);
            
            xCount++;
            
            gameScore();
          
            jbtnCount = 0;
        }
        
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            
            xCount++;
            
            gameScore();
           
            jbtnCount = 0;
        }
       
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.RED);
            jbtnTic8.setBackground(Color.RED);
            jbtnTic9.setBackground(Color.RED);
            
            xCount++;
            
            gameScore();
         
            jbtnCount = 0;
        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic5.setBackground(Color.ORANGE);
            jbtnTic9.setBackground(Color.ORANGE);
            
            xCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic7.setBackground(Color.PINK);
            
            xCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.YELLOW);
            jbtnTic4.setBackground(Color.YELLOW);
            jbtnTic7.setBackground(Color.YELLOW);
            
            xCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.MAGENTA);
            jbtnTic5.setBackground(Color.MAGENTA);
            jbtnTic8.setBackground(Color.MAGENTA);
            
            xCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Player X Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            jbtnTic9.setBackground(Color.CYAN);
            
            xCount++;
            
            gameScore();
      
            jbtnCount = 0;
        }
        
        
        
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.BLUE);
            jbtnTic2.setBackground(Color.BLUE);
            jbtnTic3.setBackground(Color.BLUE);
            
            oCount++;
            
            gameScore();
          
            jbtnCount = 0;
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            
            oCount++;
            
            gameScore();
          
            jbtnCount = 0;
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.RED);
            jbtnTic8.setBackground(Color.RED);
            jbtnTic9.setBackground(Color.RED);
            
            oCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic5.setBackground(Color.ORANGE);
            jbtnTic9.setBackground(Color.ORANGE);
            
            oCount++;
            
            gameScore();
           
            jbtnCount = 0;
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.PINK);
            jbtnTic5.setBackground(Color.PINK);
            jbtnTic7.setBackground(Color.PINK);
            
            oCount++;
            
            gameScore();
            
            jbtnCount = 0;
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.YELLOW);
            jbtnTic4.setBackground(Color.YELLOW);
            jbtnTic7.setBackground(Color.YELLOW);
            
            oCount++;
            
            gameScore();
          
           jbtnCount = 0;
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.MAGENTA);
            jbtnTic5.setBackground(Color.MAGENTA);
            jbtnTic8.setBackground(Color.MAGENTA);
            
            oCount++;
            
            gameScore();
        
            jbtnCount = 0;
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Player O Wins","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            jbtnTic9.setBackground(Color.CYAN);
            
            oCount++;
            
            gameScore();
        
            jbtnCount = 0;
        }
        
        
        
        if(jbtnCount == 9){
            jbtnTic1.setText("");
            jbtnTic2.setText("");
            jbtnTic3.setText("");
            jbtnTic4.setText("");
            jbtnTic5.setText("");
            jbtnTic6.setText("");
            jbtnTic7.setText("");
            jbtnTic8.setText("");
            jbtnTic9.setText("");
            
            jbtnCount = 0;
            
            JOptionPane.showMessageDialog(this, "No Winner","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jbtnTic3 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel23.setBackground(new java.awt.Color(153, 153, 153));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic3ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, 110));

        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic1ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 110));

        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic2ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 110));

        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic6ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 110, 110));

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic4ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 110, 110));

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic5ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, 110));

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic9ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 110, 110));

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic7ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 110, 110));

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTic8ActionPerformed(evt);
            }
        });
        jPanel23.add(jbtnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 110, 110));

        jPanel5.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 350));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 370, 370));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 370));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 370));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanel3.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 150, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setText("Player O:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 50));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanel3.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setText("Player X:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 50));

        jPanel9.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 330, 170));

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(0, 0, 0));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 370));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel17.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 100));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel17.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 100));

        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 70));

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton13.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton13.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton13.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel17.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 100));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 160, 70));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, 70));

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 330, 170));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 370, 370));

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(0, 0, 0));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setText("Tic Tac Toe Game");
        jPanel21.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 310, 40));

        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 720, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
           System.exit(0);
       }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jbtnCount = 0;
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        jbtnTic3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        jbtnTic1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
        jbtnTic2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
        jbtnTic6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed

    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        jbtnTic4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        jbtnTic5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed

    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
        jbtnTic9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed

    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
        jbtnTic7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed

    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        jbtnTic8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        jbtnTic1.setEnabled(true);
        jbtnTic2.setEnabled(true);
        jbtnTic3.setEnabled(true);
        jbtnTic4.setEnabled(true);
        jbtnTic5.setEnabled(true);
        jbtnTic6.setEnabled(true);
        jbtnTic7.setEnabled(true);
        jbtnTic8.setEnabled(true);
        jbtnTic9.setEnabled(true);
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        xCount=0;
        oCount=0;
        jbtnCount = 0;
        
        jbtnTic1.setText("");
        jbtnTic2.setText("");
        jbtnTic3.setText("");
        jbtnTic4.setText("");
        jbtnTic5.setText("");
        jbtnTic6.setText("");
        jbtnTic7.setText("");
        jbtnTic8.setText("");
        jbtnTic9.setText("");
        
        jbtnTic1.setBackground(Color.LIGHT_GRAY);
        jbtnTic2.setBackground(Color.LIGHT_GRAY);
        jbtnTic3.setBackground(Color.LIGHT_GRAY);
        jbtnTic4.setBackground(Color.LIGHT_GRAY);
        jbtnTic5.setBackground(Color.LIGHT_GRAY);
        jbtnTic6.setBackground(Color.LIGHT_GRAY);
        jbtnTic7.setBackground(Color.LIGHT_GRAY);
        jbtnTic8.setBackground(Color.LIGHT_GRAY);
        jbtnTic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
