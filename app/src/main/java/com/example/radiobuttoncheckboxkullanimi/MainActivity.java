package com.example.radiobuttoncheckboxkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxJava, checkBoxKotlin;
    private RadioButton radioButtonBarcelona, radioButtonRealMadrid;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxJava = findViewById(R.id.checkBoxJava);
        checkBoxKotlin = findViewById(R.id.checkBoxKotlin);
        radioButtonBarcelona = findViewById(R.id.radioButtonBarcelona);
        radioButtonRealMadrid = findViewById(R.id.radioButtonRealMadrid);
        button = findViewById(R.id.button);


        radioButtonBarcelona.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(getApplicationContext(),"Tebrikler :)",Toast.LENGTH_LONG).show();
                }
            }
        });

        checkBoxKotlin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    Toast.makeText(MainActivity.this,"Kotlin severiz!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean javaDurum = checkBoxJava.isChecked();
                Boolean kotlinDurum = checkBoxKotlin.isChecked();
                Boolean barcelonaDurum = radioButtonBarcelona.isChecked();
                Boolean realMadridDurum = radioButtonRealMadrid.isChecked();

                Log.e("Java",String.valueOf(javaDurum));
                Log.e("Kotlin",String.valueOf(kotlinDurum));
                Log.e("Barcelona",String.valueOf(barcelonaDurum));
                Log.e("Realmadrid", String.valueOf(realMadridDurum));
            }
        });
    }
}