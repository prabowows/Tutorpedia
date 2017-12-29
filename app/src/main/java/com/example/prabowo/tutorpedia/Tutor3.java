package com.example.prabowo.tutorpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutor3 extends AppCompatActivity implements View.OnClickListener {

    private Button BTtutor3next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor3);

        BTtutor3next = (Button) findViewById(R.id.BTtutor3next);
        BTtutor3next.setOnClickListener(this);
    }





    public void onClick(View v) {

        if(v == BTtutor3next ){

            Intent intent = new Intent(this,Tutor4.class);
            startActivity(intent);
        }

        /*if(v == IVtransisimateri){

        Intent intent = new Intent(this,Materi.class);
        intent.putExtra("Matkul",Matkul);
        startActivity(intent);*/
    }

}
