package com.example.emiliano.avanceevidencia2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Curp curp = getIntent().getParcelableExtra("cur");

        ((TextView)findViewById(R.id.nombre)).setText(curp.nombre());
        ((TextView)findViewById(R.id.apellido1)).setText(curp.apellido1());
        ((TextView)findViewById(R.id.apellido2)).setText(curp.apellido2());
        ((TextView)findViewById(R.id.sex)).setText(curp.sex());
        ((TextView)findViewById(R.id.fecha)).setText(curp.fecha());
        ((TextView)findViewById(R.id.entidad)).setText(curp.entidad());
    }

    @Override
    public boolean onCreateOptionsMenu(menu menu) {
        menuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

}
