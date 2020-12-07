/*
 Escreva o algoritmo que recebe um vetor A de tamanho n contendo inteiros e 
encontra o par de elementos distintos a e b do vetor que fazem com que a 
diferença a-b seja a maior possível. A função deve ter deve ter complexidade
O(n), ou seja, o tamanho do vetor V[].
 */
package Exercicios_M;

/**
 *
 * @author Matheus Santos
 */
public class NewClass {

    public static int[] vDif(int v[]) {
        int[] v2 = new int[]{2};
        int menor = v[0], maior = v[0];
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] < v[i + 1]) {
                menor = v[i];
                maior = v[i + 1];
            } else {
                menor = v[i + 1];
                maior = v[i];
            }
        }
        v2[0] = menor;
        v2[1] = maior;
        return v2;
    }
}
