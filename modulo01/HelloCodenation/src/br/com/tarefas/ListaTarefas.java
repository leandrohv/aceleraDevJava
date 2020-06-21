package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {

    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionar(Tarefa tarefa){
        if(tarefa.descricao != null && tarefa.descricao.length() <= 20) {
            this.tarefas.add(tarefa);
        }else {
            System.out.println("Tarefa inválida");
        }
    }

    public void remover(int posicao){
        if(posicao < this.tarefas.size()){
            this.tarefas.remove(posicao);
            System.out.println("A tarefa foi removida com sucesso!");
        } else {
            System.out.println("A tarefa não existe!");
        }
//        try {
//
//        } catch (Exception e) {
//            System.out.println("Não foi possível remover a tarefa");
//        }
    }

    public Tarefa buscar(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if(descricao.equals(tarefa.descricao)){
                return tarefa;
            }
        }
        System.out.println("Tarefa não encontrada!");
        return null;
    }

    public void listar(){
        for(Tarefa tarefa : this.tarefas) {
            tarefa.exibirTarefa();
        }
    }
}
