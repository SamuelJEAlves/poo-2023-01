package com.github.samueljealves.ufg.poo.t11;

public class Compartimento {

    private Livro[] livros;
    private CD[] cds;

    public Compartimento() {
        this.livros = new Livro[3];
        this.cds = new CD[0];
    }

    public Compartimento(int quantidadeCDs) {
        if (quantidadeCDs == 2 || quantidadeCDs == 4 || quantidadeCDs == 7 || quantidadeCDs > 7) {
            this.livros = new Livro[3];
            this.cds = new CD[quantidadeCDs];
        } else {
            throw new IllegalArgumentException("Quantidade inválida de CDs!");
        }
    }

    public void adicionarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o livro. O compartimento está cheio.");
    }

    public void adicionarCD(CD cd) {
        for (int i = 0; i < cds.length; i++) {
            if (cds[i] == null) {
                cds[i] = cd;
                return;
            }
        }
        System.out.println("Não foi possível adicionar o CD. O compartimento está cheio.");
    }

    public void exibirConteudo() {
        System.out.println("Livros no compartimento:");
        for (Livro livro : livros) {
            if (livro != null) {
                System.out.println(livro.getTitulo());
            }
        }

        System.out.println("CDs no compartimento:");
        for (CD cd : cds) {
            if (cd != null) {
                System.out.println(cd.getTitulo());
            }
        }
    }
}
