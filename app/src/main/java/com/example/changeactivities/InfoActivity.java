package com.example.changeactivities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

// inheritance from AppCompatActivity
public class InfoActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnDisplay, btnReturn;
    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle SavedInstanceState){
        // super is used to call the parent class AppCompatActivity
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_info);
        initialize();
    }

    // function to initialize buttons and editText
    private void initialize(){
        btnDisplay = findViewById(R.id.btnDisplay);
        btnReturn = findViewById(R.id.btnReturn);
        //Activate the listener for the buttons

        //using this to replace the object
        btnDisplay.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        editTextAge = findViewById((R.id.editTextAge));
        editTextName = findViewById(R.id.editTextName);

    }

    //view is every component
    public void onClick(View view){
        switch(view.getId()){
            // if the button Display is clicked
            case R.id.btnDisplay:{
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();
                //Log is used to display text without creating variable
                Log.d("DISPLAY", "name" + name);
                //Log.v() use when you want to load all the logs of the app/ show everything
                //Log.i() use to post useful information about the system. When the connections with the server is successful
                //Log.w() when you suspect there is something wrong with your app
                //Log.e() for emergency, always use inside of catch statement
                String info = "Name: " + name + ", Age: " + age;
                Toast.makeText(this, info, Toast.LENGTH_LONG).show();
                break;
            }

            case R.id.btnReturn:{
                // finish is a function to dismiss
                finish();
                break;
            }

        }
    }
}