package Trabalho_teste;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author leona
 */
public class LeArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ListaEncadeada lst = new ListaEncadeada();
        lst.CompactaArquivo("descompactado.txt");
        lst.descompactarArq("compactado.txt");
    }
}