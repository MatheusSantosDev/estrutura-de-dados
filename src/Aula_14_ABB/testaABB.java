/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_14_ABB;

/**
 *
 * @author anacris
 */
public class testaABB {
    public static void main(String[] args) {
        ABB tree = new ABB();
        
        tree.insere(7);
        tree.insere(2);
        tree.insere(5);
        tree.insere(9);
        tree.insereR(3);
        tree.insereR(8);
        tree.insereR(10);
        System.out.println(tree);
        System.out.print("\nPré-Ordem: ");
        tree.preOrdem();
        System.out.print("\nIn-Ordem: ");
        tree.inOrdem();
        System.out.print("\nPós-Ordem: ");
        tree.posOrdem();
        
        int num = 15;
        No resp = tree.buscaIt(num);
        if(resp != null){
            System.out.printf("\n%d está na árvore",resp.getElemento() );
        }
        else {
            System.out.printf("\n%d NAO está na árvore",num);
        }
        
        num = 3;
        resp = tree.buscaR(num);
        if(resp != null){
            System.out.printf("\n%d está na árvore",resp.getElemento() );
        }
        else {
            System.out.printf("\n%d NAO está na árvore",num);
        }
        
        System.out.println("\nO maior elemento = " + tree.maiorIt().getElemento());
        System.out.println("O menor elemento = " + tree.menor().getElemento());
    
        System.out.println("Removendo o nó 7: " + tree.remove(7));
        System.out.print("\nIn-Ordem: ");
        tree.inOrdem();
    }
    
}
