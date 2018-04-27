
package br.com.projeto.problemas.subsequenciacomummaxima;


/**
 *
 * @author BRUNO SANTOS DE LIMA
 * @author LEANDRO UNGARI CAYRES
 */
public class CLS {

    //Atributos
    private String palavra01;
    private String palavra02;
    private int tamanho;

    //Construtor
    /**
     * Este metódo é um construtor da classe CLS.
     * @param palavra01 String que representa a primeira palavra.
     * @param palavra02 String que representa a segunda palavra.
     */
    public CLS(String palavra01, String palavra02) {
        this.palavra01 = palavra01;
        this.palavra02 = palavra02;
    }

    //Getters e Setters
    /**
     * Este metódo retorna a palavra 1.
     * @return String palavra 1.
     */
    public String getPalavra01() {
        return palavra01;
    }

    /**
     * Este metódo retorna a palavra 2.
     * @return String palavra 2.
     */
    public String getPalavra02() {
        return palavra02;
    }

    public void setPalavra01(String palavra01) {
        this.palavra01 = palavra01;
    }

    public void setPalavra02(String palavra02) {
        this.palavra02 = palavra02;
    }
    
    
    /**
     * Este metódo encontra a sequência mais longa.
     * @return Retorna uma String que representa a sequência mais longa.
     */
    public String processingCLS(){
        
        int[][] tabela = new int[palavra01.length()+1][palavra02.length()+1];
        int i, j;
        
        for(i = 0; i <= palavra01.length(); i++){
            
            for(j = 0; j <= palavra02.length(); j++){
                
                if(i == 0 || j == 0) tabela[i][j] = 0;
                else if(palavra01.charAt(i-1) == palavra02.charAt(j-1)) tabela[i][j] = tabela[i-1][j-1] + 1;
                else tabela[i][j] = Integer.max(tabela[i-1][j], tabela[i][j-1]);
            }
        }
        
        tamanho = tabela[palavra01.length()][palavra02.length()];
        
        i = palavra01.length();
        j = palavra02.length();
        String s = "";
        while(i > 0 && j > 0){
            
            if(palavra01.charAt(i-1) == palavra02.charAt(j-1)){
                s = palavra01.charAt(i-1) + s;
                i--; j--;
            }
            else if(tabela[i-1][j] < tabela[i][j-1]) j--;
            else i--;
        }
        
        return s;
    }
    
    
    /**
     * Esté metódo retorna o tamanho
     * @return inteiro que representa o tamanho.
     */
    public int getTamanho(){
        return tamanho;
    }
    
}
