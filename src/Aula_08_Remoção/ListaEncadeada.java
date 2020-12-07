/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Remoção;

import Aula_07_Inserção_Busca.*;
import Aula_06_ADO_02_Lista_Encadeada.*;

/**
 *
 * @author anacris
 */
public class ListaEncadeada {
    private No ini;
    
    //Criar uma lista vazia
    public ListaEncadeada(){
        this.ini=null;
    }
    
    //Verifica se a lista está vazia
    public boolean vazia(){
        return this.ini == null;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;
        
        while (temp != null){
            strLista = strLista + temp.getElemento() + " ";
            temp = temp.getProx();
        }
        return strLista;
                
    }
    
    public void insereInicio(int elemento){
        No novo = new No(elemento, ini);
        ini = novo;
    }
    
    public void insereFinal(int elemento){
        No novo = new No(elemento, null);
        No temp = ini;
        
        //Lista vazia
        if(temp == null){
            ini = novo;
        }
        else {
            //Lista 1 ou mais nós
            while (temp.getProx() != null){
                temp = temp.getProx(); 
            }
            temp.setProx(novo);
        }
    }
     public void insereFinalR(int elemento){
         insereFinalR(ini, elemento);
     }
    public void insereFinalR(No temp, int elemento){
        //Lista vazia
        if(temp == null){
            No novo = new No(elemento, null);
            ini = novo;
            return;
        }
        //Último nó
        if(temp.getProx() == null){ 
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        insereFinalR(temp.getProx(),elemento);
  
    }
    public void insereOrdenado(int elemento){
        No novo = new No(elemento, ini);
        No temp = ini;
        No anterior = null;
        
        while (temp != null && temp.getElemento() < novo.getElemento()){
            anterior = temp;
            temp = temp.getProx();
        }
        //Lista vazia ou inserção no início
        if (anterior == null){
            ini = novo;
        } else {
            //Inserção entre 2 nós ou inserção no final
            novo.setProx(temp);
            anterior.setProx(novo);
        }
    }   
        public void insereOrdenadoR(int elemento){
            insereOrdenadoR(null, ini, elemento);
        }
        public void insereOrdenadoR(No anterior, No temp, int elemento){
             
            //Lista vazia
            if (temp == null && anterior == null){
                No novo = new No(elemento, ini);
                ini = novo;
                return;
            }
            //Inserção no início
            if (anterior == null && temp.getElemento() > elemento){
                No novo = new No(elemento, ini);
                ini = novo;
                return;
            }
            //Inserção no final
            if (temp == null && anterior.getProx() == null){
                No novo = new No(elemento, null);
                anterior.setProx(novo);
                return;
            }
            //Inserção entre 2 nós
            if(anterior != null && temp.getElemento() > elemento){
                No novo = new No(elemento, ini);
                novo.setProx(temp);
                anterior.setProx(novo);
                return;
            }
            insereOrdenadoR(temp,temp.getProx(),elemento);
            
        }  
        public boolean buscaLinearIT(int x){
            No temp = ini;
            
            while (temp != null){
                if (temp.getElemento() == x)
                    return true; //achou
                temp = temp.getProx();
            }
            return false; //não achou
        }
        public boolean buscaLinearR(int x){
            return buscaLinearR(ini, x);
        }
        public boolean buscaLinearR(No temp, int x){
            if(temp == null)
                return false; //não achou
            
            if (temp.getElemento() == x)
                return true; //achou
            
            return buscaLinearR(temp.getProx(), x);
                
        }
        public No buscaLinearIT2(int x){
            No temp = ini;
            
            while (temp != null){
                if (temp.getElemento() == x)
                    return temp; //achou
                temp = temp.getProx();
            }
            return null; //não achou
        }
        public No buscaLinearR2(int x){
            return buscaLinearR2(ini, x);
        }
        public No buscaLinearR2(No temp, int x){
            if(temp == null || temp.getElemento() == x)
                return temp;
            
            return buscaLinearR2(temp.getProx(), x);
                
        }
        
        public void removeInicio(){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            ini = ini.getProx();
        }
        
        public void removeFinal(){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            No temp = ini;
            No anterior = null;
            
            //Parar no últino nó
            while (temp.getProx() != null){
                anterior = temp;
                temp = temp.getProx();
            }
            //A lista com somente 1 nó
            if(anterior == null){
                ini = null; //lista vazia
                return;
            }
            //A lista com 2 ou mais nós e está no último nó
            anterior.setProx(null);
        }
        
        public void removeFinalR(){
            removeFinalR(null, ini);
        }
        
        public void removeFinalR(No anterior, No temp){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            //A lista com somente 1 nó
            if(anterior == null && temp.getProx() == null){
                ini = null; //lista vazia
                return;
            }
            //A lista com 2 ou mais nós e está no último nó
            if(temp.getProx() == null){
                anterior.setProx(null);
                return;
            }
            removeFinalR(temp,temp.getProx());
        }
        public void removeFinal2(){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            No temp = ini;
            
            //Parar no penúltino nó
            while (temp.getProx().getProx() != null){
                temp = temp.getProx();
            }
            //A lista com somente 1 nó
            if(temp.getProx() == null){
                ini = null; //lista vazia
                return;
            }
            //A lista com 2 ou mais nós e está no último nó
            temp.setProx(null);
        }
        
        public void removeFinalR2(){
            removeFinalR2(ini);
        }
        
        public void removeFinalR2(No temp){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            //A lista com somente 1 nó
            if(temp.getProx() == null){
                ini = null; //lista vazia
                return;
            }
            //A lista com 2 ou mais nós e está no penúltimo nó
            if(temp.getProx().getProx() == null){
                temp.setProx(null);
                return;
            }
            removeFinalR2(temp.getProx());
        }
        
        public void removeOrdenado(int elemento){
            if (vazia()){
                System.out.println("Lista vazia");
                return;
            }
            No temp = ini;
            No anterior = null;
            
            //Busca na lista
            while (temp != null && temp.getElemento() != elemento){
                anterior = temp;
                temp = temp.getProx();
            }
            //Remove no início para 1 ou mais nós
            if(anterior == null){
                ini = ini.getProx();
                return;
            }
            //Remove entre 2 nós e a remoção no final
            if(temp != null && temp.getElemento() == elemento){
                anterior.setProx(temp.getProx());
                return;
            }
            System.out.println(elemento + " NÃO está na lista");
            
        }
        
        public int contaNos(){
            No temp = ini; //inicialização
            int cont=0;
            
            while(temp != null){ //condição
                cont++;
                temp = temp.getProx(); //atualização
            }
            return cont++;
            
        } 
        public int contaNos2(){
            int cont=0;
            
            for(No temp = ini;temp != null;temp = temp.getProx()){
                cont++;  
            }
            return cont++;
        }   
        
        public No menorNo(){
            No temp = ini;
            No menor = temp;
            
            while(temp != null){
                if(temp.getElemento() < menor.getElemento()){
                    menor = temp;
                }
                temp = temp.getProx();   
            }
            return menor;
        }
}
