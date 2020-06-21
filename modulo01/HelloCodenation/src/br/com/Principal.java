package br.com;

import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        String nome = "Codenation";
        System.out.println("Hello " + nome);
        System.out.println("---------\n");

        System.out.println("Minhas tarefas");
        System.out.println("------------------");
        Tarefa tarefa = new Tarefa("Regar as plantas");
        tarefa.exibirTarefa();
        System.out.println("\nA tarefa tem " + tarefa.obterTamanhoTarefa() + " caracteres.");
    }
}
