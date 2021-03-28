/*
 Rodrigo Lopez Alvarado
Calculadora Grafica
Numero de cuenta:19410308
Programación orientada a objetos
 */
package calculadoragrafica;

import java.util.Scanner;

/**
 *
 * @author gigon
 */
public class Calcugrafica extends javax.swing.JFrame {

    private double ans=0,aux=0;
    private char currop='\0';
    private int presicion=10000;
    private boolean hasToClear=false;
    public Calcugrafica() {
        initComponents();
        borrarPantalla();
        
        
    }
    public boolean isInteger() {
        int x=(int)ans;double y=(double)ans;
        
        y-=x;
        x=(int)(y*presicion);
        
        return (x==0)? true:false;
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
        Pantalla2 = new javax.swing.JLabel();
        Pantalla1 = new javax.swing.JLabel();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        division = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        borrarpantalla = new javax.swing.JButton();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pantalla1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pantalla2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(Pantalla1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Pantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });

        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        mult.setText("x");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        reiniciar.setText("ce");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        borrarpantalla.setText("c");
        borrarpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarpantallaActionPerformed(evt);
            }
        });

        borrar.setText("⟵");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cuatro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seis))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(uno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(punto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tres))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siete)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ocho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nueve))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(reiniciar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(borrarpantalla)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrar)
                            .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reiniciar)
                    .addComponent(borrarpantalla)
                    .addComponent(borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete)
                    .addComponent(ocho)
                    .addComponent(nueve)
                    .addComponent(division))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatro)
                    .addComponent(cinco)
                    .addComponent(seis)
                    .addComponent(mult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno)
                    .addComponent(dos)
                    .addComponent(tres)
                    .addComponent(menos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero)
                    .addComponent(punto)
                    .addComponent(mas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(igual)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarpantallaActionPerformed
        borrarPantalla();
        borrarPantalla1();
    }//GEN-LAST:event_borrarpantallaActionPerformed
    private boolean Pantalla2IsZero(){
        return(Pantalla2.getText().equals("0"))?true:false;
    }
    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        Pantalla2.setText((Pantalla2IsZero())?"7":(Pantalla2.getText())+"7");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());       
        
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"8":(Pantalla2.getText())+"8");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"9":(Pantalla2.getText())+"9");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_nueveActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"4":(Pantalla2.getText())+"4");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
         if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"5":(Pantalla2.getText())+"5");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
       
            
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"6":(Pantalla2.getText())+"6");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_seisActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"1":(Pantalla2.getText())+"1");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"2":(Pantalla2.getText())+"2");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        Pantalla2.setText((Pantalla2IsZero())?"3":(Pantalla2.getText())+"3");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_tresActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        if(!Pantalla2IsZero())
            Pantalla2.setText(Pantalla2.getText()+"0");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_ceroActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
       
        Pantalla1.setText(Pantalla1.getText()+Pantalla2.getText()+"+");
      if(currop != '\0'){
            igual();
        }
        else{
        
        borrarPantalla();
        }
        currop='+';
            
    }//GEN-LAST:event_masActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        igual();
        
    }//GEN-LAST:event_igualActionPerformed
    private void igual(){
        hasToClear=true;
        switch(currop){
            case '+':
                ans=aux+Double.parseDouble(Pantalla2.getText());
                break;
            case '-':
                ans=aux-Double.parseDouble(Pantalla2.getText());
                break;
            case 'x':
                ans=aux*Double.parseDouble(Pantalla2.getText());
                break;
            case '÷':
                ans=aux/Double.parseDouble(Pantalla2.getText());
               break;
        }
        Pantalla1.setText(Pantalla1.getText());
        Pantalla2.setText(isInteger()?Integer.toString((int)ans):Double.toString(ans));
        currop='\0';
        aux=ans;
    }
    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        Pantalla1.setText(Pantalla1.getText()+Pantalla2.getText()+"-");
        if(currop != '\0'){
            igual();
        }
        else{
        
        borrarPantalla();
        }
        currop='-';
    }//GEN-LAST:event_menosActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        if(hasToClear){
            borrarPantalla();
            hasToClear=false;
        }
        if(!Pantalla2.getText().contains("."))
        Pantalla2.setText(Pantalla2.getText()+".");
        if(currop=='\0')
                aux=Double.parseDouble(Pantalla2.getText());
    }//GEN-LAST:event_puntoActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        Pantalla1.setText(Pantalla1.getText()+Pantalla2.getText()+"x");
      if(currop != '\0'){
            igual();
        }
        else{
        
        borrarPantalla();
        }
        currop='x';
    }//GEN-LAST:event_multActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        Pantalla1.setText(Pantalla1.getText()+Pantalla2.getText()+"÷");
        if(currop!='\0')
            igual();
        else
            borrarPantalla();
        currop='÷';
    }//GEN-LAST:event_divisionActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(Pantalla2.getText().length()>0)
            Pantalla2.setText(Pantalla2.getText().substring(0, Pantalla2.getText().length()-1));
    }//GEN-LAST:event_borrarActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        borrarPantalla();
    }//GEN-LAST:event_reiniciarActionPerformed
private void imprimirResultado(){
    Pantalla2.setText(isInteger()?Integer.toString((int)ans):Double.toString(ans));
    
}
  private void borrarPantalla(){
      ans=0;
        Pantalla2.setText("");
        imprimirResultado();
  }
  private void borrarPantalla1(){
      Pantalla1.setText("");
  }
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
            java.util.logging.Logger.getLogger(Calcugrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcugrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcugrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcugrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calcugrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pantalla1;
    private javax.swing.JLabel Pantalla2;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrarpantalla;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton division;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JButton mult;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JButton punto;
    private javax.swing.JButton reiniciar;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
