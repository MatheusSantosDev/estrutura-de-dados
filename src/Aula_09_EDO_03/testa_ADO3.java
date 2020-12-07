/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_09_EDO_03;

/**
 *
 * @author anacris
 */
public class testa_ADO3 {
    public static void main(String[] args) {
        System.out.println("Intersecção");
        ListaEncadeada lst1 = new ListaEncadeada();
        lst1.geraListaAleatoria(7);
        System.out.println(lst1);
        ListaEncadeada lst2 = new ListaEncadeada();
        lst2.geraListaAleatoria(8);
        System.out.println(lst2);
        System.out.println(lst1.interseccao2Listas(lst2));
        
        System.out.println("União");
        ListaEncadeada lst3 = new ListaEncadeada();
        lst3.geraListaAleatoria(7);
        System.out.println(lst3);
        ListaEncadeada lst4 = new ListaEncadeada();
        lst4.geraListaAleatoria(4);
        System.out.println(lst4);
        System.out.println(lst3.uniao2Listas(lst4));
        
        System.out.println("Intercalação");
        ListaEncadeada lst5 = new ListaEncadeada();
        lst5.geraListaOrdenada(6);
        System.out.println(lst5);
        ListaEncadeada lst6 = new ListaEncadeada();
        lst6.geraListaOrdenada(4);
        System.out.println(lst6);
        System.out.println(lst5.intercala2Listas(lst6));
    }
}
