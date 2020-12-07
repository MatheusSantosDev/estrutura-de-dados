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
public class Batata_Quente {
    public static void main(String[] args) throws Exception {
        Fila q = new Fila();
        
        q.enqueue("Leo");
        q.enqueue("Marcelo");
        q.enqueue("Dayana");
        q.enqueue("Pedro");
        q.enqueue("Castro");
        q.enqueue("Bia");
        q.enqueue("Moraes");
        q.enqueue("Matheus");
        System.out.println(q);
        Object vencedor = batataQuente(q,4);
        System.out.println("O vencedor é: " + vencedor);
    }
    
    public static Object batataQuente( Fila q, int k) throws Exception{
        
        while (q.size() > 1){
            for (int i=0; i<k; i++){
                Object item = q.dequeue();
                q.enqueue(item);
            }
            System.out.println("Saindo: " +q.dequeue());
        }
        return q.dequeue();
    }
}
