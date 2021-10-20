package com.btsinfo.des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rgFace;
    private RadioButton rbFace;
    private Button btLancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgFace = (RadioGroup) findViewById(R.id.rgFace);
        btLancer = (Button) findViewById(R.id.btLancer);

        btLancer.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(rbFace.getText().length() == 0))
                    result();
                else
                    Toast.makeText(getApplicationContext(), "Veuillez cocher les cases correspondantes à votre requête",Toast.LENGTH_SHORT).show();
            }
        }));
    }
    public void selectionFace(View view){
        int radioId= rgFace.getCheckedRadioButtonId();
        rbFace = (RadioButton) findViewById(radioId);
    }
    public void  result(){
        Intent intent = new Intent(this,Activity_result.class);
        intent.putExtra("face",rbFace.getText().toString());
        startActivity(intent);
    }
}