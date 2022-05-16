package com.mycompany.introjunit5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathUtil {

    private MathUtil(){}
    
    /**
     * Calcula o MDC de dois números.
     * @param a
     * @param b
     * @return 
     */
    public static int mdc(int a, int b) {
        // Propriedade 7
        a = Math.abs(a);
        b = Math.abs(b);

        // Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //Propriedade 1
        if (b > 0 && a % b == 0) {
            return b;
        }

        //Propriedade 3
        if (b == 0) {
            return Math.abs(a);
        }
    
        return -1;
    }
    
    /**
     * Verifica se um número é primo.
     * @param numero
     * @return 
     */
    public static boolean isPrimo(final long numero){
        if(numero <= 1){
            return false;
        }

        for(long i = 2; i < numero; i++){
            if(numero%i==0){
                return false;
            }
        }

        return true;
    }
}