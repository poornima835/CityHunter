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
public class hotel extends AppCompatActivity {
    ListView listView;
    ArrayList<String> months = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);
        months.add("Sayaji hotel bhopal");
        months.add("Jehan Numa Palace");
        months.add("Pukhraj");
        months.add("Noor-Us-Subah palace");
        months.add("Courtyard by Marriott bhopal");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, months);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=obaNX9LJJomA9QP7vYyYDw&hotel_occupancy=&q=sayaji+hotel+bhopal&oq=sayaji+hotel+bhopal&gs_l=psy-ab.3..46i199i175k1j0l7j0i7i30k1l2.31778.49034.0.54016.35.20.0.0.0.0.354.3666.0j2j10j3.15.0..3..0...1.1.64.psy-ab..20.15.3663...46i199i175i13k1j0i13k1j46i199i175i67k1j0i433i67k1j0i67k1j46i433i67k1j0i433k1j46i13k1j46i199i175i10k1j0i10k1.0.A_0peD8oqjk#rlfi=hd:;si:1536512555481159717;mv:[[23.219661877319023,77.37299484010583],[23.219301922680966,77.37260315989418]]"));
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=2LaNX4PHMZWe9QPFt7XQDQ&hotel_occupancy=&q=jehan+numa+palace+hotel+bhopal&oq=jehan+numa+palace+hotel+bhopal&gs_l=psy-ab.3..46i199i175k1j0l2j0i30k1l4j0i8i30k1l3.346097.364751.0.371757.25.25.0.0.0.0.655.4476.0j1j16j5-1.18.0..3..0...1.1.64.psy-ab..7.18.4471...0i67k1j0i7i30k1j0i13k1j46i199i175i13k1j0i13i5i30k1j0i5i30k1j0i8i7i30k1j0i8i13i30k1.0.z91ljpIK0YI#rlfi=hd:;si:2498271038643598755;mv:[[23.240722777319025,77.3874191710067],[23.240362822680968,77.3870274289933]]"));
                    startActivity(intent);

                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=TbiNX5GNGbvaz7sPp5m0UA&hotel_occupancy=&q=pukhraj+hotel+bhopal&oq=pukhraj+hotel+bhopal&gs_l=psy-ab.3..46i199i175k1j0i8i30k1l2j38.563934.569438.0.571837.24.13.0.0.0.0.381.2184.0j7j2j1.10.0..3..0...1.1.64.psy-ab..16.8.1777...0j0i67k1j0i7i30k1j0i8i7i30k1j46i199i175i13k1.0.7VFWJcVsbtU#rlfi=hd:;si:4973606893547152410;mv:[[23.222197977319023,77.43767784382491],[23.221838022680966,77.4372861561751]]"));
                    startActivity(intent);


                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=YrWNX5TkJKrbz7sPkYWtsAc&hotel_occupancy=&q=noor+us+sabah+bhopal&oq=Noor++bhopal&gs_l=psy-ab.1.1.38j0i7i30k1l8j38.256185.268606.0.270605.12.12.0.0.0.0.231.1837.0j2j7.9.0..3..0...1.1.64.psy-ab..3.9.1836...0j0i7i5i30k1j46i433i67k1j0i67k1j0i433k1j46i13i10k1j0i13i10k1j0i13k1.0.ei4s_ir1kBY#rlfi=hd:;si:10593421664733200394;mv:[[23.267214877319027,77.36861460992777],[23.26685492268097,77.36822279007222]]"));
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=craNX4mgJsee9QOSuKvACA&hotel_occupancy=&q=courtyard+by+marriott+bhopal&oq=Cou+bhopal&gs_l=psy-ab.1.0.0i7i30k1l10.36758.43522.0.45577.16.9.0.0.0.0.409.1567.0j2j2j1j1.6.0..3..0...1.1.64.psy-ab..11.5.1338...0j38j46i199i175i67k1j0i10k1j46i199i175i10k1j0i67k1j0i433i67k1j46i433i67k1j0i433k1.0.eUtCRoM02M0#rlfi=hd:;si:11841551924262095554;mv:[[23.23333567731903,77.4299045601641],[23.232975722680973,77.42951283983588]]"));
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