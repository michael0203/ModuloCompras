package br.compra.telas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;


public class Principal extends javax.swing.JFrame {
    
    private final RequisicaoCompra req = new RequisicaoCompra();
    private Dimension d;

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane_principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_compras = new javax.swing.JMenu();
        requisicao = new javax.swing.JMenuItem();
        pedido = new javax.swing.JMenuItem();
        movimentacao = new javax.swing.JMenuItem();
        entrada_mercadorias = new javax.swing.JMenuItem();
        menu_estoque = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Módulo Compras");

        desktopPane_principal.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout desktopPane_principalLayout = new javax.swing.GroupLayout(desktopPane_principal);
        desktopPane_principal.setLayout(desktopPane_principalLayout);
        desktopPane_principalLayout.setHorizontalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
        );
        desktopPane_principalLayout.setVerticalGroup(
            desktopPane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        menu_compras.setText("Compras");

        requisicao.setText("Requisição de Compras");
        requisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requisicaoActionPerformed(evt);
            }
        });
        menu_compras.add(requisicao);

        pedido.setText("Pedido de Compras");
        menu_compras.add(pedido);

        movimentacao.setText("Movimentação de Compras");
        menu_compras.add(movimentacao);

        entrada_mercadorias.setText("Entrada de Mercadorias");
        menu_compras.add(entrada_mercadorias);

        jMenuBar1.add(menu_compras);

        menu_estoque.setText("Estoque");
        jMenuBar1.add(menu_estoque);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public void Janela(JInternalFrame frame) {
        desktopPane_principal.remove(frame);
        desktopPane_principal.add(frame);
        frame.moveToFront();
        frame.setVisible(true);
        Centralizar(frame);
    }

    public void Centralizar(JInternalFrame frame) {
        d = frame.getDesktopPane().getSize();
        frame.setLocation((d.width - frame.getSize().width) / 2, (d.height - frame.getSize().height) / 2);
    }
    
    private void requisicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requisicaoActionPerformed

        Janela(req);
        
    }//GEN-LAST:event_requisicaoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane_principal;
    private javax.swing.JMenuItem entrada_mercadorias;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_compras;
    private javax.swing.JMenu menu_estoque;
    private javax.swing.JMenuItem movimentacao;
    private javax.swing.JMenuItem pedido;
    private javax.swing.JMenuItem requisicao;
    // End of variables declaration//GEN-END:variables
}
