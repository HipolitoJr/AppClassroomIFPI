package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HorarioDetail extends AppCompatActivity {
    private TextView professor;
    private TextView disciplina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_detail);
        Intent intent = getIntent();
        professor =(TextView)findViewById(R.id.txt_profe_name);
        disciplina = (TextView)findViewById(R.id.txt_discp_name);
        String prof =intent.getStringExtra("Professor");
        String disci = intent.getStringExtra("Disciplina");
        disciplina.setText(disci);
        professor.setText(prof);

    }

    public void disponiblizar(View v){

    }
}
