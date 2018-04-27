
package br.com.projeto.problemas.mochilabooleana;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class Celula {

    //Atributos
    private int valor;
    private boolean mochila;

    //Construtores
    /**
     * Este é um construtor da classe Celula.
     */
    public Celula() {
    }
    
    /**
     * Este é um construtor da classe Celula.
     * @param valor Inteiro com o valor.
     * @param mochila Booleano.
     */
    public Celula(int valor, boolean mochila) {
        this.valor = valor;
        this.mochila = mochila;
    }

    /**
     * Este método retorna um booleano que indica o posivel resultado.
     * @return Booleano.
     */
    public boolean isMochila() {
        return mochila;
    }

    /**
     * Este método é um getter do valor.
     * @return Reotorna um inteiro que representa o valor.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Esté método é um setter do booleano.
     * @param mochila booleano.
     */
    public void setMochila(boolean mochila) {
        this.mochila = mochila;
    }

    /**
     * Este método é um setter do valor.
     * @param valor Inteiro que represente o valor.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
