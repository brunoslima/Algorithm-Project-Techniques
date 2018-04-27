/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.problemas.multiplicacaocadeiamatrizes;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class ChainMultiplication {

    //Atributos
    public int matrizM [][];
    public int matrizS [][];
    private String solucaoOtima;
    
    //Construtor
    /**
     * Este metódo é um construtor da classe ChainMultiplication.
     */
    public ChainMultiplication(int dim){
        
        this.matrizM = new int[dim][dim];
        this.matrizS = new int[dim][dim];
        this.solucaoOtima = "";
    }

    
    //Getters e Setters
    
    /**
     * Este metódo retorna a solução otima.
     * @return retorna a solução otima.
     */
    public String getSolucaoOtima() {
        return solucaoOtima;
    }
    
    /**
     * Este metódo insere parte da solução ótima.
     * @param solucaoOtima string que representa uma parte da solução ótima.
     */
    public void setSolucaoOtima(String solucaoOtima) {
        this.solucaoOtima += solucaoOtima;
    }
    
    
    /**
     * Este metódo é responsavél por as melhores soluções e amazena-las nas matrizes do objeto retornado.
     * @param p vetor com as dimenssões das matrizes de entrada.
     * @return um objeto do tipo Chain já processado
     */
    public ChainMultiplication matrizChainOrder(int p[]){
        
        ChainMultiplication chain = new ChainMultiplication(p.length);
        
        int n = (p.length - 1);
        int i, j, k, l, q;
        i = j = k = l = q = 0;
        
        //Zerando a diagonal principal da matrizM
        for(i = 0; i < n; i++) chain.matrizM[i][i] = 0;
        
        for(l = 1; l < n; l++){
            
            for(i = 0; i < (n-l); i++){
                
                j = i + l;
                chain.matrizM[i][j] = Integer.MAX_VALUE; //Recebe infinito
                
                //Calculando os valores e adicionando o melhor na matrizM e o valor de k na matrizS.
                for(k = i; k < j; k++){
                    
                    q = chain.matrizM[i][k] + chain.matrizM[k+1][j] + p[i]*p[k+1]*p[j+1]; 
                    if(q < chain.matrizM[i][j]){
                        
                        chain.matrizM[i][j] = q;
                        chain.matrizS[i][j] = k+1;
                    }
                }
            }
        }
 
        for(int b = 0; b < chain.matrizM.length; b++){
            
            System.out.println("\n");
            
            for(int c = 0; c < chain.matrizM[b].length; c++){
                
                System.out.print("  " + chain.matrizM[b][c]);
            }
        }
        
        System.out.println("\n");
        
        for(int b = 0; b < chain.matrizS.length; b++){
            
            System.out.println("\n");
            
            for(int c = 0; c < chain.matrizS[b].length; c++){
                
                System.out.print("  " + chain.matrizS[b][c]);
            }
        }
        
        return(chain);
    }
    
    
    /**
     * Este metódo é responsável por guardar a melhor ordem de multiplicação.
     * @param matrizS matriz com representação da solução.
     * @param i inteiro.
     * @param j inteiro.
     * @param chain objeto do tipo ChainMultiplication.
     */
    public void printOptimalParens(int matrizS[][], int i , int j, ChainMultiplication chain){
        
        if(i == j) chain.setSolucaoOtima("A[" + i + "]");
        else{
            chain.setSolucaoOtima("(");
            printOptimalParens(matrizS, i, matrizS[i][j] - 1, chain);
            printOptimalParens(matrizS, matrizS[i][j], j, chain);
            chain.setSolucaoOtima(")");
        }
        
    }
       
}
