package br.com.metodos;

public class Calculadora {

    public int soma(int n1, int n2) { return n1 + n2; }

    public int subtrai(int n1, int n2) { return n1 - n2; }

    public int multiplicador(int n1, int n2) { return n1 * n2; }

    public int divide(int n1, int n2) { return n1 / n2; }

    public int resto(int n1, int n2) { return n1 % n2; }

    public void incremento (int n1) { n1*=10; }

    public void decremento (int n1) {
        n1--;
        --n1;
        n1-=2;
    }
}
