/*
* Classe Personagem, gerencia o Personagem principal e inimigos do jogo
*/

public class Personagem {
    
    // Cap maximo de 5

    int forca;
    int agilidade;
    int inteligencia;

    // vida = 10 + forca
    int vida;

    // mana = 10 + inteligencia
    int mana;

    // dano = forca
    int danoBase;

    // armadura = agilidade
    int armaduraBase;
    
    // esquiva = agilidade * 0,1 
    float esquiva;

    public Personagem(int forca, int agilidade, int inteligencia, int vida, int mana, int danoBase, int armaduraBase, float esquiva) {
        this.forca = forca;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.vida = vida;
        this.mana = mana;
        this.danoBase = danoBase;
        this.armaduraBase = armaduraBase;
        this.esquiva = esquiva;
    }

    public int getForca() {
        return forca;
    }
    public void setForca(int forca) {
        this.forca = forca;
    }
    public int getAgilidade() {
        return agilidade;
    }
    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getDanoBase() {
        return danoBase;
    }
    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }
    public int getArmaduraBase() {
        return armaduraBase;
    }
    public void setArmaduraBase(int armaduraBase) {
        this.armaduraBase = armaduraBase;
    }
    public float getEsquiva() {
        return esquiva;
    }
    public void setEsquiva(float esquiva) {
        this.esquiva = esquiva;
    }
}
