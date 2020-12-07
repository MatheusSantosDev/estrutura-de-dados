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
public class No {
    private int elemento;
    private No esq;
    private No dir;

    public No(int elemento, No prox, No dir) {
        this.elemento = elemento;
        this.esq = prox;
        this.dir = dir;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No prox) {
        this.esq = prox;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", esq=" + esq + ", dir=" + dir + '}';
    }
    
    
}
