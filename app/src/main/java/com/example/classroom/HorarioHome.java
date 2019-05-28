package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.classroom.model.Dia;
import com.example.classroom.model.Disciplina;
import com.example.classroom.model.Hora;
import com.example.classroom.model.Horario;
import com.example.classroom.model.Professor;

public class HorarioHome extends AppCompatActivity {
    private Button btSeg1, btSeg2,btSeg3,btSeg4,btSeg5, btTer1, btTer2,btTer3,btTer4,btTer5, btQua1,btQua2,btQua3,btQua4,btQua5,btQui1,btQui2,btQui3,btQui4,btQui5,btSex1,btSex2,btSex3,btSex4,btSex5;
    public Horario horario;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_home);
        Intent intent = getIntent();
        String[] turmas = new String[] {"ADS I", "ADS III", "ADS V"};
        String item = intent.getStringExtra("item");
        //int item = Integer.parseInt(id);
        title = (TextView)findViewById(R.id.txt_title_home);
        title.setText(item);
        btSeg1 = (Button)findViewById(R.id.bt_seg_1);
        btSeg2 = (Button)findViewById(R.id.bt_seg_2);
        btSeg3 = (Button)findViewById(R.id.bt_seg_3);
        btSeg4 = (Button)findViewById(R.id.bt_seg_4);
        btSeg5 = (Button)findViewById(R.id.bt_seg_5);

        btQua1 = (Button)findViewById(R.id.bt_qua_1);
        btQua2 = (Button)findViewById(R.id.bt_qua_2);
        btQua3 = (Button)findViewById(R.id.bt_qua_3);

        btQui2 = (Button)findViewById(R.id.bt_qua_2);
        btQui3 = (Button)findViewById(R.id.bt_qua_2);

        btSex1 = (Button)findViewById(R.id.bt_sex_1);
        btSex2 = (Button)findViewById(R.id.bt_sex_2);
        btSex3 = (Button)findViewById(R.id.bt_sex_3);
        btSex4 = (Button)findViewById(R.id.bt_sex_4);
        btSex5 = (Button)findViewById(R.id.bt_sex_5);


        Professor helcio = new Professor("Helcio");
        Professor ely = new Professor("Ely Miranda");
        Professor fernando = new Professor("Fernando Santana");
        Professor adalton = new Professor("Adalton Sena");
        Disciplina eng = new Disciplina("Eng II");
        eng.addProfessor(helcio);
        Disciplina tep = new Disciplina("TEP");
        tep.addProfessor(ely);
        Disciplina geren = new Disciplina("Gere Pro");
        geren.addProfessor(adalton);
        Disciplina tcc = new Disciplina("TCC I");
        tcc.addProfessor(fernando);
        Dia segunda = new Dia("Segunda");
        Hora seg_treze = new Hora(tcc,"13:00");
        Hora seg_quatorze = new Hora(tcc,"14:00");
        Hora seg_quinze = new Hora(eng,"15:00");
        Hora seg_dezeseis = new Hora(geren,"16:00");
        Hora seg_dezesete = new Hora(tcc,"17:00");
        segunda.addHora(seg_treze);segunda.addHora(seg_quatorze);segunda.addHora(seg_quinze);segunda.addHora(seg_dezeseis);
        segunda.addHora(seg_dezesete);
        Dia terca = new Dia("Terça");

        Dia quarta = new Dia("Quarta");
        Hora qua_treze = new Hora(geren,"13:00");
        Hora qua_quatorze = new Hora(geren,"14:00");
        Hora qua_quinze = new Hora(geren,"15:00");
        Dia quinta = new Dia("Quinta");
        Hora qui_quatorze = new Hora(tep,"14:00");
        Hora qui_quinze = new Hora(tep,"15:00");
        Dia sexta = new Dia("Sexta");
        Hora sex_treze = new Hora(eng,"13:00");
        Hora sex_quatorze = new Hora(eng,"14:00");
        Hora sex_quinze = new Hora(eng,"15:00");
        Hora sex_dezeseis = new Hora(tep,"16:00");
        Hora sex_dezesete = new Hora(tep,"17:00");
        horario = new Horario("ADS V");
        horario.addDia(segunda);
        horario.addDia(terca);
        horario.addDia(quarta);
        horario.addDia(quinta);
        horario.addDia(sexta);
        btSeg1.setText(tcc.getNome());
        btSeg2.setText(tcc.getNome());
        btSeg3.setText(eng.getNome());
        btSeg4.setText(geren.getNome());
        btSeg5.setText(geren.getNome());

        btQua1.setText(geren.getNome());
        btQua2.setText(geren.getNome());
        btQua3.setText(geren.getNome());

        btQui2.setText("TEP");
        btQui3.setText("TEP");

        btSex1.setText(eng.getNome());
        btSex2.setText(eng.getNome());
        btSex3.setText(eng.getNome());
        btSex4.setText(tep.getNome());
        btSex5.setText(tep.getNome());
    }
    public void goHoraSeg1(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Fernando Santana");
        intent.putExtra("Disciplina", "TCC I");
        startActivity(intent);
    }
    public void goHoraSeg2(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Fernando Santana");
        intent.putExtra("Disciplina", "TCC I");
        startActivity(intent);
    }
    public void goHoraSeg3(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Helcio");
        intent.putExtra("Disciplina", "Engenharia II");
        startActivity(intent);
    }
    public void goHoraSeg4(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Adalton");
        intent.putExtra("Disciplina", "Gerência de Projeto");
        startActivity(intent);
    }
    public void goHoraSeg5(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Adalton");
        intent.putExtra("Disciplina", "Gerência de Projeto");
        startActivity(intent);
    }
    public void goHoraTer1(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraTer2(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraTer3(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraTer4(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraTer5(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }

    public void goHoraQua1(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Adalton");
        intent.putExtra("Disciplina", "Gerência de Projeto");
        startActivity(intent);
    }
    public void goHoraQua2(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Adalton");
        intent.putExtra("Disciplina", "Gerência de Projeto");
        startActivity(intent);
    }
    public void goHoraQua3(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Adalton");
        intent.putExtra("Disciplina", "Gerência de Projeto");
        startActivity(intent);
    }
    public void goHoraQua4(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraQua5(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraQui1(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraQui2(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Marcelino");
        intent.putExtra("Disciplina", "Tópicos Especiais");
        startActivity(intent);
    }
    public void goHoraQui3(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Marcelino");
        intent.putExtra("Disciplina", "Tópicos Especiais");
        startActivity(intent);
    }
    public void goHoraQui4(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraQui5(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        startActivity(intent);
    }
    public void goHoraSex1(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Helcio");
        intent.putExtra("Disciplina", "Engenharia II");
        startActivity(intent);
    }
    public void goHoraSex2(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Helcio");
        intent.putExtra("Disciplina", "Engenharia II");
        startActivity(intent);
    }
    public void goHoraSex3(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Helcio");
        intent.putExtra("Disciplina", "Engenharia II");
        startActivity(intent);
    }
    public void goHoraSex4(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Ely");
        intent.putExtra("Disciplina", "Tópicos Especiais");
        startActivity(intent);
    }
    public void goHoraSex5(View v){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("Professor","Ely");
        intent.putExtra("Disciplina", "Tópicos Especiais");
        startActivity(intent);
    }
}
