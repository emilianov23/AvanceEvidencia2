package com.example.emiliano.avanceevidencia2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class RecyclerView extends AppCompatActivity {

    private RecyclerView mRecyclerview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayout;

    @Override
    protected void onCreate(Bundle savedIntence){
        super.onCreate(savedIntence);
        setContent(R.layout.activity_main);

        mRecyclerview = findViewById(R.id.Curp);
        mRecyclerview = setHasFixedsize(true);

        mLayout = new LinearLayout(this);
        mRecyclerview.setLayoutManager(mLayout);

        ArrayList<Curp> curps= Curp.getcuro(this);
        mAdapter = new AdapterRecyclerView(curps);
    }
}
