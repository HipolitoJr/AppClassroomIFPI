package com.example.classroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeHorarios extends AppCompatActivity {
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_horarios);
        lista = (ListView) findViewById(R.id.list_turmas);
        String[] turmas = new String[] {"ADS I", "ADS III", "ADS V"};
        List<String> turmas_list = new ArrayList<String>(Arrays.asList(turmas));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, turmas_list);
        lista.setAdapter(arrayAdapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                String selectedItem = (String) parent.getItemAtPosition(position);
                goHorario(view, selectedItem);

            }
        });
    }
    public void goHorario(View v, String item){
        Intent intent = new Intent(this, HorarioList.class);
        intent.putExtra("item",item);
        startActivity(intent);
    }
}
