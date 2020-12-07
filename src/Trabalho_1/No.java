package Trabalho_1;

/**
 * @author leonardo Alves
 * @author Matheus Santos
 * @author Gabriel Moraes
 */
public class No {

    private String elemento;
    private No prox;

    public No(String elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public String getElemento() {
        return elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setElemento(String elemento) {
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
