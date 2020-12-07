/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_ADO_02_Lista_Encadeada;

/**
 *
 * @author anacris
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lst = new ListaEncadeada();
        System.out.println(lst);
        System.out.println(lst.vazia());
        lst.insereInicio(3);
        lst.insereInicio(5);
        lst.insereInicio(7);
        System.out.println(lst);
        lst.insereFinal(1);
        lst.insereFinalR(8);
        System.out.println(lst);
        
    }
}
