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
public class FreqPalavra {

    private No raiz;

    //Cria uma FreqPalavra(Arvore)
    public FreqPalavra() {
        this.raiz = null;
    }

    public boolean vazia() {
        return this.raiz == null;
    }

    public void insereR(String palavra) {
        if (vazia()) {
            raiz = new No(palavra, null, null);
            return;
        }
        No novo = new No(palavra, null, null);
        insereR(raiz, novo);
    }

    public void insereR(No p, No novo) {
        if (novo.getPalavra().compareToIgnoreCase(p.getPalavra()) < 0) {
            if (p.getEsq() == null) {
                p.setEsq(novo);
            } else {
                insereR(p.getEsq(), novo);
            }
        } else if (novo.getPalavra().compareToIgnoreCase(p.getPalavra()) > 0) {
            if (p.getDir() == null) {
                p.setDir(novo);
            } else {
                insereR(p.getDir(), novo);
            }
        } else {
            p.setCont(p.getCont() + 1);
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
    }

    public void inOrdem(No p) {
        if (p != null) {
            inOrdem(p.getEsq());
            System.out.print("\n" + p.getPalavra() + " ");
            System.out.print("" + p.getCont() + " ");
            inOrdem(p.getDir());
        }
    }

    @Override
    public String toString() {
        return "FreqPalavra{" + "raiz=" + raiz + '}';
    }
}
