package Trabalho_1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author leonardo Alves
 * @author Matheus Santos
 * @author Gabriel Moraes
 */
public class TestaListaEncadeada {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ListaEncadeada lst = new ListaEncadeada();        
        lst.CompactaArquivo("texto.txt");
        lst.descompactarArqV2("compactado.txt");

    }
}
