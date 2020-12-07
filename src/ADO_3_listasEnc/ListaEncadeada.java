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
public class ListaEncadeada {

    private No ini;

    //Criar uma lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }

    //Verifica se a lista está vazia
    public boolean vazia() {
        return this.ini == null;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;

    }

    public void insereInicio(int elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinal(int elemento) {
        No novo = new No(elemento, null);
        No temp = ini;

        //Lista vazia
        if (temp == null) {
            ini = novo;
        } else {
            //Lista 1 ou mais nós
            while (temp.getProx() != null) {
                temp = temp.getProx();
            }
            temp.setProx(novo);
        }
    }

    public boolean buscaLinearIT(int x) {
        No temp = ini;

        while (temp != null) {
            if (temp.getElemento() == x) {
                return true; //achou
            }
            temp = temp.getProx();
        }
        return false; //não achou
    }

    public void removeInicio() {
        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        ini = ini.getProx();
    }

    public void removeFinal() {
        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No temp = ini;
        No anterior = null;

        //Parar no últino nó
        while (temp.getProx() != null) {
            anterior = temp;
            temp = temp.getProx();
        }
        //A lista com somente 1 nó
        if (anterior == null) {
            ini = null; //lista vazia
            return;
        }
        //A lista com 2 ou mais nós e está no último nó
        anterior.setProx(null);
    }

    public void insereIntercalado(ListaEncadeada listaA, ListaEncadeada listaB) {
        No tempA = listaA.ini;
        No tempB = listaB.ini;

        while (tempA != null || tempB != null) {
            if (tempA == null) {// cai da listaA, tem sobras em listaB
                insereFinal(tempB.getElemento());
                tempB = tempB.getProx();

            } else if (tempB == null) {// cai da listaB, tem sobras em listaA
                insereFinal(tempA.getElemento());
                tempA = tempA.getProx();

            } else if (tempA.getElemento() < tempB.getElemento()) {
                insereFinal(tempA.getElemento());
                tempA = tempA.getProx();

            } else {
                insereFinal(tempB.getElemento());
                tempB = tempB.getProx();
            }
        }
    }

    public void insereUniao(ListaEncadeada listaA, ListaEncadeada listaB) {
        No tempA = listaA.ini;
        No tempB = listaB.ini;

        //Copiar todos os elementos do listaA para ListaC
        while (tempA != null) {
            insereFinal(tempA.getElemento());
            tempA = tempA.getProx();
        }

        //Percorrer o listaB e verificar se um elemento NÃO está em listaC
        while (tempB != null) {
            if (!buscaLinearIT(tempB.getElemento())) { //Se não estiver, copia para a listaC
                insereFinal(tempB.getElemento());
            }
            tempB = tempB.getProx();
        }

    }

    public boolean buscaEntreListas(No tempB, No tempA) {//metodo para buscar elementos em listas especificas       

        while (tempB != null) {
            if (tempB.getElemento() == tempA.getElemento()) {
                return true; //achou
            }
            tempB = tempB.getProx();
        }
        return false; //não achou
    }

    public void insereInterseccao(ListaEncadeada listaA, ListaEncadeada listaB) {
        No tempA = listaA.ini;
        No tempB = listaB.ini;

        //Percorrer a listaA e verifica se um elemento de listaA está na listaB
        while (tempA != null) {
            if (buscaEntreListas(tempB, tempA)) { //Se estiver, copia para a listaC                
                insereFinal(tempA.getElemento());
            }
            tempA = tempA.getProx();
        }
    }

    public void inverteNos() {
        No temp = ini;
        No anterior = null;
        No posterior = null;

        while (temp.getProx() != null) {
            posterior = anterior;
            anterior = temp;
            temp = temp.getProx();
            anterior.setProx(posterior);
        }
        ini = temp;
        temp.setProx(anterior);
    }
}
