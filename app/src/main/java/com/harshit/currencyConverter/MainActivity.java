package com.harshit.currencyConverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.harshit.demoapp.R;

public class MainActivity extends AppCompatActivity {
    public void clickFunction (View view){

        EditText rupee = findViewById(R.id.editText);
        Double r = Double.parseDouble(rupee.getText().toString()), d;
        d = r/70;
        Toast.makeText(MainActivity.this,"$"+ String.format("%.2f",d),Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
