package com.example.classroom.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private List<Professor> professores = new ArrayList<>();
    public Disciplina(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }
}
