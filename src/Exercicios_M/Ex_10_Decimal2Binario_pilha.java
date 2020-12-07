/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_M;

import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_10_Decimal2Binario_pilha {

    public static void main(String[] args) throws Exception {

        //  int n = leInteiroPositivo();
        //  System.out.println(decimal2BinarioR(n));
        //  System.out.println(decimalBinarioPilha(n));
        System.out.println(invertePalavras("ESTE EXERCÍCIO É MUITO FÁCIL. "));

    }

    public static String invertePalavras(String texto) throws Exception {
        String textoInvertido = null;

        Pilha p = new Pilha();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ' && texto.charAt(i) != '.') {
                p.push(texto.charAt(i));
            } else {
                while (!p.vazia()) {
                    char c =(char) p.pop();
                    String x = Character.toString(c);
                    textoInvertido = textoInvertido + x + " ";
                }
            }
        }
        return textoInvertido;
    }

    public static String decimalBinarioPilha(int decimal) throws Exception {
        String binario = "";
        Pilha p = new Pilha();
        while (decimal > 0) {
            int resto = decimal % 2;
            p.push(resto);
            decimal /= 2;
        }

        while (!p.vazia()) {
            binario += p.pop();
        }
        return binario;
    }

    private static int decimal2Binario(int decimal) {
        int binario = 0;
        int cont = 0;

        while (decimal > 0) {
            int resto = decimal % 2;
            binario = binario + resto * (int) Math.pow(10, cont);
            decimal = decimal / 2; //atualização
            cont++; //atualização
        }

        return binario;
    }

    private static int decimal2BinarioR(int decimal) {

        if (decimal < 2) {
            return decimal;
        }

        return (10 * decimal2BinarioR(decimal / 2)) + (decimal % 2);

    }
}
