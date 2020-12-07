/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Matheus
 */
public class TestaFreqPalavra {

    public static void main(String[] args) {
        FreqPalavra tree = carregarDadosArquivo("texto.txt");
        System.out.println(tree);
        tree.inOrdem();       
    }

    public static FreqPalavra carregarDadosArquivo(String arqTexto) {
        FreqPalavra f = new FreqPalavra();
        try {
            BufferedReader r = new BufferedReader(new FileReader(arqTexto));

            String vtexto[];

            String linhaArqTexto = " ";

            while (linhaArqTexto != null) {

                linhaArqTexto = r.readLine();

                if (linhaArqTexto == null) {
                    break;
                }

                vtexto = linhaArqTexto.split(" ");

                for (int i = 0; i < vtexto.length; i++) {
                    if (vtexto[i].matches("^[a-zA-Zá-ùÁ-Ù]+$")) { // caso seja só palavra ou só número                         
                        f.insereR(vtexto[i]);

                    } else {
                        Pattern p = Pattern.compile("[\\.\\,\\?\\!]");//quando sao apenas caracteres e captura a primeira ocorrencia.
                        Matcher m = p.matcher(vtexto[i]);
                        String character = " ";
                        String palavras[] = null;
                        while (m.find()) {
                            character = m.group();
                            if (character.equals(".")) {
                                character = "\\.";
                            }
                            if (character.equals("?")) {
                                character = "\\?";
                            }
                            palavras = vtexto[i].split(character);
                            
                            for (String palavra : palavras) {
                                f.insereR(palavra);
                            }
                        }

                    }
                    
                }

            }
            r.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
        return f;

    }

}
