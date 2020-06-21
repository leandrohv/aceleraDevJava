package br.com;

import br.com.estruturas.repeticao.EstruturaRepeticao;
import br.com.variaveis.Primitivos;

public class Principal {
    public static void main(String[] args) {
        String texto = "Meu texto aqui \n";
        System.out.println(texto);

        Primitivos primitivos = new Primitivos();
        long longo = primitivos.longo;
        System.out.println(primitivos.longo + "\n");
        System.out.println(longo);

        System.out.println("Minhas tarefas");
        System.out.println("------------------");

        System.out.println("Regar as plantas");
        System.out.println("Estudar");
        System.out.println("Trabalhar");

        EstruturaRepeticao r = new EstruturaRepeticao();
        r.imprimirNumeros(10);
        r.imprimirNumerosEnquanto(10);
        r.imprimirNumerosDoWhile(10);
    }
}
