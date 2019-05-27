package com.example.classroom.model;

import java.util.ArrayList;
import java.util.List;

public class Dia {
    private String nome;
    List<Hora> horas = new ArrayList<>();
    public Dia(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Hora> getHoras() {
        return horas;
    }

    public void setHoras(List<Hora> horas) {
        this.horas = horas;
    }
    public void addHora(Hora hora){
        this.horas.add(hora);
    }
}
