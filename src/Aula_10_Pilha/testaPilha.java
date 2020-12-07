/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_10_Pilha;

/**
 *
 * @author anacris
 */
public class testaPilha {
    public static void main(String[] args) throws Exception {
        /*
        Pilha_Vetor p = new Pilha_Vetor(10);
        p.push(8);
        p.push(3);
        p.push(5);
        System.out.println(p.size());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.size());   
*/
        Pilha p = new Pilha();
        p.push(8);
        p.push(3);
        p.push(5);
        System.out.println(p.size());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.pop());
        System.out.println(p.size());   
    }
}
