package org.bootcamp.model;

import java.util.*;

public class Dev implements IXpPadrao {
    private final String nome;
    private final Set<Conteudo> conteudosInscritosSet;
    private final Set<Conteudo> conteudosRealizadosSet;
    private double xp;

    public Dev(String nome) {
        this.nome = nome;
        this.conteudosInscritosSet = new LinkedHashSet<>();
        this.conteudosRealizadosSet = new LinkedHashSet<>();
        this.xp = XP_PADRAO;
    }

    public void inscreverBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.conteudosInscritosSet.addAll(bootcamp.getCursosSet());
        bootcamp.addDevsSet(dev);
    }

    public void progredirCurso(Conteudo conteudo) {
        this.conteudosRealizadosSet.add(conteudo);
        this.conteudosInscritosSet.remove(conteudo);
    }

    public String getNome() {
        return nome;
    }

    public double getXp() {
        return xp;
    }

    public void exibirConteudos() {
        System.out.println(conteudosRealizadosSet); //fazer validaacao if !set.isEmpty()
    }

    public void CalcularTotalXp(Conteudo atividade) {
        this.xp += atividade.calcularXp();
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritosSet=" + conteudosInscritosSet +
                ", conteudosRealizadosSet=" + conteudosRealizadosSet +
                ", xp=" + xp +
                '}';
    }
}
