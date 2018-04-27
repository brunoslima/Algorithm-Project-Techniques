/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.problemas.codificacaohuffman;

import java.util.Comparator;

/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class NoComparacao implements Comparator<No>{

    //Comparar a frequência entre dois nós
    /**
     * Este metódo compara a frequência entre dois nós.
     */
    @Override
    public int compare(No aux1, No aux2){
        return( aux1.getFrequencia() - aux2.getFrequencia() );
    }
    
}
