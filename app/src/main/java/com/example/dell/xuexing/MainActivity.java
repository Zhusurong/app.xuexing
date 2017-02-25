package com.example.dell.xuexing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.zz);


        final EditText editStringww;
        final EditText editStringcc;
        editStringcc = (EditText) findViewById(R.id.cc);
        editStringww = (EditText) findViewById(R.id.ww);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String editeTextCC = editStringcc.getText().toString();
                String editeTextWW = editStringww.getText().toString();
                if (editeTextCC.equals("A") && editeTextWW.equals("B")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivityForResult(intent, 1);
                }
                if (editeTextCC.equals("B") && editeTextWW.equals("A")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivityForResult(intent, 1);
                }
                if (editeTextCC.equals("A")&&editeTextWW.equals("A")) {
                    Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                    startActivityForResult(intent,1);
                }
                if (editeTextCC.equals("B")&&editeTextWW.equals("B")){
                    Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                    startActivityForResult(intent,1);
                }
                if(editeTextCC.equals("O")&&editeTextWW.equals("O")){
                    Intent intent = new Intent(MainActivity.this,Main5Activity.class);
                    startActivityForResult(intent,1);
                }
                if(editeTextCC.equals("AB")&&editeTextWW.equals("A")){
                    Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                    startActivityForResult(intent,1);
                    }
                if(editeTextCC.equals("A")&&editeTextWW.equals("AB")){
                    Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                    startActivityForResult(intent,1);
                }
                if (editeTextCC.equals("AB")&&editeTextWW.equals("B")){
                    Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                    startActivityForResult(intent,1);
                }
                if (editeTextCC.equals("B")&&editeTextWW.equals("A")){
                    Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                    startActivityForResult(intent,1);
                }
                if(editeTextCC.equals("AB")&&editeTextWW.equals("AB")){
                    Intent intent = new Intent(MainActivity.this,Main6Activity.class);
                    startActivityForResult(intent,1);
                }
                if(editeTextCC.equals("A")&&editeTextWW.equals("O")){
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    startActivityForResult(intent,1);
                }
                if(editeTextCC.equals("O")&&editeTextWW.equals("A")){
                    Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                    startActivityForResult(intent,1);
                }
                if (editeTextCC.equals("B")&&editeTextWW.equals("O")){
                    Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                    startActivityForResult(intent,1);
                }
                if (editeTextCC.equals("O")&&editeTextWW.equals("B")){
                    Intent intent = new Intent(MainActivity.this,Main4Activity.class);
                    startActivityForResult(intent,1);
                }
                }

        });


    }


}


