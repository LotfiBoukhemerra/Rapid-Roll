package bkg;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Rapid_Roll extends javax.swing.JFrame {

    private int xball, xwood1, ywood1, yball, score, xwood3, ywood3, xwood2, ywood2, xwood4, ywood4, xwood5, ywood5;
    private JLabel kzn;
    private String star_score;
    boolean lets_play, replay, dawn, logo, save_Score,go;
    int cpt_logo, star_score_x,name_wood,cpt_stage;
    int[] levels = {90, 380, 130, 360, 320,
        190, 390, 260, 100, 120,
        310, 200, 50, 260, 280,
        440, 150, 170, 350, 380,
        440, 250, 40, 200, 280,
        30, 290, 40, 250, 270,
        300, 280, 490, 260, 380
    };
    private final ImageIcon BIG_STAR = new ImageIcon(getClass().getResource("/bkg/bookmark_on.png"));
    private final ImageIcon SMELL_STAR = new ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"));

    public Rapid_Roll() {

        initComponents();
        save_Score = true;
        logo = true;
        dawn = true;
        replay = false;
        cpt_logo = 0;
        cpt_stage=0;
        xball = ball.getX();
        yball = ball.getY();
        xwood1 = wood1.getX();
        ywood1 = wood1.getY();
        star_score="blik";
        xwood3 = wood3.getX();
        ywood3 = wood3.getY();
        
        xwood2 = wood2.getX();
        ywood2 = wood2.getY();
        
         xwood4 = wood4.getX();
        ywood4 = wood4.getY();
        
         xwood5 = wood5.getX();
        ywood5 = wood5.getY();

        new Thread() {
            @Override
            public void run() {

                while (true) {

                    if (logo) {

                        try {
                            drawStars();
                            cpt_logo++;
                            if (cpt_logo == 2) {
                                jPanel2.setVisible(false);
                                jPanel1.setVisible(true);
                                logo = false;
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Rapid_Roll.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }// end if 1
                    if (!logo) {                       
                        for (int i = 0; i < 5; i++) {
                            ImageIcon ico = new ImageIcon(getClass().getResource("/bkg/clm" + String.valueOf(i) + ".png"));
                            jLabelColumnRight.setIcon(ico);
                            jLabelColumnLeft.setIcon(ico);
                            try {
                                sleep(150);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Rapid_Roll.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }//end for
                    }// end if 2 
                }//end while 
            }
        }.start();       
            play_max();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelScore = new javax.swing.JLabel();
        jLabelScoreText = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        wood1 = new javax.swing.JLabel();
        ball = new javax.swing.JLabel();
        jLabelColumnRight = new javax.swing.JLabel();
        jLabelColumnLeft = new javax.swing.JLabel();
        wood3 = new javax.swing.JLabel();
        wood2 = new javax.swing.JLabel();
        wood4 = new javax.swing.JLabel();
        wood5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rapid Roll");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel2.setLayout(null);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/rapid roll_1.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 60, 650, 160);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(410, 330, 45, 42);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(360, 330, 45, 42);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(310, 330, 45, 42);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(260, 330, 45, 42);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bookmark_on1.png"))); // NOI18N
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel12KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel12);
        jLabel12.setBounds(210, 330, 45, 42);

        getContentPane().add(jPanel2, "card3");

        jPanel1.setPreferredSize(new java.awt.Dimension(651, 548));
        jPanel1.setLayout(null);

        jLabelScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScore.setText("0");
        jPanel1.add(jLabelScore);
        jLabelScore.setBounds(550, 0, 90, 40);

        jLabelScoreText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelScoreText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelScoreText.setText("SCORE:");
        jPanel1.add(jLabelScoreText);
        jLabelScoreText.setBounds(480, 0, 70, 40);

        jLabelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bg_up.png"))); // NOI18N
        jPanel1.add(jLabelInfo);
        jLabelInfo.setBounds(0, 0, 651, 40);

        wood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/rt.png"))); // NOI18N
        wood1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wood1KeyPressed(evt);
            }
        });
        jPanel1.add(wood1);
        wood1.setBounds(90, 170, 130, 10);

        ball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/ball.png"))); // NOI18N
        jPanel1.add(ball);
        ball.setBounds(180, 340, 22, 22);

        jLabelColumnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/col.png"))); // NOI18N
        jPanel1.add(jLabelColumnRight);
        jLabelColumnRight.setBounds(626, 0, 25, 550);

        jLabelColumnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/col.png"))); // NOI18N
        jPanel1.add(jLabelColumnLeft);
        jLabelColumnLeft.setBounds(0, 0, 25, 550);

        wood3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/rt.png"))); // NOI18N
        wood3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wood3KeyPressed(evt);
            }
        });
        jPanel1.add(wood3);
        wood3.setBounds(130, 420, 130, 10);

        wood2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/rt.png"))); // NOI18N
        wood2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wood2KeyPressed(evt);
            }
        });
        jPanel1.add(wood2);
        wood2.setBounds(380, 300, 130, 10);

        wood4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/rt.png"))); // NOI18N
        wood4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wood4KeyPressed(evt);
            }
        });
        jPanel1.add(wood4);
        wood4.setBounds(360, 500, 130, 10);

        wood5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bkg/bg_wood5.png"))); // NOI18N
        wood5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wood5KeyPressed(evt);
            }
        });
        jPanel1.add(wood5);
        wood5.setBounds(320, 380, 130, 10);

        getContentPane().add(jPanel1, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wood1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wood1KeyPressed

    }//GEN-LAST:event_wood1KeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if (evt.getKeyCode() == evt.VK_RIGHT) {
            if (xball < jLabelColumnRight.getX() - ball.getWidth()) {
                //jPanel1.getWidth()
                ball.setLocation(xball += 13, ball.getY());

            } else {
                xball = jLabelColumnRight.getX() - ball.getWidth();
                //jPanel1.getWidth()
                ball.setLocation(xball, ball.getY());
            }
        }//VK RIGHT
        if (evt.getKeyCode() == evt.VK_LEFT) {
            if (xball > 25) {
                //xball > 0  
                ball.setLocation(xball -= 13, ball.getY());
            } else {
                ball.setLocation(xball = 25, ball.getY());
                                  //xball = 0

            };
        }// VK LEFT

    }//GEN-LAST:event_formKeyPressed

    private void wood3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wood3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wood3KeyPressed

    private void wood2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wood2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wood2KeyPressed

    private void jLabel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyPressed

    }//GEN-LAST:event_jLabel12KeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void wood4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wood4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wood4KeyPressed

    private void wood5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wood5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_wood5KeyPressed

    public void play_max() {

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        sleep(8);
                    } catch (InterruptedException ex) {
                    }
                    for (int i = 1; i < 4; i++) {
                        change_Jlebel(i);
                    }
                    if (dawn == true) {
                        ball.setLocation(xball, yball += 2);
                        //     jLabel2.setLocation(xball, yball++);
                    }
                    play_change(wood1, xwood1, ywood1--);
                    play_change(wood2, xwood2, ywood2--);
                    play_change(wood3, xwood3, ywood3--);
                    play_change(wood4, xwood4, ywood4--);
                    play_change(wood5, xwood5, ywood5--);
                    
                    if ((wood1.getY() + wood1.getHeight()) <= 0) {
                        wood1.setLocation(xwood1 = levels[cpt_stage], ywood1 = 550);
                        //    System.out.println(cpt_stage);
                    }
                    if ((wood2.getY() + wood2.getHeight()) <= 0) {
                        wood2.setLocation(xwood2 = levels[cpt_stage + 1], ywood2 = 550);
                    }
                    if ((wood3.getY() + wood3.getHeight()) <= 0) {
                        wood3.setLocation(xwood3 = levels[cpt_stage + 2], ywood3 = 550);
                    }
                    if ((wood5.getY() + wood5.getHeight()) <= 0) {
                        wood5.setLocation(xwood5 = levels[cpt_stage + 4], ywood5 = 550);
                    }
                    if ((wood4.getY() + wood4.getHeight()) <= 0) {
                        wood4.setLocation(xwood4 = levels[cpt_stage + 3], ywood4 = 550);
                        cpt_stage += 5;
                    }

                    if (cpt_stage == 35) {
                        cpt_stage = 0;
                    }

                }// end while
            }
        }.start();

    }

    public void play_change(JLabel j, int a, int b) {

        if (ball.getY() + ball.getHeight() == j.getY() || ball.getY() + ball.getHeight()-1 == j.getY() || ball.getY() + ball.getHeight()+1 == j.getY()) {

            if (ball.getX() + ball.getWidth() >= j.getX() && ball.getX() <= j.getX() + j.getWidth()) {

                if (star_score_x != j.getX()) {
                    save_Score = true;
                } else {
                    if (0 !=star_score.compareTo(j.getActionMap().toString()) ) {
                        save_Score = true;
                    }
                }
                if (save_Score == true) {
                    star_score_x = j.getX();
                    star_score = j.getActionMap().toString();
                    save_Score = false;
                    score++;
                    jLabelScore.setText(String.valueOf(score));
                //    System.out.println(score);
                }
                
                ball.setLocation(xball, yball = b - ball.getHeight() - 2);

            } else {
                //    jLabel2.setLocation(xball, yball++);
            }

        } else {
            //    jLabel2.setLocation(xball, yball++);   
        }
        j.setLocation(a, b--);

    }

    public void change_Jlebel(int c) {
        int d = 0;
        switch (c) {
            case 1:
                kzn = wood1;
                d = ywood1;
                name_wood=1;
                break;
            case 2:
                kzn = wood2;
                d = ywood2;
                name_wood=2;
                break;
            case 3:
                kzn = wood3;
                d = ywood3;
                name_wood=3;
                break;
            case 4:
                kzn = wood4;
                d = ywood4;
                name_wood=4;
                break;
            case 5:
                kzn = wood5;
                d = ywood5;
                name_wood=5;
                break;    
        }

        if (ball.getY() + ball.getHeight() == kzn.getY() || ball.getY() + ball.getHeight()-1 == kzn.getY() || ball.getY() + ball.getHeight()+1 == kzn.getY()) {

            if (ball.getX() + ball.getWidth() >= kzn.getX() && ball.getX() <= kzn.getX() + kzn.getWidth()) {
                dawn = false;

                if (star_score_x != kzn.getX()) {
                    save_Score = true;
                } else {
                    if (0 !=star_score.compareTo(kzn.getActionMap().toString()) ) {
                        save_Score = true;
                    }
                }

                if (save_Score == true) {
                    star_score_x = kzn.getX();
                    star_score = kzn.getActionMap().toString();
                    save_Score = false;
                    score++;
                    jLabelScore.setText(String.valueOf(score));
                   // System.out.println(score);
                }

                ball.setLocation(xball, yball = d - ball.getHeight() - 2);
            } else {
                dawn = true;
              //  jLabel2.setLocation(xball, yball++);
            }

        } else {
            dawn = true;
            //jLabel2.setLocation(xball, yball++);

        }

    }

    public void drawStars() throws InterruptedException {

        sleep(130);
        jLabel11.setIcon(BIG_STAR);
        sleep(130);
        jLabel11.setIcon(SMELL_STAR);
        sleep(130);
        jLabel10.setIcon(BIG_STAR);
        sleep(130);
        jLabel10.setIcon(SMELL_STAR);
        sleep(130);
        jLabel9.setIcon(BIG_STAR);
        sleep(130);
        jLabel9.setIcon(SMELL_STAR);
        sleep(130);
        jLabel8.setIcon(BIG_STAR);
        sleep(130);
        jLabel8.setIcon(SMELL_STAR);
        sleep(130);
        jLabel12.setIcon(BIG_STAR);
        sleep(130);
        jLabel12.setIcon(SMELL_STAR);
    }

    /**
     * ********************************main***************************************************
     * @param args
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Rapid_Roll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ball;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelColumnLeft;
    private javax.swing.JLabel jLabelColumnRight;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelScoreText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel wood1;
    private javax.swing.JLabel wood2;
    private javax.swing.JLabel wood3;
    private javax.swing.JLabel wood4;
    private javax.swing.JLabel wood5;
    // End of variables declaration//GEN-END:variables
}
