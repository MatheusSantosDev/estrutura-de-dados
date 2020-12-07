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
public class ABB {
    private No raiz;
    
    //Cria uma ABB
    public ABB(){
        this.raiz = null;
    }
    
    //Verificar se a árvore
    public boolean vazia(){
        return this.raiz == null;
    }

    @Override
    public String toString() {
        return "ABB{" + "raiz=" + raiz + '}';
    }
    
    public void insere(int elemento){
        No pai = null;
        No p = raiz;
        No novo = new No(elemento,null,null);
        
        while(p !=null){
            pai = p;
            if (elemento < p.getElemento())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        if (vazia()){
            raiz = novo;
            return;
        }
        if (elemento < pai.getElemento())
            pai.setEsq(novo);
        else
            pai.setDir(novo);
    }
    
    public void insereR(int elemento){
        if(vazia()){
            raiz = new No(elemento,null,null);
            return;
        }
        No novo = new No(elemento,null,null);
        insereR(raiz,novo);
    }
    public void insereR(No p, No novo){
        if (novo.getElemento() < p.getElemento())
            if(p.getEsq() == null) 
                p.setEsq(novo);
            else
                insereR(p.getEsq(), novo);
        else
            if(p.getDir() == null) 
                p.setDir(novo);
            else
                insereR(p.getDir(), novo);
    }
    
    public void preOrdem(){
        preOrdem(raiz);
    }
    public void preOrdem(No p){
        if( p != null){
            System.out.print(p.getElemento() + " ");
            preOrdem(p.getEsq());
            preOrdem(p.getDir());
        }
    }
    public void inOrdem(){
        inOrdem(raiz);
    }
    public void inOrdem(No p){
        if (p != null){
            inOrdem(p.getEsq());
            System.out.print(p.getElemento() + " ");
            inOrdem(p.getDir());
        }
    }
    
    public void posOrdem(){
        posOrdem(raiz);
    }
    public void posOrdem(No p){
        if (p != null){
            posOrdem(p.getEsq());
            posOrdem(p.getDir());
            System.out.print(p.getElemento() + " ");
        }
    }
    
    public No buscaIt(int elemento){
        No p = raiz;
        
        while (p!= null){
            if (elemento == p.getElemento())
                return p; //Achou
  
            if (elemento < p.getElemento())
                p = p.getEsq();
            else
                p = p.getDir();
        }
        return null; //NAO achou
    }
    
    public No buscaR(int elemento){
        return buscaR(elemento, raiz);
    }
    public No buscaR(int elemento, No p){
        if (p == null)
            return null; //NAO achou
        
        if (elemento == p.getElemento())
            return p; //Achou
        
        if (elemento < p.getElemento())
            return buscaR(elemento,p.getEsq());
        else
            return buscaR(elemento, p.getDir());
    }
    
    public No maiorIt(){
        No p = raiz;
        
        while (p.getDir() != null){
            p = p.getDir();
        }
        return p;
    }
    
    public No maior(){
        return maior(raiz);
    }
    public No maior(No p){
        if(p == null)
            return null;
        
        if(p.getDir() == null)
            return p;
        
        return maior(p.getDir());
    }
    public No menor(){
        return menor(raiz);
    }
    public No menor(No p){
        if(p == null)
            return null;
        
        if(p.getEsq() == null)
            return p;
        
        return menor(p.getEsq());
    }
    
    //Método que remove um nó na ABB
    public No remove(int elemento){
        return remove(raiz,elemento);
    }
    public No remove(No p, int elemento){
        if (p==null)
            return null; //Não achei
        
        if (elemento<p.getElemento())
            p.setEsq(remove(p.getEsq(),elemento));
        else if (elemento>p.getElemento())
            p.setDir(remove(p.getDir(),elemento));
        else {
             //elemento==p.getElemento()
             //Verifica se o elemento será removido tem subárvore esquerda
             if (p.getEsq()!=null){
                //busca o maior na subárvore esquerda
                No aux = maior(p.getEsq());
                //Copia o elemento maior da subarv esq para p
                p.setElemento(aux.getElemento());
                //Remove elemento copiado recursivamente
                p.setEsq(remove(p.getEsq(),aux.getElemento()));
              }
             //Verifica se o elemento será removido tem subárvore direita
               else if (p.getDir()!=null){
                //busca o menor na subárvore direita
                No aux = menor(p.getDir());
                //Copia o elemento menor da subarv dir para p
                p.setElemento(aux.getElemento());
                //Remove elemento copiado recursivamente
                p.setDir(remove(p.getDir(),aux.getElemento()));
                }
               else 
                   //Verifica se é folha
                   return null;
            }
            return p;
        };
    
    public int contaNos(){
        return contaNos(raiz);
    }
    public int contaNos(No p){
        if(p == null)
            return 0;
        
        return 1 + contaNos(p.getEsq()) + contaNos(p.getDir());
    }
    
    public int altura(){
        return altura(raiz);
    }
    public int altura(No p){
        if(p == null)
            return -1; //Árvore vazia
        
        int esq = altura(p.getEsq());
        int dir = altura(p.getDir());
        
        if (esq > dir)
            return esq + 1;
        return dir + 1;
        
    }
    
    public void inOrdemFolhas(){
        inOrdemFolhas(raiz);
    }
    public void inOrdemFolhas(No p){
        if (p != null){
            inOrdemFolhas(p.getEsq());
            
            if (p.getEsq()==null && p.getDir()==null) //Nó folha
                System.out.print(p.getElemento() + " ");
            
            inOrdemFolhas(p.getDir());
        }
    }
    
    public No sucessor(int elemento){
        No p = buscaIt(elemento);
        if (p == null){
            return null;
        }
        if (p.getDir() != null)
            //busca o menor na subárvore direita
            return menor(p.getDir());
        
        return ancestralDireita(p);
    }
    public No ancestralDireita(No p){
        No pai = null;
        No temp = raiz;
        
        while(temp.getElemento() != p.getElemento()){
            if(p.getElemento() < temp.getElemento()){
                pai = temp;
                temp = temp.getEsq();
            } else {
                temp = temp.getDir();
            }
        }
        return pai;
    }
    
    public No antecessor(int elemento){
        No p = buscaIt(elemento);
        if (p == null){
            return null;
        }
        if (p.getEsq() != null)
            //busca o maior na subárvore esquerda
            return maior(p.getEsq());
        
        return ancestralEsquerda(p);
    }
    public No ancestralEsquerda(No p){
        No pai = null;
        No temp = raiz;
        
        while(temp.getElemento() != p.getElemento()){
            if(p.getElemento() < temp.getElemento()){
                temp = temp.getEsq();
            } else {
                pai = temp;
                temp = temp.getDir();
            }
        }
        return pai;
    }
}
