package br.puc.ed.lde;

public class ListaDuplamenteEncadeada {
    private Node inicio;
    private Node fim;
    private Integer tamanho;

    public ListaDuplamenteEncadeada(){
        inicio = new Node(null);
        fim = new Node(null);
        fim.anterior = inicio;
        inicio.proximo = fim;
        tamanho = 0;
    }

    public void inserirNoInicio(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        Node proximoNo = inicio.proximo;
        inicio.proximo = novoNo;
        proximoNo.anterior = novoNo;
        novoNo.anterior = inicio;
        novoNo.proximo = proximoNo;
        tamanho++;
    }

    public void inserirNoFim(Aeroporto aeroporto){
        Node novoNo = new Node(aeroporto);
        Node noAnterior = fim.anterior;
        noAnterior.proximo = novoNo;
        fim.anterior = novoNo;
        novoNo.anterior = noAnterior;
        novoNo.proximo = fim;
        tamanho++;
    }

    public Node excluirNoInicio(){
        Node noExcluido = getInicio();
        Node proximoNo = noExcluido.proximo;
        inicio.proximo = proximoNo;
        proximoNo.anterior = inicio;
        tamanho--;
        return noExcluido;
    }

    public boolean isVazia(){
        return tamanho == 0;
    }

    public void imprimirTodos(){
        Node noAtual = getInicio();
        while (noAtual != fim){
            System.out.print(noAtual + " -> ");
            noAtual = noAtual.proximo;
        }
        System.out.print("\n\n");
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public Node getInicio() {
        if(isVazia()){
            return null;
        }
        return inicio.proximo;
    }

    public Node getFim() {
        if(isVazia()){
            return null;
        }
        return fim.anterior;
    }
}
