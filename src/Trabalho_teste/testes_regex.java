/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_teste;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Matheus
 */
public class testes_regex {

    public static boolean checkName(String owner) {
        return owner.matches("^[[A-Za-zÀ-ú]\\s&&[^\\d]]+$"); //metodo para aceitar como true acentos, espaços e letras
    }

    public static boolean aceitarApenasPalavras(String palavra) {
        return palavra.matches("^[^\\W]+$"); //metodo para aceitar como true tudo menos caracteres especiais
    }
    public static boolean aceitarApenasNumerosCaracter(String palavra) {
        return palavra.matches("^[\\d\\W]+$"); //metodo para aceitar como true tudo menos letras e palavas
    }
    
    public static boolean aceitarApenasNumeros(String palavra) {
        return palavra.matches("^[\\d]+$"); //metodo para aceitar como true tudo menos letras e palavas
    }

    public static String separarPalava(String palavraLida) {
        String grupo = " ";
        String[] palavras = null;
        if (palavraLida.matches("^[^\\W]+$")) {
            return palavraLida;
        } else {
            Pattern p = Pattern.compile("[\\W]+");
            Matcher m = p.matcher(palavraLida);
            while (m.find()) {
                grupo = m.group();
                if (grupo.equals(".")) {
                    grupo = "\\.";
                }
                palavras = palavraLida.split(grupo);
                imprimeVetor(palavras);
            }

            return grupo;
        }

    }

    public static void main(String[] args) {
        System.out.println("resposta do checkName: " + checkName("teste"));

        System.out.println(aceitarApenasPalavras("teste"));
        
        System.out.println("resposta do numero caracteres: " +aceitarApenasNumerosCaracter("544,4"));

        
        System.out.println("aceita apenas numeros: "+ aceitarApenasNumeros("044"));
        System.out.println(separarPalava("texto--texto2"));
        //System.out.println(separarPalava("texto"));

        // System.out.println("resposta do achaSimbolos: ");
        // imprimeVetor(Vteste);
    }

    public static void imprimeVetor(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("***" + vetor[i]);
        }
    }
}
