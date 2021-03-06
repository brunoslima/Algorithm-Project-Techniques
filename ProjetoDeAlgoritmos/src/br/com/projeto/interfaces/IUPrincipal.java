/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        //Interface padrão ao sistema.
        try {    
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
            
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        //Titulo da aplicação
        this.setTitle("Projeto de Algoritmos");
        
        
        //icone da aplicação
        try{
            Image icon = Toolkit.getDefaultToolkit().getImage("src/br/com/projeto/interfaces/imagens/project.png");
            setIconImage(icon);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e, "ERRO", 0);
        }
        
        
        //Adicionando data a interface principal
        Calendar dataDoSistema = Calendar.getInstance();
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        this.lblData.setText(dataFormatada.format(dataDoSistema.getTime()));
        
        
        //Configurando horario para a interface principal
        Timer tempo = new Timer(1000, new hora());
        tempo.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        btnMochilaFracionaria = new javax.swing.JButton();
        btnAssociacaoTarefas = new javax.swing.JButton();
        btnMochilaBooleana = new javax.swing.JButton();
        btnSubsequenciaComumLonga = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuProblemas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        itemMenuSair = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto de Algoritmos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Data: ");

        jLabel2.setText("Horário:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMochilaFracionaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/bag64.png"))); // NOI18N
        btnMochilaFracionaria.setText("Mochila Fracionária");
        btnMochilaFracionaria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMochilaFracionaria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMochilaFracionaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaFracionariaActionPerformed(evt);
            }
        });

        btnAssociacaoTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/assigment64.png"))); // NOI18N
        btnAssociacaoTarefas.setText("Associação de Tarefas");
        btnAssociacaoTarefas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAssociacaoTarefas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAssociacaoTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssociacaoTarefasActionPerformed(evt);
            }
        });

        btnMochilaBooleana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/bag64.png"))); // NOI18N
        btnMochilaBooleana.setText("Mochila Booleana");
        btnMochilaBooleana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMochilaBooleana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMochilaBooleana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMochilaBooleanaActionPerformed(evt);
            }
        });

        btnSubsequenciaComumLonga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/igual64.png"))); // NOI18N
        btnSubsequenciaComumLonga.setText("Subsequência Comum Máxima");
        btnSubsequenciaComumLonga.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubsequenciaComumLonga.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSubsequenciaComumLonga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubsequenciaComumLongaActionPerformed(evt);
            }
        });

        menuInicio.setText("Inicio");

        menuProblemas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/seta24.png"))); // NOI18N
        menuProblemas.setText("Problemas");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/assigment24.png"))); // NOI18N
        jMenuItem4.setText("Associação de Tarefas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuProblemas.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/bag24.png"))); // NOI18N
        jMenuItem6.setText("Mochila Fracionária");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuProblemas.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/bag24.png"))); // NOI18N
        jMenuItem7.setText("Mochila Booleana");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuProblemas.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/igual24.png"))); // NOI18N
        jMenuItem8.setText("Subsequência Comum Máxima");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuProblemas.add(jMenuItem8);

        menuInicio.add(menuProblemas);

        itemMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itemMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/sair24.png"))); // NOI18N
        itemMenuSair.setText("Sair");
        itemMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuSairActionPerformed(evt);
            }
        });
        menuInicio.add(itemMenuSair);

        jMenuBar1.add(menuInicio);

        MenuAjuda.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto/interfaces/imagens/about24.png"))); // NOI18N
        jMenuItem1.setText("Sobre");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MenuAjuda.add(jMenuItem1);

        jMenuBar1.add(MenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssociacaoTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btnMochilaFracionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMochilaBooleana, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubsequenciaComumLonga, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssociacaoTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMochilaFracionaria, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMochilaBooleana, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubsequenciaComumLonga, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        IUSobre cad = new IUSobre(this,true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itemMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuSairActionPerformed

        this.dispose();
        
    }//GEN-LAST:event_itemMenuSairActionPerformed

    private void btnSubsequenciaComumLongaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubsequenciaComumLongaActionPerformed

        IUSubsequenciaComumMaxima cad = new IUSubsequenciaComumMaxima(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_btnSubsequenciaComumLongaActionPerformed

    private void btnMochilaBooleanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaBooleanaActionPerformed

        IUMochilaBooleana cad = new IUMochilaBooleana(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_btnMochilaBooleanaActionPerformed

    private void btnMochilaFracionariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMochilaFracionariaActionPerformed

        IUMochilaFracionaria cad = new IUMochilaFracionaria(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_btnMochilaFracionariaActionPerformed

    private void btnAssociacaoTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssociacaoTarefasActionPerformed
        
        IUAssociacaoTarefas cad = new IUAssociacaoTarefas(this, true);
        cad.setLocationRelativeTo(this);
        
        try{
            cad.setVisible(true);
        }
        catch (Exception e) {
            System.out.println("Exception da tabela");
        }
        
    }//GEN-LAST:event_btnAssociacaoTarefasActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:

        IUSubsequenciaComumMaxima cad = new IUSubsequenciaComumMaxima(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        IUMochilaBooleana cad = new IUMochilaBooleana(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

        IUMochilaFracionaria cad = new IUMochilaFracionaria(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        IUAssociacaoTarefas cad = new IUAssociacaoTarefas(this, true);
        cad.setLocationRelativeTo(this);
        cad.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JButton btnAssociacaoTarefas;
    private javax.swing.JButton btnMochilaBooleana;
    private javax.swing.JButton btnMochilaFracionaria;
    private javax.swing.JButton btnSubsequenciaComumLonga;
    private javax.swing.JMenuItem itemMenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenu menuProblemas;
    // End of variables declaration//GEN-END:variables

  class hora implements ActionListener {
      
       @Override
       public void actionPerformed(ActionEvent e){
            Calendar novo = Calendar.getInstance();
            lblHora.setText(String.format("%1$tH:%1$tM:%1$tS", novo));
       }
       
   }

  
}
