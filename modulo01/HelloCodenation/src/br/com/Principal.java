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
        Tarefa tarefa2 = new Tarefa("Estudar");
        Tarefa tarefa3 = new Tarefa("Trabalhar");
        tarefas.adicionar(tarefa1);
        tarefas.adicionar(tarefa2);
        tarefas.adicionar(tarefa3);
        tarefas.listar();

    }
}
