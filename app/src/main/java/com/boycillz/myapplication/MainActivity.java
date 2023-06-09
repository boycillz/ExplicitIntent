package com.boycillz.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveActivityWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveActivityWithData.setOnClickListener(this);

        Button btnMoveActivityWithObject = findViewById(R.id.btn_move_activity_object);
        btnMoveActivityWithObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_move_activity){
        Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
        startActivity(moveIntent);

    }
        else if (v.getId() == R.id.btn_move_activity_data) {
            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithActivityData.class);
            moveWithDataIntent.putExtra(MoveWithActivityData.EXTRA_NAME, "Boycillz");
            moveWithDataIntent.putExtra(MoveWithActivityData.EXTRA_AGE, 17);
            startActivity(moveWithDataIntent);
        }
        else if (v.getId() == R.id.btn_move_activity_object) {
            Person person = new Person();
            person.setAge(17);
            person.setCity("Bandung");
            person.setEmail("azis@gmail.com");
            person.setName("Ihsan");

            Intent moveWithDataObject = new Intent(MainActivity.this, MoveWithObjectActivity.class);
            moveWithDataObject.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);
            startActivity(moveWithDataObject);
        }
    }
}
