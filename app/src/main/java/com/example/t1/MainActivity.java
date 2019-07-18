package com.example.t1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4,et5;
    Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.ET1);
        et2=(EditText)findViewById(R.id.ET2);
        et3=(EditText)findViewById(R.id.ET3);
        et4=(EditText)findViewById(R.id.ET4);
        et5=(EditText)findViewById(R.id.ET5);
        btn1=(Button)findViewById(R.id.BTN1);
        btn2=(Button)findViewById(R.id.BTN2);
        btn3=(Button)findViewById(R.id.BTN3);
        btn4=(Button)findViewById(R.id.BTN4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Mujer", Toast.LENGTH_SHORT).show();
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Hombre", Toast.LENGTH_SHORT).show();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        et1.getText().clear();
        et2.getText().clear();
        et3.getText().clear();
        et4.getText().clear();
        et5.getText().clear();

            }
        });
    }
    public void calcular(View view){
        int a,d,e,r,f,z,m;
        String mostrar,b,c;

        mostrar=et1.getText().toString();
        b=et2.getText().toString();
        c=et3.getText().toString();
        d=Integer.parseInt(et4.getText().toString());
        e=Integer.parseInt(et5.getText().toString());
        r=e-100;
        f=2019-d;
        Toast.makeText(MainActivity.this, "Hola   "+mostrar+"  de la escuela "+c+"   Naciste en el año  "+f+"  aproximadamente y Tu peso ideal es  "+r,Toast.LENGTH_LONG).show();


    }
}
