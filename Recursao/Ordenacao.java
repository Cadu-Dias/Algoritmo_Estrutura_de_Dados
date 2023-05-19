import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.util.Date;

public class Ordenacao {

    static void geraVetor (int[] v) {
        Random random = new Random();
        for (int i=0; i < v.length; i++) 
            v[i] = random.nextInt(10*v.length);
    }

    static void exibeVetor (String msg, int[] v) {
        System.out.println("\n" + msg);
        for (int i=0; i<v.length; i++) 
            System.out.print (v[i] + " ");
        System.out.println();
    }

    static void bubbleSort(int[] v) {
        for (int i=1; i < v.length; i++) {
            for (int j=0; j < v.length - i; j++) {
                if (v[j] > v[j+1]) {
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    //r: ultima posição do vetor
    public static int partition(int v[], int p, int r) {
        int pivo = v[r];
        int i = p-1;
        for(int j=p; j<r; j++) {
            if(v[j] < pivo) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }
        i++;
        int aux = v[i];
        v[i] = v[r];
        v[r] = aux;
        return i;
    }
    //static é utilizado para a classe 
    public static void quick(int v[], int p, int r) {
        System.out.printf("\np = %d, r = %d",p, r);
        if(p < r) {
            int q = partition(v, p, r);
            quick(v, p, q-1);
            quick(v, q+1, r);
            System.out.printf("\nq = %d", q);
        }
    }


    public static void main (String[] args) {
        int v[], n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print ("\ndigite o tamanho do vetor: ");
            n = scanner.nextInt();
            if (n > 0) {
               v = new int[n];
            //    geraVetor(v);
            // //    exibeVetor("Vetor 1 gerado", v);
            //    long ini = new Date().getTime();
            //    bubbleSort(v);
            //    long fim = new Date().getTime();
            // //    exibeVetor("Vetor 1 ordenado bubble", v);
            //    System.out.printf("Bubble demorou %d ms", fim-ini);

               geraVetor(v);
            //    exibeVetor("Vetor 2 gerado", v);
               long ini = new Date().getTime();
               quick(v, 0, v.length-1);
               long fim = new Date().getTime();
            //    exibeVetor("\nVetor 2 Ordenado quick", v);
               System.out.printf("\nQuick demorou %d ms", fim-ini);
               
            //    ini = new Date().getTime();
            //    quick(v, 0, v.length-1);
            //    fim = new Date().getTime();
            //    System.out.printf("\nQuick Segunda vez demorou %d ms", fim-ini);
            }
        } while (n>0);
        scanner.close();
    }
}