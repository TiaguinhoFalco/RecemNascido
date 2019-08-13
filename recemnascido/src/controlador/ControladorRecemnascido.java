/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DaoRecemnascido;
import javax.swing.JOptionPane;
import modelo.Recemnascido;
import tela.manutencao.ManutencaoRecemnascido;

public class ControladorRecemnascido {

   public static void inserir(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setNmae(man.jtfNmae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNquarto(Integer.parseInt(man.jtfNquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        
        boolean resultado = DaoRecemnascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        //definir todos os atributos
        objeto.setNmae(man.jtfNmae.getText());
        objeto.setPeso(Double.parseDouble(man.jtfPeso.getText()));
        objeto.setNquarto(Integer.parseInt(man.jtfNquarto.getText()));
        objeto.setSexo(man.jtfSexo.getText());
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        
        boolean resultado = DaoRecemnascido.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

     public static void excluir(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        
        boolean resultado = DaoRecemnascido.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    
}
