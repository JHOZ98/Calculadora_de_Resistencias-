package resistencias;

/**
 *
 * @author Jesús Humberto
 */
public class Pantalla6 extends javax.swing.JFrame {

    public Pantalla6() {
        initComponents();
    }
    float valor = 0;
    int banda1 = 0;
    int banda2 = 0;
    int banda3 = 0;
    int banda4 = 3;
    int banda5 = 0;
    int banda6 = 0;
    
    float valor_ini = 0;
    String valor_tex = "";
    float valor_fin = 0;
    String multiplicador = "";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(460, 220, 20, 120);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(220, 220, 20, 120);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(270, 230, 20, 100);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(320, 230, 20, 100);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(370, 230, 20, 100);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(410, 230, 20, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\luig_\\Downloads\\Resistencias.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 170, 520, 230);

        jLabel1.setText("Valor deseado:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 70, 87, 16);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");
        jPanel1.add(jTextField1);
        jTextField1.setBounds(110, 70, 80, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Calculadora de Resistencias");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 340, 40);

        jButton2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton2.setText("↑");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 130, 50, 40);

        jButton3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton3.setText("↓");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(390, 400, 50, 40);

        jButton4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton4.setText("↑");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(300, 130, 50, 40);

        jButton5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton5.setText("↑");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(350, 130, 50, 40);

        jButton6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton6.setText("↑");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(250, 130, 50, 40);

        jButton7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton7.setText("↓");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(240, 400, 50, 40);

        jButton8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton8.setText("↓");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(290, 400, 50, 40);

        jButton9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton9.setText("↓");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(340, 400, 50, 40);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setText("-");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(200, 70, 40, 22);

