package com.example.classroom.model;

import java.util.ArrayList;
import java.util.List;

public class Mock {
    private List<Disciplina> disciplinas = new ArrayList<>();
    private List<Horario> horarios = new ArrayList<>();
    private Datas datas;
    public Mock(){
        getDisciplinas();
        getHorarios();
        getDatas();
    }

    public List<Disciplina> getDisciplinas() {
        Disciplina tep = new Disciplina("TEP");
        tep.setCargaHoraria(60);
        Professor ely = new Professor("Ely Miranda");
        ely.setMatricula("2541366");
        tep.addProfessor(ely);

        Disciplina eng = new Disciplina("Engen II");
        eng.setCargaHoraria(60);
        Professor hel = new Professor("Helcio");
        hel.setMatricula("258746");
        eng.addProfessor(hel);

        Disciplina engI = new Disciplina("Engen I");
        eng.setCargaHoraria(60);
        eng.addProfessor(hel);

        Disciplina gere = new Disciplina("GEREN");
        gere.setCargaHoraria(60);
        Professor adal = new Professor("Adalton");
        hel.setMatricula("2548746");
        gere.addProfessor(adal);
        this.disciplinas.add(tep);
        this.disciplinas.add(eng);
        this.disciplinas.add(engI);
        this.disciplinas.add(gere);
        return this.disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Horario> getHorarios() {
        Horario adsI = new Horario("ADS I");
        Dia adsiSegu = new Dia("SEGUNDA");
        Hora adsiSeguTreze = new Hora(this.disciplinas.get(1),"13:00");
        Hora adsiSeguQuatorze = new Hora(this.disciplinas.get(1),"14:00");
        Dia adsiQua = new Dia("QUARTA");
        Hora adsiQuar16 = new Hora(this.disciplinas.get(1),"16:00");
        Hora adsiQuar17 = new Hora(this.disciplinas.get(1),"17:00");
        adsiSegu.addHora(adsiSeguTreze);
        adsiSegu.addHora(adsiSeguQuatorze);
        adsiQua.addHora(adsiQuar16);
        adsiQua.addHora(adsiQuar17);
        adsI.addDia(adsiSegu);
        adsI.addDia(adsiQua);
        Horario adsIII = new Horario("ADS III");
        Dia adsIIITerc = new Dia("TERÇA");
        Hora adsIIITerc15 = new Hora(this.disciplinas.get(2),"15:00");
        Hora adsIIITerc16 = new Hora(this.disciplinas.get(2),"16:00");
        Dia adsIIIQui = new Dia("QUINTA");
        Hora adsIIIQui13 = new Hora(this.disciplinas.get(2),"13:00");
        Hora adsIIIQui14 = new Hora(this.disciplinas.get(2),"14:00");
        adsIIITerc.addHora(adsIIITerc15);
        adsIIITerc.addHora(adsIIITerc16);
        adsIIIQui.addHora(adsIIIQui13);
        adsIIIQui.addHora(adsIIIQui14);
        adsIII.addDia(adsIIITerc);
        adsI.addDia(adsIIIQui);
        Horario adsV = new Horario("ADS V");
        Dia adsVSegu = new Dia("SEGUNDA");
        Hora adsVSegu15 = new Hora(this.disciplinas.get(1),"15:00");
        Dia adsVSex = new Dia("QUARTA");
        Hora adsVSex13 = new Hora(this.disciplinas.get(1),"13:00");
        Hora adsVSex14 = new Hora(this.disciplinas.get(1),"14:00");
        Hora adsVSex15 = new Hora(this.disciplinas.get(1),"15:00");
        adsVSegu.addHora(adsVSegu15);
        adsVSex.addHora(adsVSex13);
        adsVSex.addHora(adsVSex14);
        adsVSex.addHora(adsVSex15);
        adsV.addDia(adsVSegu);
        adsV.addDia(adsVSex);
        this.horarios.add(adsI);
        this.horarios.add(adsIII);
        this.horarios.add(adsV);
        return this.horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public Datas getDatas() {
        this.datas = new Datas();
        return this.datas;
    }

    public void setDatas(Datas datas) {
        this.datas = datas;
    }
}
