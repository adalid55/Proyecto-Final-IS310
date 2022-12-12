package com.mycompany.calculator;

public class Calculadora extends javax.swing.JFrame {

    String N1 = "";
    String N2;
    String NT;
    String signo;
    int lon;
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextResultado = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        cero = new javax.swing.JLabel();
        punto = new javax.swing.JLabel();
        borrar = new javax.swing.JLabel();
        igual = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        mas = new javax.swing.JLabel();
        cuatro = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        menos = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        ocho = new javax.swing.JLabel();
        nueve = new javax.swing.JLabel();
        por = new javax.swing.JLabel();
        ac = new javax.swing.JLabel();
        raiz = new javax.swing.JLabel();
        potencia = new javax.swing.JLabel();
        entre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextResultado.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jTextResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 190, 40));

        jTextField1.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/0.png"))); // NOI18N
        cero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ceroMouseClicked(evt);
            }
        });
        jPanel1.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 50, 40));

        punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto.png"))); // NOI18N
        punto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                puntoMouseClicked(evt);
            }
        });
        jPanel1.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 50, 40));

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/borrar.png"))); // NOI18N
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 50, 40));
        borrar.getAccessibleContext().setAccessibleDescription("");

        igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igual.png"))); // NOI18N
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                igualMouseClicked(evt);
            }
        });
        jPanel1.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 50, 40));

        uno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoMouseClicked(evt);
            }
        });
        jPanel1.add(uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 50, 40));

        dos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2.png"))); // NOI18N
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosMouseClicked(evt);
            }
        });
        jPanel1.add(dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 50, 40));

        tres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });
        jPanel1.add(tres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 50, 40));

        mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mas.png"))); // NOI18N
        mas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masMouseClicked(evt);
            }
        });
        jPanel1.add(mas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 50, 40));

        cuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        cuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuatroMouseClicked(evt);
            }
        });
        jPanel1.add(cuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 50, 40));

        cinco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });
        jPanel1.add(cinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 50, 40));

        seis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });
        jPanel1.add(seis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, 40));

        menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menos.png"))); // NOI18N
        menos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menosMouseClicked(evt);
            }
        });
        jPanel1.add(menos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, 40));

        siete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/7.png"))); // NOI18N
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sieteMouseClicked(evt);
            }
        });
        jPanel1.add(siete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 40));

        ocho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/8.png"))); // NOI18N
        ocho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ochoMouseClicked(evt);
            }
        });
        jPanel1.add(ocho, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 50, 40));

        nueve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/9.png"))); // NOI18N
        nueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nueveMouseClicked(evt);
            }
        });
        jPanel1.add(nueve, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 50, 40));

        por.setIcon(new javax.swing.ImageIcon(getClass().getResource("/por.png"))); // NOI18N
        por.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porMouseClicked(evt);
            }
        });
        jPanel1.add(por, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 50, 40));

        ac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ac.png"))); // NOI18N
        ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acMouseClicked(evt);
            }
        });
        jPanel1.add(ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 40));

        raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raiz.png"))); // NOI18N
        raiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                raizMouseClicked(evt);
            }
        });
        jPanel1.add(raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 50, 40));

        potencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/potencia.png"))); // NOI18N
        potencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                potenciaMouseClicked(evt);
            }
        });
        jPanel1.add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, 40));

        entre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/entre.png"))); // NOI18N
        entre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entreMouseClicked(evt);
            }
        });
        jPanel1.add(entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ceroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceroMouseClicked
        jTextField1.setText(jTextField1.getText()+"0");
    }//GEN-LAST:event_ceroMouseClicked

    private void unoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMouseClicked
        jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_unoMouseClicked

    private void dosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMouseClicked
        jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_dosMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_tresMouseClicked

    private void cuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuatroMouseClicked
        jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_cuatroMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_seisMouseClicked

    private void sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMouseClicked
        jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_sieteMouseClicked

    private void ochoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ochoMouseClicked
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_ochoMouseClicked

    private void nueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nueveMouseClicked
        jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_nueveMouseClicked

    private void puntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_puntoMouseClicked
        String cadena;
        cadena = jTextField1.getText();
        if (cadena.length() <= 0){
            jTextField1.setText("0.");
        }else{
            if (!existepunto(jTextField1.getText())){
                jTextField1.setText(jTextField1.getText()+".");
            }
        }
    }//GEN-LAST:event_puntoMouseClicked

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        String cadena;
        cadena = jTextField1.getText();
        if (cadena.length()>0){
            cadena = cadena.substring(0, cadena.length()-1);
            jTextField1.setText(cadena);
        }
    }//GEN-LAST:event_borrarMouseClicked

    private void acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseClicked
        jTextField1.setText("");
        jTextResultado.setText("");
    }//GEN-LAST:event_acMouseClicked

    private void menosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menosMouseClicked
        if(!jTextResultado.getText().equals("")){
            jTextField1.setText(jTextResultado.getText() + "-");
        }
        if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            signo = "-";
            if (!jTextResultado.getText().equals("")){
                NT = jTextResultado.getText();
            }
            String cadena = jTextField1.getText();
            if (!cadena.substring(cadena.length()-1, cadena.length()).equals("-")){
            jTextField1.setText(jTextField1.getText() + "-");    
            }
        }
    }//GEN-LAST:event_menosMouseClicked

    private void igualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMouseClicked
        if(N1.equals("")){
          jTextResultado.setText(jTextField1.getText());
        }
        
        String resultado;
        lon = N1.length();
        String cadena;
        cadena = jTextField1.getText();
        if (!jTextResultado.getText().equals("")){
            N1 = NT;
         N2 = cadena.substring(lon , cadena.length());
            if (!N2.equals("")){
                resultado = calculos (N1,N2,signo);
                jTextResultado.setText(resultado);
            }              
        }else{
        N2 = cadena.substring(lon + 1, cadena.length());
        if (!N2.equals("")){
            resultado = calculos (N1,N2,signo);
            jTextResultado.setText(resultado);
        }            
        }

        System.err.println("N1 "+ N1);
        System.err.println("N2 "+ N2);
    }//GEN-LAST:event_igualMouseClicked

    private void masMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masMouseClicked
        if(!jTextResultado.getText().equals("")){
            jTextField1.setText(jTextResultado.getText() + "+");
        }
        if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            signo = "+";
            if (!jTextResultado.getText().equals("")){
                NT = jTextResultado.getText();
            }
            String cadena = jTextField1.getText();
            if (!cadena.substring(cadena.length()-1, cadena.length()).equals("+")){
            jTextField1.setText(jTextField1.getText() + "+");    
            }
        }
    }//GEN-LAST:event_masMouseClicked

    private void porMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porMouseClicked
        if(!jTextResultado.getText().equals("")){
            jTextField1.setText(jTextResultado.getText() + "*");
        }
        if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            signo = "*";
            if (!jTextResultado.getText().equals("")){
                NT = jTextResultado.getText();
            }
            String cadena = jTextField1.getText();
            if (!cadena.substring(cadena.length()-1, cadena.length()).equals("*")){
            jTextField1.setText(jTextField1.getText() + "*");    
            }
        }
    }//GEN-LAST:event_porMouseClicked

    private void entreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entreMouseClicked
        if(!jTextResultado.getText().equals("")){
            jTextField1.setText(jTextResultado.getText() + "/");
        }
        if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            signo = "/";
            if (!jTextResultado.getText().equals("")){
                NT = jTextResultado.getText();
            }
            String cadena = jTextField1.getText();
            if (!cadena.substring(cadena.length()-1, cadena.length()).equals("/")){
            jTextField1.setText(jTextField1.getText() + "/");    
            }
        }
    }//GEN-LAST:event_entreMouseClicked

    private void potenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_potenciaMouseClicked
        if(!jTextResultado.getText().equals("")){
            jTextField1.setText(jTextResultado.getText() + "^");
        }
        if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            signo = "^";
            if (!jTextResultado.getText().equals("")){
                NT = jTextResultado.getText();
            }
            String cadena = jTextField1.getText();
            if (!cadena.substring(cadena.length()-1, cadena.length()).equals("^")){
            jTextField1.setText(jTextField1.getText() + "^");    
            }
        }
    }//GEN-LAST:event_potenciaMouseClicked

    private void raizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_raizMouseClicked
        Double raiz = 0.0;
        Double resu;
        if (!jTextResultado.getText().equals("")){
            N1 = jTextResultado.getText();
            raiz = Double.parseDouble(N1);
            resu = Math.sqrt(raiz);
            Double round = Math.round(resu * 10000.0) / 10000.0;
            jTextField1.setText("Sqrt" + "(" + N1 + ")");
            jTextResultado.setText(round.toString());
        }  else{
            if (!jTextField1.getText().equals("")){
            N1 = jTextField1.getText();
            raiz = Double.parseDouble(N1);
            resu = Math.sqrt(raiz);
            Double round = Math.round(resu * 10000.0) / 10000.0;
            jTextField1.setText("Sqrt" + "(" + N1 + ")");
            jTextResultado.setText(round.toString());
            }
        }      
        
    }//GEN-LAST:event_raizMouseClicked

    public static boolean existepunto(String cadena){
        boolean resultado;
        resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public static String calculos(String N1, String N2, String signo){
        Double resultado = 0.0;
        String Resp;
        
        if (signo.equals("-")){
            resultado = Double.parseDouble(N1) - Double.parseDouble(N2);         
        }
        
        if (signo.equals("+")){
            resultado = Double.parseDouble(N1) + Double.parseDouble(N2);         
        }
        
        if (signo.equals("*")){
            resultado = Double.parseDouble(N1) * Double.parseDouble(N2);         
        }

        if (signo.equals("/")){
            resultado = Double.parseDouble(N1) / Double.parseDouble(N2);         
        }
       
        if (signo.equals("^")){
            resultado = Math.pow(Double.parseDouble(N1), Double.parseDouble(N2));
        }        
        
        Resp = resultado.toString();
        return Resp;
    }
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ac;
    private javax.swing.JLabel borrar;
    private javax.swing.JLabel cero;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel cuatro;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel entre;
    private javax.swing.JLabel igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextResultado;
    private javax.swing.JLabel mas;
    private javax.swing.JLabel menos;
    private javax.swing.JLabel nueve;
    private javax.swing.JLabel ocho;
    private javax.swing.JLabel por;
    private javax.swing.JLabel potencia;
    private javax.swing.JLabel punto;
    private javax.swing.JLabel raiz;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel uno;
    // End of variables declaration//GEN-END:variables
}
