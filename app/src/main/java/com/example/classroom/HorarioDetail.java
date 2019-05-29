package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HorarioDetail extends AppCompatActivity {
    private TextView professor;
    private TextView disciplina;
    private Button disp;
    private Button cancel;
    private String diaHora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_detail);
        Intent intent = getIntent();
        diaHora = intent.getStringExtra("diaHora");
        professor =(TextView)findViewById(R.id.txt_profe_name);
        disciplina = (TextView)findViewById(R.id.txt_discp_name);
        disp = (Button)findViewById(R.id.bt_disponibilizar);
        cancel = (Button)findViewById(R.id.bt_cancelar);
        String prof =intent.getStringExtra("item");
        String disci = intent.getStringExtra("Disciplina");
        disciplina.setText(prof+" "+diaHora);
        professor.setText("Horario Ativo");

    }

    public void disponiblizar(View v){
        Toast.makeText(this, "O horário foi disponibilizado para outros professores!", Toast.LENGTH_SHORT).show();
        disp.setVisibility(View.GONE);
        professor.setText("Horario disponibilizado");
        cancel.setVisibility(View.VISIBLE);
    }

    public void cancelarDispon(View v){
        Toast.makeText(this, "A disponibilização foi cancelada!", Toast.LENGTH_SHORT).show();
        disp.setVisibility(View.VISIBLE);
        professor.setText("Horario Ativo");
        cancel.setVisibility(View.GONE);
    }
}
