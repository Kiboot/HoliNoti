package eyana.uic.edu.ph.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.add_btn);

        int day =   Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int month = Calendar.getInstance().get(Calendar.MONTH);


        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View arg0) {

        // Start NewActivity.class
        Intent myIntent = new Intent(MainActivity.this, createholiday.class);
        //Intent myIntent = new Intent("eyana.uic.edu.ph.myapplication.createholiday");
        startActivity(myIntent);
    }
}
