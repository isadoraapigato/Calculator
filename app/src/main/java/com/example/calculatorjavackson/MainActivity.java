 package com.example.calculatorjavackson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         getSupportActionBar().hide();
         horai = findViewById(R.id.horai);
         minutoi = findViewById(R.id.minutoi);
         horaf = findViewById(R.id.horaf);
         minutof = findViewById(R.id.minutof);
         resultadohora = findViewById(R.id.resultadohora);
         resultadominuto = findViewById(R.id.resultadominuto);
     }

     public void Soma(View view) {
         int hini = Integer.parseInt(horai.getText().toString());
         int mini = Integer.parseInt(minutoi.getText().toString());
         int hfin = Integer.parseInt(horaf.getText().toString());
         int mfin = Integer.parseInt(minutof.getText().toString());
         int resultadoh = hini + hfin;
         int resultadom = mini + mfin;

         while (resultadom > 59) {
             resultadom -= 60;
             resultadoh++;
         }
         resultadohora.setText(resultadoh + "");
         resultadominuto.setText((resultadom + ""));
     }

     public void Subtracao(View view) {
         int hini = Integer.parseInt(horai.getText().toString());
         int mini = Integer.parseInt(minutoi.getText().toString());
         int hfin = Integer.parseInt(horaf.getText().toString());
         int mfin = Integer.parseInt(minutof.getText().toString());
         while (hini > 0){
             hini --;
             mini += 60;
         }
         while (hfin >0){
             hfin --;
             mfin += 60;
         }
         int resultadoh = 0;
         int resultadom = mini - mfin;
         if (mfin> mini){
             resultadom = mfin - mini;
         }
         while ( resultadom > 59) {
             resultadom -= 60;
             resultadoh ++;
         }

         resultadohora.setText(resultadoh + "");
         resultadominuto.setText((resultadom + ""));
     }
 }


 }