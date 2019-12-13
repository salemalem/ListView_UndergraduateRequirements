package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> requirements = new ArrayList<String>();
        requirements.add("SAT R&WL [730-780]");
        requirements.add("SAT Math [790-800]");
        requirements.add("SAT Math 2 [790-800]");
        requirements.add("SAT Physics [790-800]");
        requirements.add("ExcAct related to CS");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, requirements);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("Requirement:", requirements.get(position));
                Toast.makeText(MainActivity.this, requirements.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
