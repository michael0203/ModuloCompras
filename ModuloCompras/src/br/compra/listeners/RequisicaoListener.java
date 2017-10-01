
package br.compra.listeners;

import br.compra.getset.RequisicaoGetSet;
import br.compra.telas.RequisicaoCompra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RequisicaoListener implements ActionListener{
    
   private final RequisicaoCompra requisicao;
   private RequisicaoGetSet req; 
    
    public RequisicaoListener(RequisicaoCompra requisicao){
        
        this.requisicao = requisicao;
    }
    @Override
     public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Inserir")) {
        
            System.out.println("Inseriu");
            
        }
        
        if (e.getActionCommand().equals("Editar")) {
        
            System.out.println("Editou");
            
        }
        if (e.getActionCommand().equals("Excluir")) {
        
            System.out.println("Escluiu");
            
        }
       
     }
}
