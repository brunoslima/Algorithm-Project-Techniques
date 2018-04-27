/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.problemas.codificacaohuffman;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class ArvoreHuffman {    
    
    //Atributo
    public static Map<Character,String> mapa = new HashMap<Character,String>();
    
    //Construtor
     /**
     * Este metódo é um construtor da classe ArvoreHuffman.
     */
    public ArvoreHuffman(){

    }
    
    
     /**
     * Este metódo comprime a string de entrada utilizando a codificação de Huffman
     * @return retorna uma string que contém a codificação.
     */
    public static String comprimir(String textoDeEntrada){
        
        if(textoDeEntrada.length() == 0){
            System.out.println("Erro: Texto de entrada tem tamanho zero!");
            return(null);
        }
        
        if(textoDeEntrada == null){
            System.out.println("Erro: Texto de entrada é nulo!");
            return(null);
        }
        
        
        //Colocar mapeamento, formação da arvore, e algoritmo de huffman
        Map<Character,Integer> caracterFrequencia = getCaracterFrequencia(textoDeEntrada);
        No raiz = criarArvore(caracterFrequencia);
        Map<Character,String> caracterCodigo = gerarCodigo(caracterFrequencia.keySet(),raiz);
        mapa = caracterCodigo;
        String codificacao = getCodificacao(caracterCodigo, textoDeEntrada);
        
        return(codificacao);
    }
    
    
    /**
     * Este metódo retorna uma estrutura que contém os caracteres que estão na String de entrada e suas frequências.
     * @param textoDeEntrada string de entrada.
     * @return retorna uma estrutura map com os caracteres e suas respectivas frequências.
     */
    public static Map<Character,Integer> getCaracterFrequencia(String textoDeEntrada){
        
        int valor;
        Map<Character,Integer> mapa = new HashMap<Character,Integer>();
        
        for(int i = 0; i < textoDeEntrada.length(); i++){
            
            //Pegando caracter de uma determinda posição da String
            char caracterAux = textoDeEntrada.charAt(i);
            
            //Verificando se o caracter está presente na estrutura mapa
            if(mapa.containsKey(caracterAux)){ //Se estiver aumenta sua frequencia
                valor = mapa.get(caracterAux);
                mapa.put(caracterAux, ++valor);
            }
            else{ //Se não estiver adiciona normalmente
                mapa.put(caracterAux, 1);
            }
            
        }
     
        return(mapa);
    }
    
    
    /**
     * Este metódo monta a árvoreHuffman.
     * @param mapa estrutura map com os caracteres da string de entrada e suas respectivas frequências,
     * @return retorna o no raiz da árvore que foi montada.
     */
    public static No criarArvore(Map<Character,Integer> mapa){
        
        Queue<No> FilaDeNo = criarFilaDeNo(mapa);
          
        //Montando a árvore, juntando os nós presentes na fila e por fim retornando a raiz da árvore
        while(FilaDeNo.size() > 1){
            
            No aux1 = FilaDeNo.remove();
            No aux2 = FilaDeNo.remove();
            No novo = new No('\0',aux1.getFrequencia() + aux2.getFrequencia(),aux1,aux2);
            FilaDeNo.add(novo);
        }
        
        //Retornando no raiz
        return(FilaDeNo.remove());
    }
    
  
    /**
     * Este metódo cria a fila de nós utilizada para montar a árvoreHuffman.
     * @param mapa estrutura map com os caracteres e suas respectivas frequências.
     * @return Eetorna uma fila de nós.
     */
    public static Queue<No> criarFilaDeNo(Map<Character,Integer> mapa){
        
        //Criando uma fila com prioridade que tem capacidade especificada com um inteiro e ordenação por comparação
        Queue<No> FilaDeNo = new PriorityQueue<No>(11, new NoComparacao());
        
        for(Entry<Character,Integer> entry : mapa.entrySet()){
            FilaDeNo.add(new No(entry.getKey(),entry.getValue(),null,null));
        }
        
        //Retornando a fila com os nós
        return(FilaDeNo);
    }
    
    
    /**
     * Este metódo gera os codigos para cada caracter.
     * @return retorna uma estrutura map com o caracter e seu respectivo codigo.
     */
    public static Map<Character,String> gerarCodigo(Set<Character> caracter, No aux){
        
        Map<Character,String> mapa = new HashMap<Character,String>();
        
        fazerGeracaoDeCodigo(aux,mapa,"");
        
        return(mapa);
    }
    
    
    /**
     * Este metódo realiza o caminhamento (percurso) na árvoreHuffman para obtenção do codigo dos caracteres.
     */
    public static void fazerGeracaoDeCodigo(No aux, Map<Character,String> mapa, String texto){
        
        if(aux.isFolha()){
            
            mapa.put(aux.getCaracter(),texto);
            return;
        }
        
        fazerGeracaoDeCodigo(aux.getEsq(), mapa, texto + '0');
        fazerGeracaoDeCodigo(aux.getDir(), mapa, texto + '1');

    }
    

    /**
     * Este metódo retorna a string com a codificação de Huffman
     * @return retorna uma string que contém a codificação.
     */
    public static String getCodificacao(Map<Character,String> mapa, String texto){
        
        String codificacao = "";
        
        for(int i = 0; i < texto.length(); i++){
            
            codificacao += mapa.get(texto.charAt(i));
        }
        
        return(codificacao);
    }
    
    
}
