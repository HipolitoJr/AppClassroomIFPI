package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HorarioDisponivel extends AppCompatActivity {
    private ListView lista;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_disponivel);
        title = (TextView)findViewById(R.id.txt_title_disponivel);
        title.setText("Horarios disponíveis");
        lista = (ListView) findViewById(R.id.list_disponivel);
        String[] disponivel = new String[] {"06/06/2019 QUINTA 13:00","06/06/2019 QUINTA 14:00","06/06/2019 QUINTA 15:00","10/06/2019 SEGUNDA 13:00", "10/06/2019 SEGUNDA 14:00"};
        List<String> dispo_list = new ArrayList<String>(Arrays.asList(disponivel));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dispo_list);
        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String selectedItem = (String) parent.getItemAtPosition(position);
                SolicitarHorario(view, selectedItem);

            }
        });
    }
    public void SolicitarHorario(View v, String item){
        Toast.makeText(this, "O horário foi solicitado", Toast.LENGTH_SHORT).show();

    }
}
