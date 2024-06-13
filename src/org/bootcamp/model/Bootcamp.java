package org.bootcamp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bootcamp {
    private final String nome;
    private final String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final List<Mentoria> mentoriasList;
    private final Set<Curso> cursosSet;
    private final Set<Dev> devsSet;

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.mentoriasList = new ArrayList<>();
        this.cursosSet = new HashSet<>();
        this.devsSet = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Mentoria> getMentoriasList() {
        return mentoriasList;
    }

    public void addMentoriasList(Mentoria mentoria) {
        this.mentoriasList.add(mentoria);
    }

    public Set<Curso> getCursosSet() {
        return cursosSet;
    }

    public void addCursosSet(Curso curso) {
        this.cursosSet.add(curso);
    }

    public Set<Dev> getDevsSet() {
        return devsSet;
    }

    public void addDevsSet(Dev dev) {
        this.devsSet.add(dev);
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal +
                ", mentoriasList=" + mentoriasList +
                ", cursosSet=" + cursosSet +
                ", devsSet=" + devsSet +
                '}';
    }

}
