/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11_Pilha;

import Aula_05_Recursao.*;
import static Aula_01_Vetores.Ex_04_Inverter.leInteiroPositivo;
import Aula_10_Pilha.Pilha;

/**
 *
 * @author anacris
 */
public class Ex_3_Decimal2Binario {
    public static void main(String[] args) throws Exception {

        int n = leInteiroPositivo();
        System.out.println(decimal2BinarioPilha(n));
    }
    private static String decimal2BinarioPilha(int decimal) throws Exception {
      String binario = "";
      Pilha p = new Pilha();
      
      while (decimal > 0){
          int resto = decimal % 2;
          p.push(resto);
          decimal = decimal/2; //atualização
      }
      while (!p.vazia()){
          binario = binario + p.pop();
      }
      return binario;
    }

    private static int decimal2Binario(int decimal) {
      int binario = 0;
      int cont = 0;
      
      while (decimal > 0){
          int resto = decimal % 2;
          binario = binario + resto * (int) Math.pow(10, cont);
          decimal = decimal/2; //atualização
          cont++; //atualização
      }
      
      return binario;
    }
    
    private static int decimal2BinarioR(int decimal) {
        
      if (decimal < 2)
          return decimal;
      
      return (10 * decimal2BinarioR(decimal/2)) + (decimal%2);
      
    }
}
