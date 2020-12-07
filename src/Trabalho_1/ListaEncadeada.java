package Trabalho_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leonardo Alves
 * @author Matheus Santos
 * @author Gabriel Moraes
 */
public class ListaEncadeada {

    private No ini;

    public ListaEncadeada() {
        this.ini = null;
    }

    public void insereInicio(String elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
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

    public void CompactaArquivo(String original) throws FileNotFoundException, IOException {

        try {

            BufferedReader r = new BufferedReader(new FileReader(original));

            FileWriter arq = new FileWriter("compactado.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            String linha = " ";
            String vLinha[] = null;

            ListaEncadeada lst = new ListaEncadeada();

            while (!linha.equals("0")) {

                linha = r.readLine();

                vLinha = linha.split(" ");

                for (int i = 0; i < vLinha.length; i++) {

                    if (linha.equals("")) {
                        break;
                    }

                    if (vLinha[i].matches("[\\W]+")) {//for somente um caracter

                        gravarArq.print(vLinha[i]);
                        if (i != vLinha.length - 1) {
                            gravarArq.print(" ");
                        }
                    }
                    if (vLinha[i].matches("^[^\\W]+$")) {// caso seja só palavra ou só número 

                        if (!lst.buscaLinearR(vLinha[i])) {

                            lst.insereInicio(vLinha[i]);

                            gravarArq.print(vLinha[i]);
                            if (i != vLinha.length - 1) {
                                gravarArq.print(" ");
                            }

                        } else {

                            gravarArq.print(lst.buscaLinearR2(vLinha[i]));
                            if (i != vLinha.length - 1) {
                                gravarArq.print(" ");
                            }

                            lst.removeOrdenado(vLinha[i]);
                            lst.insereInicio(vLinha[i]);

                        }
                    } else {

                        Pattern p = Pattern.compile("[\\W]+");//quando sao apenas caracteres e captura a primeira ocorrencia.
                        Matcher m = p.matcher(vLinha[i]);
                        String character = " ";
                        String palavras[] = null;
                        while (m.find()) {
                            character = m.group();
                            if (character.equals(".")) {
                                character = "\\.";
                            }
                            if (character.equals("?")) {
                                character = "\\?";
                            }
                            palavras = vLinha[i].split(character);

                        }
                        for (String palavra : palavras) {

                            if (character.equals("\\.")) {
                                character = ".";
                            }
                            if (character.equals("\\?")) {
                                character = "?";
                            }
                            if (!lst.buscaLinearR(palavra)) {

                                lst.insereInicio(palavra);

                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(palavra + character);
                                    character = "";
                                } else {
                                    gravarArq.print(palavra + character);
                                    if (i != vLinha.length - 1) {
                                        gravarArq.print(" ");
                                    }
                                    character = "";
                                }
                            } else {
                                if (character.equals("\\.")) {
                                    character = ".";
                                }
                                if (character.equals("\\?")) {
                                    character = "?";
                                }
                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(lst.buscaLinearR2(palavra) + character);
                                    character = "";
                                } else {
                                    gravarArq.print(lst.buscaLinearR2(palavra) + character);
                                    if (i != vLinha.length - 1) {
                                        gravarArq.print(" ");
                                    }
                                    character = "";
                                }
                                lst.removeOrdenado(palavra);
                                lst.insereInicio(palavra);
                            }
                        }
                    }

                }
                if (!linha.equals("0")) {
                    gravarArq.println("");
                }
            }

            arq.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
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

    public void descompactarArqV2(String compactado) throws FileNotFoundException, IOException {

        try {

            BufferedReader r = new BufferedReader(new FileReader(compactado));

            PrintWriter gravarArq = new PrintWriter("descompactado.txt");

            String linha = " ";
            String vLinha[] = null;

            ListaEncadeada lst = new ListaEncadeada();

            while (!linha.equals("0")) {

                linha = r.readLine();

                vLinha = linha.split(" ");

                for (int i = 0; i < vLinha.length; i++) {

                    if (linha.equals("")) { // caso tiver linha vazia
                        break;
                    }

                    if (vLinha[i].matches("^[^\\W]+$")) { // caso seja só palavra ou só número 

                        if (!lst.buscaLinearR(vLinha[i]) && vLinha[i].matches("[^0-9]+")) { // se for só palavra e não estiver na lista

                            gravarArq.print(vLinha[i]);
                            lst.insereInicio(vLinha[i]);

                            if (i != vLinha.length - 1) {
                                gravarArq.print(" ");
                            }

                        } else if (vLinha[i].matches("[0-9]+") && !vLinha[i].equals("0")) { //se for só número

                            String palavra1 = lst.buscaLinearIT(Integer.parseInt(vLinha[i]));
                            gravarArq.print(palavra1);

                            lst.removeOrdenado(palavra1);
                            lst.insereInicio(palavra1);

                            if (i != vLinha.length - 1) {
                                gravarArq.print(" ");
                            }

                        } else { // se estiver na lista e for palavra 

                            gravarArq.print(vLinha[i]);

                            if (i != vLinha.length - 1) {
                                gravarArq.print(" ");
                            }
                        }
                    } else if (vLinha[i].matches("[\\W]+")) { // grava direto se for só caractere
                        gravarArq.print(vLinha[i]);
                        if (i != vLinha.length - 1) {
                            gravarArq.print(" ");
                        }

                    } else { // palavra com número ou com caractere

                        Pattern p = Pattern.compile("[\\W]+");
                        Matcher m = p.matcher(vLinha[i]);

                        String character = " ";
                        String palavras[] = null;

                        while (m.find()) {
                            character = m.group();
                            if (character.equals(".")) {
                                character = "\\.";
                            }
                            if (character.equals("?")) {
                                character = "\\?";
                            }
                            
                            palavras = vLinha[i].split(character);

                        }
                        for (String palavra : palavras) {

                            if (character.equals("\\.")) {
                                character = ".";
                            }
                            if (character.equals("\\?")) {
                                character = "?";
                            }
                            if (!lst.buscaLinearR(palavra) && palavra.matches("[^0-9]+")) { // se não estver na lista e for palavra

                                lst.insereInicio(palavra);

                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(palavra + character);
                                    character = "";
                                } else {
                                    gravarArq.print(palavra + character);
                                    if (i != vLinha.length - 1) {
                                        gravarArq.print(" ");
                                    }
                                    character = "";
                                }
                            } else { // se for só número

                                String palavra1 = lst.buscaLinearIT(Integer.parseInt(palavra));

                                if (character.equals("'") || character.equals("--")) {
                                    gravarArq.print(palavra1 + character);
                                    character = "";
                                } else {
                                    gravarArq.print(palavra1 + character);
                                    if (i != vLinha.length - 1) {
                                        gravarArq.print(" ");
                                    }
                                }

                                lst.removeOrdenado(palavra1);
                                lst.insereInicio(palavra1);
                            }
                        }
                    }

                }
                if (!linha.equals("0")) { // insere uma linha nova
                    gravarArq.println("");
                }
            }
            gravarArq.flush();
            r.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
