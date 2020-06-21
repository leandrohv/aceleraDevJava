package br.com.tarefas;

public class Tarefa {
    String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void exibirTarefa(){
     System.out.print("Tarefa: " + this.descricao + "\n");
    }

    public int obterTamanhoTarefa(){
        return this.descricao.length();
    }
}
