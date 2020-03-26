/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02.ex05;

/**
 *
 * @author ana
 */
public class MergeSort {

    int[] vetor;
    int[] vetor2;

    public void mergeSort(int[] vetor, int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    public void merge(int[] vetor, int inicio, int meio, int fim) {
        int i, j, k;
        int[] vet = new int[vetor.length];
        for (i = 0; i < meio; i++) {
            vet[i] = vetor[i];
        }

        for (j = meio; j < fim; j++) {
            vet[fim + meio + 1 - j] = vetor[j];
        }
        i = inicio;
        j = fim;

        for (k = inicio; k < fim; k++) {
            if (vet[i] <= vet[j]) {
                vetor[k] = vetor[i];
                i += 1;
            } else {
                vetor[k] = vetor[j];
                j += 1;
            }
        }
    }
}
