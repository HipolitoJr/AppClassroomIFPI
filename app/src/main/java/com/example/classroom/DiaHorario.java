package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.classroom.model.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiaHorario extends AppCompatActivity {
    private ListView lista;
    private TextView title;
    private Mock mock;
    private String itemGet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_horario);
        lista = (ListView) findViewById(R.id.list_dias);
        title = (TextView)findViewById(R.id.txt_title_dia_hora);
        Intent intent = getIntent();
        itemGet = intent.getStringExtra("item");
        title.setText(itemGet +" Horas");
        mock = new Mock();
        String[] datas = new String[]{};
        if(itemGet.substring(0,3).equals("SEG")){
            datas = mock.getDatas().getSegundas();
        }
        if(itemGet.substring(0,3).equals("TER")){
            datas = mock.getDatas().getTercas();
        }
        if(itemGet.substring(0,3).equals("QUA")){
            datas = mock.getDatas().getQuartas();
        }
        if(itemGet.substring(0,3).equals("QUI")){
            datas = mock.getDatas().getQuintas();
        }
        if(itemGet.substring(0,3).equals("SEX")){
            datas = mock.getDatas().getSextas();
        }
        List<String> turmas_list = new ArrayList<String>(Arrays.asList(datas));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, turmas_list);
        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String selectedItem = (String) parent.getItemAtPosition(position);
                goHorarioDetail(view, selectedItem);

            }
        });
    }
    public void goHorarioDetail(View v, String item){
        Intent intent = new Intent(this, HorarioDetail.class);
        intent.putExtra("item",item);
        intent.putExtra("diaHora",itemGet);
        startActivity(intent);
    }
}
