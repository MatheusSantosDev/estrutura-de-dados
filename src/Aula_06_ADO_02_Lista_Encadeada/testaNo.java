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
public class testaNo {
    public static void main(String[] args) {
        No a = new No(3,null);
        System.out.println(a);
        System.out.println(a.getElemento());
        System.out.println(a.getProx());
        
        No b = new No(5,a);
        System.out.println(b);
        
        No c = new No(7,b);
        System.out.println(c);
    }
}
