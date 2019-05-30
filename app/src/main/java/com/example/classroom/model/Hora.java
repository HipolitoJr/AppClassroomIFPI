package com.example.classroom.model;

public class Hora {
    private Disciplina disciplina;
    private String hora;
    public Hora(Disciplina disciplina, String hora){
        this.disciplina = disciplina;
        this.hora = hora;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
