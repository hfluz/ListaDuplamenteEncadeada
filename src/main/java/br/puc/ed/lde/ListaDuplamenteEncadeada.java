package br.puc.ed.lde;

public class ListaDuplamenteEncadeada {
    private Node inicio;
    private Node fim;
    private Integer tamanho;

    public void inserirNoInicio(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            fim = novoNo;
        }
        novoNo.proximo = inicio;
        inicio = novoNo;
        tamanho++;
    }

    public void inserirNoFim(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        if(isVazia()){
            inicio = novoNo;
        }
        fim.proximo = novoNo;
        fim = novoNo;
        tamanho++;
    }

    public Node excluirNoInicio(){
        Node noExcluido = inicio;
        inicio = inicio.proximo;
        tamanho--;
        return noExcluido;
    }

    public boolean isVazia(){
        return inicio == null;
    }

    public void imprimirTodos(){
        Node noAtual = inicio;
        while (noAtual != null){
            System.out.print(noAtual + " -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Node getInicio() {
        return inicio;
    }

    public Node getFim() {
        return fim;
    }
}
