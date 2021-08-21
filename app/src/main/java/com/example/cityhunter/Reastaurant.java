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
public class Reastaurant extends AppCompatActivity {
    ListView listView;
    ArrayList<String> months = new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    EditText etSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reastaurant);
        listView = findViewById(R.id.listView);
        etSearch = findViewById(R.id.etSearch);
        months.add("Nerbada");
        months.add("Dynasty");
        months.add("Manohar dairy");
        months.add("Shahnama");
        months.add("Under the mango tree");

        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, months);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 3) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=CtSNX5bLNdXe9QPOraT4Ag&q=Shahnama+bhopal&oq=Shahnama+bhopal&gs_l=psy-ab.3..46i199i175k1j0j0i7i30k1j38.331342.349723.0.352168.15.12.0.0.0.0.454.2168.0j4j1j1j2.8.0..3..0...1.1.64.psy-ab..7.8.2166...0i13k1j0i7i5i30k1j46i433i67k1j0i433k1j0i67k1j0i433i131i67k1j46i199i175i13k1j0i7i10i30k1.0.BoklQIpU26Y#rlfi=hd:;si:2772347051148062341;mv:[[23.24045777731903,77.38741807061767],[23.240097822680973,77.38702632938234]]"));
                    startActivity(intent);


                }
                if(position==1){
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=ztONX9rUCZao9QPBkqLYCQ&q=Dynasty+bhopal&oq=Dynasty+bhopal&gs_l=psy-ab.3..0j0i5i30k1l3j0i7i5i30k1j38l3.52670.58382.0.59459.37.16.0.0.0.0.318.2099.0j6j3j1.10.0..3..0...1.1.64.psy-ab..29.8.1713...46i199i175i13k1j0i13i30k1j0i67k1j46i433i67k1j46i199i175i67k1j0i433k1j0i433i131i67k1j46i13k1j0i13k1j0i7i30k1j0i8i13i30k1.0.7xCksoWLOgs"));
                    startActivity(intent);
                }

                if (position == 0) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=xtWNX66yB8KA9QPIlbTgDA&q=Nerbada+sweets+and+restaurant++bhopal&oq=Nerbada+sweets+and+restaurant++bhopal&gs_l=psy-ab.3..0i30k1j38l2.7716.18003.0.19002.21.20.1.0.0.0.282.3081.0j14j2.16.0..3..0...1.1.64.psy-ab..4.17.3082...0i8i30k1j0i333k1j33i10k1.0.VyYhEpVxugo#rlfi=hd:;si:;mv:[[23.2736189,77.3961448],[23.2598198,77.3406468]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3!3sIAE,lf:1,lf_ui:4"));
                    startActivity(intent);


                }
                if (position == 2) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&ei=CNaNX9bLEJLl9QOzw6XYDw&q=Manohar+Dairy+and+restaurant+bhopal&oq=Manohar+Dairy+and+restaurant+bhopal&gs_l=psy-ab.3..46i199i175k1j0i30k1j38l2.20011.44056.0.45063.44.36.0.0.0.0.435.6293.0j19j11j0j1.31.0..3..0...1.1.64.psy-ab..14.30.6135...0j0i7i30k1j46i433i67k1j46i199i175i67k1j0i67k1j0i433k1j0i433i131i67k1j0i433i67k1j0i13k1j0i333k1j46i199i175i13k1j0i13i30k1.0._-rcBHGtUTY"));
                    startActivity(intent);


                }
                if (position == 4) {

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?tbm=lcl&q=under+the+mango+tree+restaurant+bhopal&spell=1&sa=X&ved=0ahUKEwiQseP6i8nsAhVTxzgGHaBaDS0QBQgMKAA&biw=1366&bih=657&dpr=1#rlfi=hd:;si:14402260312684371871;mv:[[23.24025187731903,77.38699937031541],[23.239891922680975,77.3866076296846]]"));
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