/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetorpg;

/**
 *
 * @author luis.nicolay
 */
public class ProjetoRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //INICIALIZAÇÕES DO JOGO
        System.out.println("Inicialização ...");
        
        //ABERTURA DA TELA INICIAL
        Principal tela = new Principal();
        tela.setResizable(false);
        tela.setVisible(true);
        
    }
    
}
