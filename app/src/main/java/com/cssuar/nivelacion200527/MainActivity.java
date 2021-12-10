package com.cssuar.nivelacion200527;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

private TextView txt;
private EditText ingr,egre;
private Button btning,btnegr;
private ArrayAdapter<adapter> arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt = findViewById(R.id.costo);
        ingr = findViewById(R.id.txtNumber);
        btning = findViewById(R.id.button);

        btnegr= findViewById(R.id.button2);
        egre = findViewById(R.id.txtNumber2);
        double num = 0;
        btning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(ingr.getText().toString());
                String total = String.valueOf(num1);
                txt.setText(total);

            }
        });
btning.setOnLongClickListener(new View.OnLongClickListener() {
    @Override
    public boolean onLongClick(View v) {
        double num = Double.parseDouble(txt.getText().toString());
        double num1 = Double.parseDouble(ingr.getText().toString());
        double num2 = num + num1;
        String ttl = String.valueOf(num2);
        txt.setText(ttl);
        Toast.makeText(getApplicationContext(), "Has agregado mas Ingresos", Toast.LENGTH_SHORT).show();
        return true;
    }
});

        btnegr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(txt.getText().toString());
                double num1 = Double.parseDouble(egre.getText().toString());
                double num3 = num - num1;
                String ttl = String.valueOf(num3);
                txt.setText(ttl);
                Toast.makeText(getApplicationContext(), "-"+num1, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public class adapter {
        private  double ingresos, egresos;

        public adapter(double ingresos, double egresos) {
            this.ingresos = ingresos;
            this.egresos = egresos;
        }


        public double getIngresos(double ingresos) {
            return this.ingresos;
        }

        public void setIngresos(double ingresos) {
            this.ingresos = ingresos;
        }

        public double getEgresos(double egresos) {
            return this.egresos;
        }

        public void setEgresos(double egresos) {
            this.egresos = egresos;
        }
    }
}