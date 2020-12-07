/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO_3_listasEnc;

import Aula_06_ADO_02_Lista_Encadeada.*;

/**
 *
 * @author anacris
 */
public class No {
    private int elemento;
    private No prox;

    public No(int elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public int getElemento() {
        return elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", prox=" + prox + '}';
    }
    
    
}
