package br.com.estruturas.repeticao;

public class EstruturaRepeticao {

    public void imprimirNumeros(int limite){
        for(int i = 0; i < limite; i++ ){
            System.out.println("O número é " + i);
        }
    }

    public void imprimirNumerosEnquanto(int numero) {
        while(numero < 100){
            System.out.println(numero + " é menor que 100, vamos dobrar!");
            numero *= 2;
        }
        System.out.println(numero + "O número agora é " + numero);
    }

    public void imprimirNumerosDoWhile(int numero) {
        do{
            System.out.println(numero + "O número é " + numero + "menor que 100, vamos dobrar!");
            numero *= 2;
        }while(numero < 100);
        System.out.println(numero + "O número agora é " + numero);
    }
}
