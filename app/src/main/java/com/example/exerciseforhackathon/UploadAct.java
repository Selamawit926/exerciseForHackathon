package com.example.exerciseforhackathon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class UploadAct extends AppCompatActivity {

    EditText contact;
    CheckBox checkBox, checkBox2, checkBox3,checkBox4;
    Button done;
    SponsorFrag sponsor;
    StudentFrag student;
    String contactInfo;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contact= findViewById(R.id.contact);
        checkBox= findViewById(R.id.checkBox);
        done= findViewById(R.id.btnDone);




        fragmentManager= this.getSupportFragmentManager();
        sponsor= (SponsorFrag) fragmentManager.findFragmentById(R.id.SponsorFrag);
        student= (StudentFrag) fragmentManager.findFragmentById(R.id.StudentFrag);

        if(1>2){ //if fetched data is sponsor
            fragmentManager.beginTransaction()
                    .hide(student)
                    .show(sponsor)
                    .commit();
        }
        else{ // if fetched data is student
            fragmentManager.beginTransaction()
                    .hide(sponsor)
                    .show(student)
                    .commit();
        }


        if(checkBox.isChecked() == true){
            Toast.makeText(UploadAct.this, "Volunteer!", Toast.LENGTH_SHORT).show();
            // send true value to the file
        }

        contactInfo= contact.getText().toString(); //to be sent to the database


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(contactInfo.isEmpty()){
                    Toast.makeText(UploadAct.this, "Please enter all fields!", Toast.LENGTH_SHORT).show();
                }


            }
        });







    }
}
