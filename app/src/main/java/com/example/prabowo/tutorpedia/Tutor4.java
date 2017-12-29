package com.example.prabowo.tutorpedia;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutor4 extends AppCompatActivity implements View.OnClickListener {

    private Button BTtutor4next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor4);

        BTtutor4next = (Button) findViewById(R.id.BTtutor4next);
        BTtutor4next.setOnClickListener(this);
    }



    public void onClick(View v) {


     if(v == BTtutor4next){

         String alert1 = "Terima Kasih Sudah Mengikuti Tutorial";
         //String alert2 = "Kode hadiah";
         //String alert3 = "Kode user: " + user.getUid().toString();
         String alert4 = "Apakah Sudah Paham ?";

         AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
         builder1.setMessage(alert1 +"\n"+"\n"+"\n" + alert4);
         builder1.setCancelable(true);

         builder1.setPositiveButton(
                 "Paham",
                 new DialogInterface.OnClickListener() {
                     public void onClick(DialogInterface dialog, int id) {
                         startActivity(new Intent(Tutor4.this,MainActivity.class));
                     }
                 });
         AlertDialog alert11 = builder1.create();
         alert11.show();


    }

        /*if(v == IVtransisimateri){

        Intent intent = new Intent(this,Materi.class);
        intent.putExtra("Matkul",Matkul);
        startActivity(intent);*/
    }

}
