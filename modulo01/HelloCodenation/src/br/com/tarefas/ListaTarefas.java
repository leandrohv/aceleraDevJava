package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }

    public void remover(int posicao){
        this.tarefas.remove(posicao);
    }

    public void listar(){
        for(Tarefa tarefa : this.tarefas) {
            tarefa.exibirTarefa();
        }
    }
}
