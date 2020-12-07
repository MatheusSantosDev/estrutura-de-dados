/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_2;

/**
 *
 * @author Matheus
 */
public class No {

    private int cont;
    private String palavra;
    private No esq;
    private No dir;

    public No(String palavra, No prox, No dir) {
        this.cont = 1;
        this.esq = prox;
        this.dir = dir;
        this.palavra = palavra;
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

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return "No{" + "cont=" + cont + ", palavra=" + palavra + ", esq=" + esq + ", dir=" + dir + '}';
    }

}
