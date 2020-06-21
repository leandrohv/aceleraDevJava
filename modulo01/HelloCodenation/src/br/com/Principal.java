package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
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

        System.out.println("\nMinhas lista tarefas");
        System.out.println("------------------");

        ListaTarefas listaTarefas = new ListaTarefas();

        Tarefa tarefa4 = new Tarefa("Regar as plantas");
        Tarefa tarefa5 = new Tarefa("Estudar 2");
        Tarefa tarefa6 = new Tarefa("Trabalhar 3");

        listaTarefas.adicionar(tarefa4);
        listaTarefas.adicionar(tarefa5);
        listaTarefas.adicionar(tarefa6);

        listaTarefas.listar();

        listaTarefas.remover(1);

        System.out.println("\nMinhas tarefas após remover");
        System.out.println("------------------");

        listaTarefas.listar();

        System.out.println("\nBuscar tarefa");
        System.out.println("------------------");
        listaTarefas.buscar("Trabalhar 3");
        listaTarefas.listar();


    }
}
