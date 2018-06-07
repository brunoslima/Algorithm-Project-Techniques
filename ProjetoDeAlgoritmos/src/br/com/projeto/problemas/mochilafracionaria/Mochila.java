
package br.com.projeto.problemas.mochilafracionaria;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class Mochila {

    //Atributos
    private int capacidade;
    private Item[] itens;
    private String valorFinal;

    /**
     * Este método é um construtor da classe Mochila
     * @param capacidade inteiro que representa a capacidade da mochila.
     * @param itens vetor com os itens da mochila.
     */
    public Mochila(int capacidade, Item[] itens) {
        this.capacidade = capacidade;
        this.itens = itens;
        this.valorFinal = "0";
    }

    //Getters e Setters
    /**
     * Este método é um getter da capacidade da mochila.
     * @return Retorna a capacidade da mochila.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Este método é um setter da capacidade da mochila.
     * @param capacidade inteiro que representa a capacidade da mochila.
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

     /**
     * Este método é um getter do valor final da mochila.
     * @return Retorna o valor final da mochila.
     */
    public String getValorFinal() {
        return valorFinal;
    }

     /**
     * Este método é um setter do valor final da mochila.
     * @param valorFinal inteiro que representa o valor final da mochila.
     */
    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    /**
     * Este metodo realiza a ordenação dos itens com a relação valor/peso.
     */
    public void sort() {
        
        int i, j, continua = 1;
        Item a = new Item();
        
        for(i = 1; (i < itens.length) && (continua != 0); i++){
            
            continua = 0;
            for(j = 0; (j < itens.length-i); j++){
                
                if(((float)itens[j].getValor()/itens[j].getPeso()) < ((float)itens[j+1].getValor()/itens[j+1].getPeso())){
                    
                    a.setPeso(itens[j].getPeso());
                    a.setValor(itens[j].getValor());
                    itens[j].setPeso(itens[j+1].getPeso());
                    itens[j].setValor(itens[j+1].getValor());
                    itens[j+1].setPeso(a.getPeso());
                    itens[j+1].setValor(a.getValor());
                    continua = 1;
                }
            }
        }
    }
    
    
    /**
     * Este método soluciona o problema da mochila fracionaria.
     * @return Retorna uma string que contém o resultado do problema.
     */
    public String fractionalKnapsack(){
        
        this.sort();
        
        int i;
        float[] vetor = new float[itens.length];
        float capacidade = this.capacidade;
        
        for(i = 0; i < itens.length; i++){
            
            if(itens[i].getPeso() < capacidade){
                vetor[i] = 1;
                capacidade -= itens[i].getPeso();
            }
            else{
                vetor[i] = capacidade/itens[i].getPeso();
                break;
            }
        }
        
        String s = "";
        i = 0;
        float valorFinal = 0.0f;
        while(i < vetor.length && vetor[i] != 0){
            s += "("+ itens[i].getValor() +","+ itens[i].getPeso()+"," + (int)(vetor[i]*100) +") ";
            valorFinal += itens[i].getValor() * vetor[i];
            i++;
            if(i % 4 == 0) s +="\n";
        }
        
        this.valorFinal = "" + valorFinal;
        
        return s;
    }
    
    
}
