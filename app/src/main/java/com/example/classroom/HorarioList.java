package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HorarioList extends AppCompatActivity {
    private ListView lista;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario_list);
        lista = (ListView) findViewById(R.id.list_horarios);
        title = (TextView)findViewById(R.id.txt_title_hora_list);
        Intent intent = getIntent();
        String itemGet = intent.getStringExtra("item");
        title.setText(itemGet);
        List<String> turmas_list = new ArrayList<String>();
        String[] turmas = new String[] {"ADSI", "ADSIII", "ADSV"};
        String[] adsi = new String[] {"SEGUNDA 13:00", "SEGUNDA 14:00", "QUARTA 16:00", "QUARTA 17:00"};
        String[] adsiii = new String[] {"TERÇA 15:00", "TERÇA 16:00", "TERÇA 17:00", "QUINTA 13:00", "QUINTA 14:00"};
        String[] adsv = new String[] {"SEGUNDA 15:00", "SEXTA 13:00","SEXTA 14:00","SEXTA 15:00"};
        if(itemGet.equals("ADS I")){
            turmas_list = new ArrayList<String>(Arrays.asList(adsi));
        }
        if(itemGet.equals("ADS III")){
            turmas_list = new ArrayList<String>(Arrays.asList(adsiii));
        }
        if(itemGet.equals("ADS V")){
            turmas_list = new ArrayList<String>(Arrays.asList(adsv));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, turmas_list);
        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String selectedItem = (String) parent.getItemAtPosition(position);
                goHorarioList(view, selectedItem);

            }
        });
    }
    public void goHorarioList(View v, String item){
        Intent intent = new Intent(this, DiaHorario.class);
        intent.putExtra("item",item);
        startActivity(intent);
    }
}
