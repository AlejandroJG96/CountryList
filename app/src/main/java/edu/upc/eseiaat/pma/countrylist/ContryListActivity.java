package edu.upc.eseiaat.pma.countrylist;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ContryListActivity extends AppCompatActivity {

    private ArrayList<String> country_list;
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contry_list);

        String[] countries = getResources().getStringArray(R.array.countries);
        country_list = new ArrayList<>(Arrays.asList(countries));
        ListView list = (ListView) findViewById(R.id.CountryList);

        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, country_list );
        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(ContryListActivity.this, String.format("Ha escogido '%s'",country_list.get(pos)), Toast.LENGTH_SHORT).show();

            }
        });




    }
}
