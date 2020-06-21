package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {
        String nome = "Codenation";
        System.out.println("Hello " + nome);
        System.out.println("---------\n");

        System.out.println("Minhas tarefas");
        System.out.println("------------------");

        ArrayTarefas tarefas = new ArrayTarefas(3);
        Tarefa tarefa1 = new Tarefa("Regar as plantas");
        tarefa1.exibirTarefa();
        Tarefa tarefa2 = new Tarefa("Estudar");
        tarefa2.exibirTarefa();
        Tarefa tarefa3 = new Tarefa("Trabalhar");
        tarefa3.exibirTarefa();

    }
}
