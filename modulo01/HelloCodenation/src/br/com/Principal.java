package br.com;

import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

public class Principal {
    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionar("Regar as plantas");
        listaTarefas.adicionar("Estudar");
        listaTarefas.adicionar("Trabalhar");

        System.out.println("\nMinhas tarefas");
        System.out.println("------------------");

        listaTarefas.listar();

    }
}
