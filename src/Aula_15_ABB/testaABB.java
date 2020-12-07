/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_15_ABB;

import Aula_14_ABB.*;

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
    
        //System.out.println("Removendo o nó 7: " + tree.remove(7));
        System.out.print("\nIn-Ordem: ");
        tree.inOrdem();
        
        System.out.println("\nO número de nós da árvore = " + tree.contaNos());
        System.out.println("\nA altura da árvore = " + tree.altura());
        
        System.out.print("\nIn-OrdemFolha: ");
        tree.inOrdemFolhas();
        
        num = 7;
        No res = tree.sucessor(num);
        if (res != null)
            System.out.printf("\nO sucessor(%d) = %d", num,res.getElemento());
        else
            System.out.printf("\nO sucessor(%d) = não tem", num);
        
        ABB tree2 = new ABB();
        
        tree2.insere(8);
        tree2.insere(3);
        tree2.insere(13);
        tree2.insere(7);
        tree2.insereR(10);
        tree2.insereR(14);
        tree2.insereR(1);
        tree2.insereR(4);
        tree2.insereR(5);
        tree2.insereR(12);
        
        System.out.print("\nIn-Ordem: ");
        tree2.inOrdem();
        
        num = 4;
        res = tree2.antecessor(num);
        if (res != null)
            System.out.printf("\nO antecessor(%d) = %d", num,res.getElemento());
        else
            System.out.printf("\nO antecessor(%d) = não tem", num);
    }
    
}
