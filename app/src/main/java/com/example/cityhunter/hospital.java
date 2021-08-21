package com.example.cityhunter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class hospital extends AppCompatActivity {
    ListView listView;
    ArrayList<String> months = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);
        months.add("Bansal");
        months.add("Jaanki");
        months.add("Agrawal hospital");
        months.add("Ojas hostipal");
        months.add("BMHRC hospital");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, months);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=irqNX6GRDsjaz7sP8Iqz2AU&hotel_occupancy=&q=Bansal+hospital+bhopal&oq=Bansal+hospital+bhopal&gs_l=psy-ab.3..46i433i199i175k1j0l9.4291401.4300319.0.4303178.30.22.1.0.0.0.485.4155.0j11j4j1j2.18.0..3..0...1.1.64.psy-ab..12.18.3958...38j46j46i199i175i13k1j0i8i7i30k1j0i67k1j46i433i67k1j0i433k1j0i7i30k1j46i13k1j0i13k1.0.dbi2QidXD8w#rlfi=hd:;si:8791364284441447042;mv:[[23.19965947731903,77.42011631079151],[23.199299522680974,77.4197246892085]]"));
                    startActivity(intent);


                }
                if(position==1){
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/search?tbm=lcl&ei=WsuNX8-hC83az7sP__-3iA8&q=Jaanki+hospital+bhopal&oq=Jaanki+hospital+bhopal&gs_l=psy-ab.3..46i199i175k1j0i10k1j38.134973.138585.0.139947.12.12.0.0.0.0.328.1848.0j6j2j1.9.0..3..0...1.1.64.psy-ab..5.7.1451...0j0i7i30k1j46i199i175i13k1j0i13k1.0.mhebMghE9fE#rlfi=hd:;si:12512941229777930010;mv:[[23.182659077319027,77.4383978859024],[23.18229912268097,77.4380063140976]]"));
                    startActivity(intent);

                }
                if (position == 2) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=5suNX8_7OqPMz7sP9IeMmAM&q=Agrawal+hospital+bhopal&oq=Agrawal+hospital+bhopal&gs_l=psy-ab.3..46i199i175k1j0j0i7i30k1j0i30k1j0i7i5i30k1l2j0i8i30k1j38l2.108371.113190.0.114000.15.15.0.0.0.0.300.2256.0j6j4j1.11.0..3..0...1.1.64.psy-ab..6.9.1821...0i67k1j0i7i10i30k1j0i8i7i30k1j46i199i175i13k1j0i13k1.0.nNhYS1hHV1s#rlfi=hd:;si:16901658650708787498;mv:[[23.21583377731903,77.43958473449307],[23.215473822680973,77.43919306550693]]"));
                    startActivity(intent);


                }
                if (position == 3) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=WcyNX_DCL6XBz7sP3LWj4Ac&q=Ojas+hospital+bhopal&oq=Ojas+hospital+bhopal&gs_l=psy-ab.3..46i199i175k1j38.26970.30473.0.31936.11.11.0.0.0.0.330.1612.0j4j1j2.7.0..3..0...1.1.64.psy-ab..6.5.1179...0j0i67k1j0i7i30k1j46i199i175i13k1j0i13k1.0.017aSaYxyl8#rlfi=hd:;si:4855358190391249273;mv:[[23.19568877731903,77.46590770497617],[23.195328822680974,77.46551609502384]]"));
                    startActivity(intent);


                }
                if (position == 4) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=esyNX52iK8fUz7sPmLa6wAc&q=BMHRC+hospital+bhopal&oq=BMHRC+hospital+bhopal&gs_l=psy-ab.3..46i199i175k1j0i8i30k1j38.33201.58114.0.60141.19.10.9.0.0.0.251.1981.0j6j4.10.0..3..0...1.1.64.psy-ab..0.19.2014...0j46i199i175i13k1j0i7i30k1j0i13k1j0i67k1j0i8i7i30k1.0.2dE5wtkcU9I#rlfi=hd:;si:10191754816730741064;mv:[[23.336670577319026,77.38352741224166],[23.33631062268097,77.38313538775834]]"));
                    startActivity(intent);


                }




            }
        });



        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                arrayAdapter.getFilter().filter(s);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}