package br.puc.ed.lde;

public class Node {
    protected Aeroporto aeroporto;
    protected Node anterior;
    protected Node proximo;

    public Node(Aeroporto aeroporto){
        proximo = null;
        this.aeroporto = aeroporto;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "(" + aeroporto.getCodigo() + ", " + aeroporto.getNomeCidade() + ") ";
    }
}
