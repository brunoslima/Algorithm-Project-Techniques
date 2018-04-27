/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.problemas.codificacaohuffman;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class No {
    
    //Atributos
    private char caracter;
    private int frequencia;
    private No esq;
    private No dir;
    
    //Construtor
    /**
     * Este metódo é um construtor da classe nó.
     * @param caracter caracter.
     * @param frequencia frequência.
     * @param esq nó esquerdo.
     * @param dir nó direito.
     */
    public No(char caracter, int frequencia, No esq, No dir){
        this.caracter = caracter;
        this.frequencia = frequencia;
        this.esq = esq;
        this.dir = dir;
    }

    /**
     * Este metódo é um construtor da classe nó.
     */
    public No(){
        
    }
    
    
    //Getters e Setters
    /**
     * Este metódo retorna o caracter
     * @return retorna um char com o caracter.
     */
    public char getCaracter() {
        return caracter;
    }

    /**
     * Este metódo insere o caracter.
     * @param caracter char que representa o caracter.
     */
    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    /**
     * Este metódo retorna a frequência
     * @return retorna um inteiro com a frequência.
     */
    public int getFrequencia() {
        return frequencia;
    }

    /**
     * Este metódo insere a frequência.
     * @param frequencia inteiro que representa a frequência.
     */
    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    /**
     * Este metódo retorna o nó esquerdo
     * @return retorna um nó.
     */
    public No getEsq() {
        return esq;
    }

    /**
     * Este metódo insere o nó esquerdo
     * @param esq insere o nó.
     */
    public void setEsq(No esq) {
        this.esq = esq;
    }

    /**
     * Este metódo retorna o nó direito.
     * @return retorna um nó.
     */
    public No getDir() {
        return dir;
    }

    /**
     * Este metódo insere o nó direito.
     * @param no insere um nó.
     */
    public void setDir(No dir) {
        this.dir = dir;
    }
    
    
    //Verificando se determinado nó é folha
    /**
     * Este metódo verifica se um nó é folha.
     * @return retorna um boleano que indica se o nó é folha.
     */
    public boolean isFolha(){
        if( (this.getEsq() == null) && (this.getDir() == null) ) return(true);
        else return(false);
    }
    
    
}
