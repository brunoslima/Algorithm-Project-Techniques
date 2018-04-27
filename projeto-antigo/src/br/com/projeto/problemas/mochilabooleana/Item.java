
package br.com.projeto.problemas.mochilabooleana;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class Item {
    
    //Atributos
    private int valor;
    private int peso;

    //Construtor.
    /**
     * Este método é um construtor da classe Item.
     * @param valor inteiro com valor do item.
     * @param peso inteiro com o peso do item.
     */
    public Item(int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    
    //Getters e Setters
    /**
     * Este método é um getter de peso.
     * @return Retorna um inteiro que representa o peso.
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Este método é um getter do valor.
     * @return Retorna um inteiro que representa o valor.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Este método é um setter do peso.
     * @param peso Inteiro que representa o peso.
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Este método é um setter do valor.
     * @param valor Inteiro que representa o valor.
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
