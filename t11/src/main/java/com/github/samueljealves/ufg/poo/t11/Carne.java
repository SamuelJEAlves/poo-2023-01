package com.github.samueljealves.ufg.poo.t11;
import java.util.ArrayList;
import java.util.List;

public class Carne {

    private String compra;
    private List<Produto> produtos;
    private List<Prestacao> prestacoes;

    public Carne(String compra) {
        this.compra = compra;
        this.produtos = new ArrayList<Produto>();
        this.prestacoes = new ArrayList<Prestacao>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }

    public void exibirCarne() {
        System.out.println("Compra: " + compra);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getQuantidade() + "x " + produto.getNome());
        }
        System.out.println("Prestações:");
        for (Prestacao prestacao : prestacoes) {
            System.out.println("- Valor: R$" + prestacao.getValor() + ", Data Limite: " + prestacao.getDataLimite());
        }
    }
}
