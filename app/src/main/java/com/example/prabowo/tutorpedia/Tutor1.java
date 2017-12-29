package com.example.prabowo.tutorpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutor1 extends AppCompatActivity implements View.OnClickListener {

    private Button BTtutor1next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor1);

        BTtutor1next = (Button) findViewById(R.id.BTtutor1next);
        BTtutor1next.setOnClickListener(this);
    }





    public void onClick(View v) {

        if(v == BTtutor1next ){

        Intent intent = new Intent(this,Tutor2.class);
        startActivity(intent);
    }

        /*if(v == IVtransisimateri){

        Intent intent = new Intent(this,Materi.class);
        intent.putExtra("Matkul",Matkul);
        startActivity(intent);*/
    }
}


