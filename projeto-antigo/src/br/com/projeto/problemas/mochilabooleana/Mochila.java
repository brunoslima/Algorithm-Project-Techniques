
package br.com.projeto.problemas.mochilabooleana;


/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class Mochila {
    
    //Atributos
    private int capacidade;
    private Item[] itens;
    private Celula[][] tabela;

    
    //Construtor
    /**
     * Este método é um construtor da classe Mochila.
     * @param capacidade inteiro que representa a capacidade da mochila.
     * @param itens vetor de itens da mochila.
     */
    public Mochila(int capacidade, Item[] itens) {
        this.capacidade = capacidade;
        this.itens = itens;
        this.tabela = new Celula[itens.length+1][capacidade+1];
    }

    
    //Getters e Setters
    /**
     * Este método é um getter dos itens da mochila.
     * @return Retorna o vetor de itens.
     */
    public Item[] getItens() {
        return itens;
    }

    /**
     * Este método é um getter da tabela.
     * @return Retorna a tabela.
     */
    public Celula[][] getTabela() {
        return tabela;
    }

    /**
     * Este método é um getter da capacidade da mochila.
     * @return Retorna um inteiro que representa a capacidade da mochila.
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Este método é um setter da capacidade da mochila.
     * @param capacidade Inteiro que representa a capacidade da mochila.
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Este método é um setter da capacidade da mochila.
     * @param itens Vetor de itens.
     */
    public void setItens(Item[] itens) {
        this.itens = itens;
    }

    /**
     * Este método é um setter da tabela.
     * @param tabela tabela.
     */
    public void setTabela(Celula[][] tabela) {
        this.tabela = tabela;
    }
    
    
    /**
     * Este método soluciona o problema da mochila booleana.
     * @return Retorna a resposta do problema.
     */
    public int[][] knapsack(){
        
        int w, i;
        
        int tamanho = itens.length;
        
        for(i = 0; i <= tamanho; i++)
            for(w = 0; w <= capacidade; w++)
                tabela[i][w] = new Celula();
        
        for(w = 0; w <= capacidade; w++){
            tabela[0][w].setValor(0);
            tabela[0][w].setMochila(false);
        }
        
        
        
        for(i = 1; i <= tamanho; i++){
            
            for(w = 0; w <= capacidade; w++){
                
                if(itens[i-1].getPeso() <= w && (itens[i-1].getValor()+tabela[i-1][w-itens[i-1].getPeso()].getValor()) > tabela[i-1][w].getValor()){
                    tabela[i][w].setValor(itens[i-1].getValor()+tabela[i-1][w-itens[i-1].getPeso()].getValor());
                    tabela[i][w].setMochila(true);
                }
                else{
                    tabela[i][w].setValor(tabela[i-1][w].getValor());
                    tabela[i][w].setMochila(false);
                }
            }
        }
        
        int k = capacidade;
        int[][] resposta = new int[tamanho][2];
        
        int count = 0;
        for(i = tamanho; i >= 1; i--){
            
            if(tabela[i][k].isMochila()){
                resposta[count][0] = itens[i-1].getValor();
                resposta[count][1] = itens[i-1].getPeso();
                k = k - itens[i-1].getPeso();
                count++;
            }
        }
        
        return resposta;
    }
}
