package br.puc.ed.lde;

public class MainApp {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada listaDuplamenteEncadeada = new ListaDuplamenteEncadeada();
        listaDuplamenteEncadeada.inserirNoInicio(new Aeroporto("LDB", "Londrina"));
        listaDuplamenteEncadeada.inserirNoFim(new Aeroporto("VCP", "Campinas"));
        listaDuplamenteEncadeada.inserirNoFim(new Aeroporto("BPS", "Porto Seguro"));
        listaDuplamenteEncadeada.imprimirTodos();
        listaDuplamenteEncadeada.inserirNoInicio(new Aeroporto("MGF", "Maringá"));
        listaDuplamenteEncadeada.imprimirTodos();
        listaDuplamenteEncadeada.inserirNoFim(new Aeroporto("SSA", "Salvador"));
        listaDuplamenteEncadeada.imprimirTodos();
    }
}
