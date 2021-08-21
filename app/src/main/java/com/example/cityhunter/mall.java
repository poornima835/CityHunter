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
public class mall extends AppCompatActivity {
    ListView listView;
    ArrayList<String> months = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);
        months.add("Capital mall");
        months.add("DB mall");
        months.add("Gammon mall");
        months.add("Vardhaman mall");
        months.add("Aashima mall");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, months);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=OdeNX5X8O5rez7sPuNGQyAI&q=capital+mall+bhopal&oq=capital+mall+bhopal&gs_l=psy-ab.3..46i199i175k1j0l5j0i7i30k1j0i30k1l3.20208.27952.0.28219.22.17.1.0.0.0.311.2398.0j2j6j2.10.0..3..0...1.1.64.psy-ab..11.11.2399...38j46i67k1j0i67k1j46i433i67k1j0i433k1j0i433i131k1j0i433i67k1j46i199i175i13k1j0i13k1j0i13i30k1.0.Xzt5uYf09_Y#rlfi=hd:;si:4513552408245722240;mv:[[23.16450307731903,77.46876925934747],[23.164143122680976,77.46837774065253]]"));
                    startActivity(intent);


                }
                if(position==1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=1teNX-m7JZDSz7sPo8KsyAc&q=DB+mall+bhopal&oq=DB+mall+bhopal&gs_l=psy-ab.3..46i67k1j0l3j0i67k1j0l5.17110.20791.0.21800.11.7.0.0.0.0.426.1299.0j1j3j0j1.5.0..3..0...1.1.64.psy-ab..6.5.1298...38j46i199i175i13k1j0i13k1j0i7i30k1j46i13k1j0i10k1j46i10k1.0.MqMK80dvtxQ#rlfi=hd:;si:6766486821146549329;mv:[[23.2329837,77.43041439999999],[23.231869,77.42972859999999]]"));
                    startActivity(intent);
                }

                if (position == 2) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=V9eNX6WzDOKbmger953wCw&q=Gammon+mall+bhopal&oq=Gammon+mall+bhopal&gs_l=psy-ab.3..46i199i175k1j0i7i30k1j38l2.63401.69639.0.71171.15.15.0.0.0.0.327.2404.0j4j6j1.11.0..3..0...1.1.64.psy-ab..7.8.1649...0j0i8i7i30k1j46i199i175i13k1.0.UeIS4P6Xk0s#rlfi=hd:;si:;mv:[[23.2329769,77.404285],[23.2328297,77.40326019999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:10"));
                    startActivity(intent);


                }
                if (position == 3) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=n9eNX6fIDe_6z7sP-qm8sAc&q=Vardhaman+mall+bhopal&oq=Vardhaman+mall+bhopal&gs_l=psy-ab.3..46i199i175i13k1j38.19605.24724.0.24991.15.13.0.0.0.0.265.2004.0j7j3.10.0..3..0...1.1.64.psy-ab..5.9.1817...0j0i7i30k1j0i7i10i30k1j0i8i7i30k1.0.QLIbgdvtd5E#rlfi=hd:;si:16325892476221833217;mv:[[23.213488277319023,77.43726863105468],[23.213128322680966,77.43687696894531]]"));
                    startActivity(intent);


                }
                if (position == 4) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=udeNX9yaDtzB3LUPuvi_kAw&q=Aashima+mall+bhopal&oq=Aashima+mall+bhopal&gs_l=psy-ab.3..46i199i175k1j0l6j0i30k1l2j38.20942.27232.0.28508.16.12.0.0.0.0.432.1900.0j2j3j1j1.7.0..3..0...1.1.64.psy-ab..9.7.1897...46i199i175i13k1j0i7i30k1j0i13k1.0.4jiP-ZcLS9s"));
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