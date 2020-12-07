/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho_teste;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author leona
 */
public class ListaEncadeada {

    @Override
    public String toString() {
        return "ListaEncadeada{" + "ini=" + ini + '}';
    }

    private No ini;

    public ListaEncadeada() {
        this.ini = null;
    }

    public void insereInicio(String elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    public void insereFinalR(String elemento) {
        insereFinalR(ini, elemento);
    }

    public void insereFinalR(No temp, String elemento) {
        //Lista vazia
        if (temp == null) {
            No novo = new No(elemento, null);
            ini = novo;
            return;
        }
        //Último nó
        if (temp.getProx() == null) {
            No novo = new No(elemento, null);
            temp.setProx(novo);
            return;
        }
        insereFinalR(temp.getProx(), elemento);

    }

    public boolean buscaLinearR(String x) {
        return buscaLinearR(ini, x);
    }

    public boolean buscaLinearR(No temp, String x) {
        if (temp == null) {
            return false; //não achou
        }
        if (temp.getElemento().equals(x)) {
            return true; //achou
        }
        return buscaLinearR(temp.getProx(), x);

    }

    public int buscaLinearR2(String x) {
        return buscaLinearR2(ini, x, 1);
    }

    public int buscaLinearR2(No temp, String x, int i) {
        if (temp == null || temp.getElemento().equals(x)) {
            return i;
        }

        return buscaLinearR2(temp.getProx(), x, i + 1);

    }

    public void removeOrdenado(String elemento) {

        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        No temp = ini;
        No anterior = null;

        //Busca na lista
        while (temp != null && !temp.getElemento().equals(elemento)) {
            anterior = temp;
            temp = temp.getProx();
        }
        //Remove no início para 1 ou mais nós
        if (anterior == null) {
            ini = ini.getProx();
            return;
        }
        //Remove entre 2 nós e a remoção no final
        if (temp != null && temp.getElemento().equals(elemento)) {
            anterior.setProx(temp.getProx());
            return;
        }
        System.out.println(elemento + " NÃO está na lista");

    }

    public boolean vazia() {
        return this.ini == null;
    }

    public void removeFinalR2() {
        removeFinalR2(ini);
    }

    public void removeFinalR2(No temp) {
        if (vazia()) {
            System.out.println("Lista vazia");
            return;
        }
        //A lista com somente 1 nó
        if (temp.getProx() == null) {
            ini = null; //lista vazia
            return;
        }
        //A lista com 2 ou mais nós e está no penúltimo nó
        if (temp.getProx().getProx() == null) {
            temp.setProx(null);
            return;
        }
        removeFinalR2(temp.getProx());
    }

    public void CompactaArquivo(String descompactado) throws FileNotFoundException, IOException {

        try {

            BufferedReader r = new BufferedReader(new FileReader(descompactado));

            FileWriter arq = new FileWriter("compactado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            String linha = " ";
            String vLinha[] = null;

            ListaEncadeada lst = new ListaEncadeada();

            while (!linha.equals("0")) {

                linha = r.readLine();

                vLinha = linha.split(" ");

                for (String v : vLinha) {
                    // System.out.println("string v:" + v);
                    if (v.matches("[\\W]+")) {
                        gravarArq.print(v + " ");
                    }

                    if (v.matches("^[^\\W]+$")) {

                        if (!lst.buscaLinearR(v)) {

                            lst.insereInicio(v);

                            gravarArq.print(v + " ");
                        } else {

                            gravarArq.print(lst.buscaLinearR2(v) + " ");
                            lst.removeOrdenado(v);
                            lst.insereInicio(v);
                        }
                    } else {
                        Pattern p = Pattern.compile("[\\W]+");
                        Matcher m = p.matcher(v);
                        String character = " ";
                        String palavras[] = null;
                        while (m.find()) {
                            character = m.group();
                            if (character.equals(".")) {
                                character = "\\.";
                            }
                            palavras = v.split(character);

                        }
                        for (String palavra : palavras) {
                            if (character.equals("\\.")) {
                                character = ".";
                            }
                            if (!lst.buscaLinearR(palavra)) {
                                lst.insereInicio(palavra);
                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(palavra + character);
                                    character = "";
                                } else {
                                    gravarArq.print(palavra + character + " ");
                                    character = "";
                                }
                            } else {
                                if (character.equals("\\.")) {
                                    character = ".";
                                }
                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(lst.buscaLinearR2(palavra) + character);
                                    character = "";
                                } else {
                                    gravarArq.print(lst.buscaLinearR2(palavra) + character + " ");
                                    character = "";
                                }
                                lst.removeOrdenado(palavra);
                                lst.insereInicio(palavra);
                            }
                        }
                    }
                }
                gravarArq.println("");
            }
            r.close();
            arq.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }

    }