        jLabel4.setText("Ohms");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 70, 50, 16);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 70, 90, 25);

        jLabel5.setText("No. Bandas");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 20, 70, 16);

        jButton10.setText("4 Bandas");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(570, 40, 100, 25);

        jButton11.setText("5 Bandas");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(570, 70, 100, 25);

        jLabel6.setText("6 Bandas");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 50, 60, 16);

        jButton12.setText("Salir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(600, 430, 87, 25);

        jLabel7.setText("Tolerancia");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 70, 70, 16);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setText("10");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(470, 70, 60, 22);

        jLabel8.setText("%");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 70, 20, 16);

        jButton13.setText("Reinicio");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(10, 430, 100, 25);

        jButton14.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton14.setText("↑");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);
        jButton14.setBounds(200, 130, 50, 40);

        jButton15.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton15.setText("↓");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);
        jButton15.setBounds(190, 400, 50, 40);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField4.setText("1");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(470, 100, 60, 22);

        jLabel9.setText("PPM");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(430, 100, 41, 16);

        jButton16.setFont(new java.awt.Font("Franklin Gothic Book", 1, 13)); // NOI18N
        jButton16.setText("↑");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);
        jButton16.setBounds(450, 130, 50, 40);

        jButton17.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jButton17.setText("↓");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);
        jButton17.setBounds(440, 400, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        new Pantalla().setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        System.exit(0);      
    }//GEN-LAST:event_jButton12ActionPerformed

    void actualizar(){
        valor = 0;
        valor += banda5*100;
        valor += banda1*10;
        valor += banda2;
        
        switch(banda3){
            case 0:
                valor *= 1;
            break;
            case 1:
                valor *= 10;
            break;
            case 2:
                valor *= 100;
            break;
            case 3:
                valor *= 1000;
            break;
            case 4:
                valor *= 10000;
            break;
            case 5:
                valor /= 10;
            break;
            case 6: 
                valor /= 100;
            break;
        }
        if(valor>=1000000){
            valor /= 1000000;
            jTextField2.setText("M");
        }
        else{
            if(valor>=1000){
                valor /= 1000;
                jTextField2.setText("K");
            }
            else{
                jTextField2.setText("-");
            }
        }
        String aux = Float.toString(valor);
        jTextField1.setText(aux);
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        banda1++;
        if(banda1 == 10){
            banda1 = 0;
        }
        switch(banda1){
            case 0:
                jPanel2.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel2.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel2.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel2.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel2.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel2.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel2.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel2.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }
        actualizar();
    }//GEN-LAST:event_jButton6ActionPerformed

    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        banda1--;
        if(banda1 == -1){
            banda1 = 9;
        }
        switch(banda1){
            case 0:
                jPanel2.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel2.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel2.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel2.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel2.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel2.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel2.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel2.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel2.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }       
        actualizar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        banda2++;
        if(banda2 == 10){
            banda2 = 0;
        }
        switch(banda2){
            case 0:
                jPanel3.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel3.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel3.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel3.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel3.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel3.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel3.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel3.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel3.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }        
        actualizar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        banda2--;
        if(banda2 == -1){
            banda2 = 9;
        }
        switch(banda2){
            case 0:
                jPanel3.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel3.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel3.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel3.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel3.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel3.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel3.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel3.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel3.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel3.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }       
        actualizar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        banda3++;
        if(banda3 == 7){
            banda3 = 0;
        }
        switch(banda3){
            case 0:
                jPanel4.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel4.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel4.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel4.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel4.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel4.setBackground(new java.awt.Color(218,165,32));
            break;
            case 6: 
                jPanel4.setBackground(new java.awt.Color(128, 128, 128));
            break;
        }       
        actualizar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        banda3--;
        if(banda3 == -1){
            banda3 = 6;
        }
        switch(banda3){
            case 0:
                jPanel4.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel4.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel4.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel4.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel4.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel4.setBackground(new java.awt.Color(218,165,32));
            break;
            case 6: 
                jPanel4.setBackground(new java.awt.Color(128, 128, 128));
            break;
        }    
        actualizar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        banda4++;
        if(banda4 == 4){
            banda4 = 0;
        }
        switch(banda4){
            case 0:
                jPanel5.setBackground(new java.awt.Color(139, 69, 19));
                jTextField3.setText("1");
            break;
            case 1:
                jPanel5.setBackground(new java.awt.Color(255, 0, 0));
                jTextField3.setText("2");
            break;
            case 2:
                jPanel5.setBackground(new java.awt.Color(218,165,32));
                jTextField3.setText("5");
            break;
            case 3:
                jPanel5.setBackground(new java.awt.Color(128, 128, 128));
                jTextField3.setText("10");
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int ban = 0;
        valor_tex = jTextField1.getText();    
        valor_ini = new Float(valor_tex);
        float valini = valor_ini;
        multiplicador = jTextField2.getText();
        char MUL = multiplicador.charAt(0);
        if(MUL == '-'){
            valor_fin = valor_ini * 1;
        }
        else{
            if(MUL == 'K'){
                valor_fin = valor_ini * 1000;
            }
            else{
                if(MUL == 'M'){
                     valor_fin = valor_ini * 1000000;
                }
            }
        }
        char C = '0';
        char D = '0';
        char A = valor_tex.charAt(0);
        if(valor_tex.length()>1){
            char B = valor_tex.charAt(1);
            if(B == '.'){
                ban=1;
                B = valor_tex.charAt(2);
            }
            C=B;
            if(valor_tex.length()>2){
                if(ban==1){
                D = valor_tex.charAt(3);
                }
                else{
                    D = valor_tex.charAt(2);
                }
                if( D == '.'){
                    ban=2;
                    D = valor_tex.charAt(3);
                }
                 switch(D){
                    case '0':
                        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
                    break;
                    case '1':
                        jPanel3.setBackground(new java.awt.Color(139, 69, 19));
                    break;
                    case '2':
                        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
                    break;
                    case '3':
                        jPanel3.setBackground(new java.awt.Color(255, 165, 0));
                    break;
                    case '4':
                        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
                    break;
                    case '5':
                        jPanel3.setBackground(new java.awt.Color(0, 128, 0));
                    break;
                    case '6':
                        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
                    break;
                    case '7':
                        jPanel3.setBackground(new java.awt.Color(128, 0, 128));
                    break;
                    case '8': 
                        jPanel3.setBackground(new java.awt.Color(128, 128, 128));
                    break;
                    case '9':
                        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
                    break;
                }  
            }
            switch(B){
                case '0':
                    jPanel2.setBackground(new java.awt.Color(0, 0, 0));
                break;
                case '1':
                    jPanel2.setBackground(new java.awt.Color(139, 69, 19));
                break;
                case '2':
                    jPanel2.setBackground(new java.awt.Color(255, 0, 0));
                break;
                case '3':
                    jPanel2.setBackground(new java.awt.Color(255, 165, 0));
                break;
                case '4':
                    jPanel2.setBackground(new java.awt.Color(255, 255, 0));
                break;
                case '5':
                    jPanel2.setBackground(new java.awt.Color(0, 128, 0));
                break;
                case '6':
                    jPanel2.setBackground(new java.awt.Color(0, 0, 255));
                break;
                case '7':
                    jPanel2.setBackground(new java.awt.Color(128, 0, 128));
                break;
                case '8': 
                    jPanel2.setBackground(new java.awt.Color(128, 128, 128));
                break;
                case '9':
                    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                break;
            }
            
        }
        switch(A){
            case '0':
                jPanel6.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case '1':
                jPanel6.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case '2':
                jPanel6.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case '3':
                jPanel6.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case '4':
                jPanel6.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case '5':
                jPanel6.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case '6':
                jPanel6.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case '7':
                jPanel6.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case '8': 
                jPanel6.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case '9':
                jPanel6.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }
        String y = "";
        y += A;
        if(valor_tex.length()>1){
            if(ban == 1){
                y += '.';
            }
            
                y+= C;
            
            if(ban == 2){
                y += '.';
            }
            
                y += D;
            
            
        }
        System.out.println(y);
        valini = new Float(y);
        if(ban == 2){
            valini*=10;
        }
        else{
            if(ban == 1){
                valini*=100;
            }
        }
        System.out.println(valini);
        if((valini * 1) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        }
        if((valini * 10) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(139, 69, 19));
        }
        if((valini * 100) == valor_fin){
             jPanel4.setBackground(new java.awt.Color(255, 0, 0));
        }
        if((valini * 1000) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(255, 165, 0));
        }
        if((valini * 10000) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(255, 255, 0));
        }
        if((valini / 10) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(218,165,32));
        }
        if((valini / 100) == valor_fin){
            jPanel4.setBackground(new java.awt.Color(128, 128, 128));
        }
        
  
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        valor = 0;
        banda1 = 0;
        banda2 = 0;
        banda3 = 0;
        banda4 = 3;
        banda5 = 0;
        actualizar();
        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBackground(new java.awt.Color(128, 128, 128));
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        banda5++;
        if(banda5 == 10){
            banda5 = 0;
        }
        switch(banda5){
            case 0:
                jPanel6.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel6.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel6.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel6.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel6.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel6.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel6.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel6.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel6.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel6.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }               
        actualizar();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        banda5--;
        if(banda5 == -1){
            banda5 = 9;
        }
        switch(banda5){
            case 0:
                jPanel6.setBackground(new java.awt.Color(0, 0, 0));
            break;
            case 1:
                jPanel6.setBackground(new java.awt.Color(139, 69, 19));
            break;
            case 2:
                jPanel6.setBackground(new java.awt.Color(255, 0, 0));
            break;
            case 3:
                jPanel6.setBackground(new java.awt.Color(255, 165, 0));
            break;
            case 4:
                jPanel6.setBackground(new java.awt.Color(255, 255, 0));
            break;
            case 5:
                jPanel6.setBackground(new java.awt.Color(0, 128, 0));
            break;
            case 6:
                jPanel6.setBackground(new java.awt.Color(0, 0, 255));
            break;
            case 7:
                jPanel6.setBackground(new java.awt.Color(128, 0, 128));
            break;
            case 8: 
                jPanel6.setBackground(new java.awt.Color(128, 128, 128));
            break;
            case 9:
                jPanel6.setBackground(new java.awt.Color(255, 255, 255));
            break;
        }       
        actualizar();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        new Pantalla5().setVisible(true);
        this.dispose();        
        this.dispose();       
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        banda4--;
        if(banda4 == -1){
            banda4 = 3;
        }
        switch(banda4){
            case 0:
                jPanel5.setBackground(new java.awt.Color(255, 255, 255));
                jTextField3.setText("1");
            break;
            case 1:
                jPanel5.setBackground(new java.awt.Color(128, 0, 128));
                jTextField3.setText("2");
            break;
            case 2:
                jPanel5.setBackground(new java.awt.Color(0, 0, 255));
                jTextField3.setText("5");
            break;
            case 3:
                jPanel5.setBackground(new java.awt.Color(128, 128, 128));
                jTextField3.setText("10");
            break;
        }           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        banda6++;
        if(banda6 == 7){
            banda6 = 0;
        }
        switch(banda6){
            case 0:
                jPanel7.setBackground(new java.awt.Color(255,255,255));
                jTextField4.setText("1");
            break;
            case 1:
                jPanel7.setBackground(new java.awt.Color(128,0,128));
                jTextField4.setText("5");
            break;
            case 2:
                jPanel7.setBackground(new java.awt.Color(0,0,255));
                jTextField4.setText("10");
            break;
            case 3:
                jPanel7.setBackground(new java.awt.Color(255,165,0));
                jTextField4.setText("15");
            break;
            case 4:
                jPanel7.setBackground(new java.awt.Color(255,255,0));
                jTextField4.setText("25");
            break;
            case 5:
                jPanel7.setBackground(new java.awt.Color(255, 0, 0));
                jTextField4.setText("50");
            break;
            case 6:
                jPanel7.setBackground(new java.awt.Color(139, 69, 19));
                jTextField4.setText("100");
            break;
        }       
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         banda6--;
        if(banda6 == -1){
            banda6 = 6;
        }
        switch(banda6){
            case 0:
                jPanel7.setBackground(new java.awt.Color(139, 69, 19));
                jTextField4.setText("1");
            break;
            case 1:
                jPanel7.setBackground(new java.awt.Color(255, 0, 0));
                jTextField4.setText("5");
            break;
            case 2:
                jPanel7.setBackground(new java.awt.Color(218,165,32));
                jTextField4.setText("10");
            break;
            case 3:
                jPanel7.setBackground(new java.awt.Color(128, 128, 128));
                jTextField4.setText("15");
            break;
            case 4:
                jPanel7.setBackground(new java.awt.Color(255, 255, 0));
                jTextField4.setText("25");
            break;
            case 5:
                jPanel7.setBackground(new java.awt.Color(255, 0, 0));
                jTextField4.setText("50");
            break;
            case 6:
                jPanel7.setBackground(new java.awt.Color(139, 69, 19));
                jTextField4.setText("100");
            break;
        }        
    }//GEN-LAST:event_jButton17ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
