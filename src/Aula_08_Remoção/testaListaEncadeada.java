/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remoção;

import Aula_07_Inserção_Busca.*;
import Aula_06_ADO_02_Lista_Encadeada.*;

/**
 *
 * @author anacris
 */
public class testaListaEncadeada {
    public static void main(String[] args) {
        ListaEncadeada lst = new ListaEncadeada();
        System.out.println(lst);
        System.out.println(lst.vazia());
        lst.insereInicio(7);
        lst.insereInicio(5);
        lst.insereInicio(3);
        System.out.println(lst);
        lst.insereFinal(12);
        lst.insereFinalR(20);
        System.out.println(lst);
        //lst.insereOrdenado(1); //inserção no início
        //lst.insereOrdenado(9); //inserção entre 2 nós
        //lst.insereOrdenado(26);//inserção no final
        //System.out.println(lst);
        lst.insereOrdenadoR(1); //inserção no início
        lst.insereOrdenadoR(9); //inserção entre 2 nós
        lst.insereOrdenadoR(26);//inserção no final
        System.out.println(lst);
        System.out.println(lst.buscaLinearIT(12));
        System.out.println(lst.buscaLinearIT(8));
        System.out.println(lst.buscaLinearR(12));
        System.out.println(lst.buscaLinearR(8));
        System.out.println(lst.buscaLinearIT2(12));
        System.out.println(lst.buscaLinearIT2(8));
        System.out.println(lst.buscaLinearR2(12));
        System.out.println(lst.buscaLinearR2(8));
        System.out.println(lst);
        lst.removeInicio();
        System.out.println(lst);
        lst.removeOrdenado(3); //remove do início
        System.out.println(lst);
        lst.removeOrdenado(12);//remove entre 2 nós
        System.out.println(lst);
        lst.removeOrdenado(26);//remove no final
        System.out.println(lst);
        lst.removeOrdenado(18);//elemento não está na lista
        System.out.println(lst);
        lst.insereInicio(15);
        lst.insereInicio(24);
        lst.insereInicio(18);
        lst.insereFinal(1);
        System.out.println(lst);
        System.out.println(lst.contaNos2());
        System.out.println(lst.menorNo());
        System.out.println(lst.menorNo().getElemento());
        
    }
}
