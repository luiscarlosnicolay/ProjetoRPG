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
public class Personagem {
    
    private String nome;
    private String classe;
    private int nivel;
    private int vida;
    private int ataque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
        public String toString() {
        return
        "Nome: " + nome + "\n" +        
        "Classe: " + classe + "\n" +
        "Nível: " + nivel + "\n" +
        "Vida: " + vida + "\n" +
        "Ataque: " + ataque + "\n";      
 
                
    }
    
    
}
