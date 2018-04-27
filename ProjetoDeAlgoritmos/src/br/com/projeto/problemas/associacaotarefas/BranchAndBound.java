/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.problemas.associacaotarefas;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class BranchAndBound {

    //Atributos
    private int melhorCusto;
    private int melhorSolucao [];
    private int tamanho;
    private int matrizCusto [][];
    
    //Construtor
    /**
     * Este metódo é um construtor da classe BranchAndBound.
     */
    public BranchAndBound(){
       
    }
    
    //Getters e Setters
    /**
     * Este metódo retorna o melhor custo.
     * @return Retorna um inteiro que representa o melhor custo.
     */
    public int getMelhorCusto(){
        return(this.melhorCusto);
    }
    
    /**
     * Este metódo retorna a melhor solução.
     * @return Retorna um vetor de inteiros com a melhor solução.
     */
    public int [] getMelhorSolucao(){
        return(this.melhorSolucao);
    }
    
    
    /**
     * Este metódo realiza permutações e calculos de custos afim de obter melhor solução.
     * @param vetor vetor de inteiros.
     * @param pos inteiro que representa a posição.
     * @param dim inteiro que representa a dimensão.
     */
    public void permutacao(int vetor [], int pos, int dim){
        
        if(pos == dim) custo(vetor);
        else{
            
            if(custo(vetor, pos) <= this.melhorCusto){
                
                for(int i = pos; i < dim; i++){
                
                    troca(vetor,pos,i);
                    permutacao(vetor, pos+1, dim);
                    troca(vetor,pos,i);
                }
                
            }
            
        }//fim do else
    }
    
    
    /**
     * Este metódo realiza cálculo de custo.
     * @return retorna o custo calculado.
     */
    public int custo(int vetor[]){
        
        int soma = 0;
        
        for(int i = 0; i < vetor.length; i++){
            
            soma += this.matrizCusto[i][vetor[i]];
        }

        
        if(soma < this.melhorCusto){
            this.melhorCusto = soma;
            copia(this.melhorSolucao, vetor);
        }
        
        return(soma);
    }
    

    /**
     * Este metódo realiza cálculo de custo.
     * @return retorna o custo calculado.
     */
    public int custo(int vetor [], int dim){
        
        int soma = 0;
        
        for(int i = 0; i < dim; i++){
            
            soma += this.matrizCusto[i][vetor[i]];
        }
        
        return(soma);
    }
    
    
    /**
     * Este metódo copia elementos de um vetor para o outro.
     * @param vetor1 primeiro vetor.
     * @param vetor2 segundo vetor.
     */
    public void copia(int vetor1 [], int vetor2 []){
        
        for(int i = 0; i < vetor1.length; i++){
            
            vetor1[i] = vetor2[i];
        }
        
    }
    
     /**
     * Este metódo realiza a troca de posições de dois elementos contidos em um vetor.
     * @param vetor vetor com os elementos inteiros.
     * @param i inteiro.
     * @param j inteiro.
     */
    public void troca(int vetor [], int i, int j){
        
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    
    
    /**
     * Este metódo soluciona o problema de associação de tarefas utilizando Branch-And-Bound.
     * @param custos matriz com os custos das tarefas.
     * @return Retorna um inteiro que representa o melhor custo.
     */
    public int branchAndBound(int custos [][]){
        
        this.tamanho = custos.length;
        this.matrizCusto = custos;
        
        int vetor [] = new int[this.tamanho];
        
        for(int i = 0; i < this.tamanho; i++) vetor[i] = i;
        
        this.melhorCusto = custo(vetor);
        this.melhorSolucao = new int[this.tamanho];
        copia(melhorSolucao, vetor);        
        permutacao(vetor, 0, this.tamanho);
     
        return(this.melhorCusto);
    }
    
    
    /**
     * Este metódo retorna uma string com a melhor solução.
     * @return Retorna uma string que mostra a melhor solução.
     */
    public String getConjuntoSolucao(){
        
        String texto = "[";
        
        for(int i = 0; i < this.melhorSolucao.length; i++){
            
            texto += this.matrizCusto[i][this.melhorSolucao[i]] + ", ";
        }
        
        texto += "]";
        
        return(texto);
        
    }
    
    
}
