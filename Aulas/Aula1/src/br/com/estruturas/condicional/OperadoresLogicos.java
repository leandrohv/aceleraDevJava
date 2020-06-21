package br.com.estruturas.condicional;

public class OperadoresLogicos {

    public OperadoresLogicos(){}

    public void validarTexto(String texto){
        if(texto == null) {
            System.out.println("O texto está vazio");
        }
        if(texto != null) {
            System.out.println("O texto não está vazio");
        }
    }

    public void testarNumeros(int n1, int n2) {
        if(n1 == n2){
            System.out.println("Os números são iguais");
        } else if (n1 < n2) {
            System.out.println(n1 + " é menor que " + n2);
        } else if(n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        }
    }

    public boolean estaAptoHabilitacaoD(String categoria, int idade) {
        return (categoria.equals("B") || categoria.equals("AB")) && idade >= 25;
    }
}
