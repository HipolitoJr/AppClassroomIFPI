package com.example.classroom.model;

import java.util.ArrayList;
import java.util.List;

public class Horario {
    private String turma;
    private List<Dia> dias = new ArrayList<>();
    public Horario(String turma ){
        this.turma = turma;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }

    public void addDia(Dia dia){
        this.dias.add(dia);
    }
}
