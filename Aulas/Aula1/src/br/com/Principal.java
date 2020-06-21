package br.com;

import br.com.variaveis.Primitivos;

public class Principal {
    public static void main(String[] args) {
        String texto = "Meu texto aqui \n";
        System.out.println(texto);

        Primitivos primitivos = new Primitivos();
        long longo = primitivos.longo;
        System.out.println(primitivos.longo + "\n");
        System.out.println(longo);
    }
}
