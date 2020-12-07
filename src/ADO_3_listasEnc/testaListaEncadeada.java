/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_3_listasEnc;

/**
 *
 * @author anacris
 * @author Matheus Santos
 */
public class testaListaEncadeada {

    public static void main(String[] args) {
        ListaEncadeada listaA = new ListaEncadeada();
        ListaEncadeada listaB = new ListaEncadeada();
        
        ListaEncadeada listaIntercal = new ListaEncadeada();
        ListaEncadeada listaUniao = new ListaEncadeada();
        ListaEncadeada listaIntersec = new ListaEncadeada();

        listaA.insereFinal(1);
        listaA.insereFinal(3);
        listaA.insereFinal(5);
        listaA.insereFinal(7);
        listaA.insereFinal(9);
        listaA.insereFinal(15);
        listaA.insereFinal(16);

        System.out.println("lista A: " + listaA);

        listaB.insereFinal(2);
        listaB.insereFinal(4);
        listaB.insereFinal(6);
        listaB.insereFinal(8);
        listaB.insereFinal(15);
        listaB.insereFinal(16);

        System.out.println("lista B: " + listaB);

        listaIntercal.insereIntercalado(listaA, listaB);
        listaUniao.insereUniao(listaA, listaB);
        listaIntersec.insereInterseccao(listaA, listaB);

        System.out.println("lista intercalada: " + listaIntercal);
        System.out.println("lista da uniao: " + listaUniao);
        System.out.println("lista da intercecção: " + listaIntersec);

    }
}
