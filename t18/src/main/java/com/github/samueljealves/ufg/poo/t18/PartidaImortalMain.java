package com.github.samueljealves.ufg.poo.t18;

import java.sql.SQLOutput;
import java.util.List;

public class PartidaImortalMain {
    public static void main(String[] args) {

        Partida partidaImortal = new Partida("Partida Imortal", new Tabuleiro("madeira"));

        Jogador jogador1 = new Jogador("Adolf Anderssen");
        Jogador jogador2 = new Jogador("Lionel Kieseritzky");

        Peca peao1 = new Peao();
        Peca peao2 = new Peao();
        Peca cavalo1 = new Cavalo();
        Peca cavalo2 = new Cavalo();
        Peca bispo1 = new Bispo();
        Peca bispo2 = new Bispo();
        Peca torre1 = new Torre();
        Peca torre2 = new Torre();
        Peca rainha1 = new Rainha();
        Peca rainha2 = new Rainha();
        Peca rei1 = new Rei();
        Peca rei2 = new Rei();

        Posicao origem1 = new Posicao(5, 2);
        Posicao destino1 = new Posicao(5, 4);
        Lance lance1 = new Lance(jogador1, peao1, origem1, destino1, partidaImortal);

        partidaImortal.adicionarLance(lance1);

        Posicao origem2 = new Posicao(4, 7);
        Posicao destino2 = new Posicao(4, 5);
        Lance lance2 = new Lance(jogador2, peao2, origem2, destino2, partidaImortal);

        partidaImortal.adicionarLance(lance2);

        Posicao origem3 = new Posicao(6, 2);
        Posicao destino3 = new Posicao(6, 4);
        Lance lance3 = new Lance(jogador1, peao1, origem3, destino3, partidaImortal);

        partidaImortal.adicionarLance(lance3);

        //Vai adicionando os lances da partida de acordo com essa lógica

        List<Lance> lances = partidaImortal.getLances();

        System.out.println("Descrição da Partida: " + partidaImortal.getDescricao());
        System.out.println("Lances:");

        for (Lance lance : lances) {
            System.out.println("Partida: " + partidaImortal.getDescricao());
            System.out.println("Jogador: " + lance.getJogador().getNome());
            System.out.println("Peça: " + lance.getPeca().getNome());
            System.out.println("Origem: (" + lance.getOrigem().getX() + ", " + lance.getOrigem().getY() + ")");
            System.out.println("Destino: (" + lance.getDestino().getX() + ", " + lance.getDestino().getY() + ")");
        }
    }
}