    public void descompactarArq(String arq) throws FileNotFoundException, IOException {
        try {
            FileWriter r2 = new FileWriter("des.txt");
            PrintWriter gravarArq = new PrintWriter(r2);

            BufferedReader r = new BufferedReader(new FileReader(arq));
            ListaEncadeada lst = new ListaEncadeada();
            String vLinha[];
            String linha = " ";

            while (!linha.equals("0 ")) {

                linha = r.readLine();

                vLinha = linha.split(" ");

                for (String v : vLinha) {
                    // System.out.println("string v:" + v);
                    if (v.matches("[\\W]+")) {
                        gravarArq.print(v + " ");
                    }

                    if (v.matches("^[^\\W]+$")) {
                        if (v.matches("^[\\d]+$")) {
                            gravarArq.print(lst.buscaLinearIT(Integer.parseInt(v)) + " ");
                            lst.removeOrdenado(lst.buscaLinearIT(Integer.parseInt(v)));
                            lst.insereInicio(lst.buscaLinearIT(Integer.parseInt(v)));

                        } else if (!lst.buscaLinearR(v)) {

                            lst.insereInicio(v);

                            gravarArq.print(v + " ");
                        } else {

                            gravarArq.print(lst.buscaLinearR2(v) + " ");
                            lst.removeOrdenado(v);
                            lst.insereInicio(v);
                        }
                    } else {
                        Pattern p = Pattern.compile("[\\W]+");
                        Matcher m = p.matcher(v);
                        String character = " ";
                        String palavras[] = null;
                        while (m.find()) {
                            character = m.group();
                            if (character.equals(".")) {
                                character = "\\.";
                            }
                            palavras = v.split(character);

                        }
                        for (String palavra : palavras) {
                            // System.out.println(palavra);
                            if (character.equals("\\.")) {
                                character = ".";
                            }
                            if (palavra.matches("^[\\d]+$")) {
                                gravarArq.print(lst.buscaLinearIT(Integer.parseInt(palavra)) + character + " ");
                                lst.insereInicio(lst.buscaLinearIT(Integer.parseInt(palavra)));
                                lst.removeOrdenado(lst.buscaLinearIT(Integer.parseInt(palavra)));
                                character = "";
                            } else {
                                if (!lst.buscaLinearR(palavra)) {
                                    lst.insereInicio(palavra);
                                    if (character.equals("'") || character.equals("--")) {
                                        gravarArq.print(palavra + character);
                                        character = "";
                                    } else {
                                        gravarArq.print(palavra + character + " ");
                                        character = "";
                                    }
                                } else {
                                    if (character.equals("\\.")) {
                                        character = ".";
                                    }
                                    if (character.equals("'") || character.equals("--")) {

                                        gravarArq.print(lst.buscaLinearR2(palavra) + character);
                                        character = "";

                                    } else {

                                        gravarArq.print(lst.buscaLinearR2(palavra) + character + " ");
                                        character = "";

                                    }

                                    lst.removeOrdenado(palavra);
                                    lst.insereInicio(palavra);

                                }
                            }

                        }
                    }
                }
                gravarArq.println("");
                System.out.println(lst);
            }

            /*while (linhaArq != null) {
                linhaArq = r.readLine();

                if (linhaArq == null) {
                    break;
                }

                vPalvras = linhaArq.split(" ");
                for (String v : vPalvras) {

                    if (lst.vazia() || v.matches("[a-zA-Z]+")) {
                        gravarArq.print(v + " ");
                        lst.insereInicio(v);

                    } else if (v.matches("[^0-9]+")) {
                        //caracters juntos de virgulas e etc..
                        char letras[] = v.toCharArray();

                        for (int i = 0; i < letras.length; i++) {
                            if (String.valueOf(letras[i]).matches("[,\\.-/--]")) {
                                String caracter = String.valueOf(letras[i]);
                                letras[i] = Character.MIN_VALUE;
                                if (letras != null) {
                                    lst.insereInicio(String.valueOf(letras));
                                    gravarArq.print(String.valueOf(letras));
                                    gravarArq.print(caracter + " ");
                                }

                            }
                        }

                    } else {

                        if (v.matches("[a-zA-Z0-9-.,']+")) {
                            char verifica[] = v.toCharArray();
                            for (int i = 0; i < verifica.length; i++) {
                                if (String.valueOf(verifica[i]).matches("[^a-zA-Z0-9]+")) {
                                    String caracter = String.valueOf(verifica[i]);
                                    gravarArq.print(caracter + " ");
                                    verifica[i] = Character.MIN_VALUE;

                                }
                            }

                            Pattern p = Pattern.compile("[0-9]+");
                            Matcher m = p.matcher(String.valueOf(verifica));
                            String numero = " ";
                            String palavras[] = null;

                            while (m.find()) {
                                numero = m.group();
                                palavras = String.valueOf(verifica).split(numero);
                            }

                            for (int j = 0; j < palavras.length; j++) {
                                if (palavras[j] != null) {
                                    // System.out.println(palavras[j]);
                                    lst.insereInicio(palavras[j]);
                                    gravarArq.print(palavras[j]);
                                }
                            }
                            if (numero.matches("[0-9]+")) {
                                int num = Integer.parseInt(numero);
                                System.out.println(num);
                                String t = lst.buscaLinearIT(num);
                                System.out.println(t);
                                gravarArq.print(t + " ");
                                lst.removeOrdenado(t);
                                lst.insereInicio(t);
                            }
                        }

                    }
                    
                }
                gravarArq.println("");
            }
             */
            r2.close();
            r.close();
            //  System.out.println(lst);

        } catch (Exception e) {
            System.exit(-1);
        }
    }

    public String buscaLinearIT(int x) {
        No temp = ini;
        int i = 1;
        while (temp != null) {
            if (i == x) {
                String t = temp.getElemento();
                return t;
            }
            i++;
            temp = temp.getProx();
        }
        return null;

    }
}
