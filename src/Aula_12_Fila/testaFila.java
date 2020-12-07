/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_Fila;

/**
 *
 * @author anacris
 */
public class testaFila {
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        
        q.enqueue(7);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(8);
        
        System.out.println(q);
        
        System.out.println(q.size());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        
        System.out.println(q.size());
    }
}
