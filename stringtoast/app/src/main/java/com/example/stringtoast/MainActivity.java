package com.example.stringtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= (EditText) findViewById(R.id.editText);
        button =(Button) findViewById(R.id.button);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String name= editText.getText().toString();
               if(name.length()!=0)
               {
                   Toast.makeText(getApplicationContext(),"entered",Toast.LENGTH_LONG).show();
               }
               else
               {
                   Toast.makeText(getApplicationContext(),"not entered",Toast.LENGTH_LONG).show();
               }
           }
       });
    }
}