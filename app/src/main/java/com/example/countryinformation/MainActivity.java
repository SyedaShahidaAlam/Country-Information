package com.example.countryinformation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshbtn, indiabtn, pakistanbtn, nepalbtn, bhutanbtn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bangladeshbtn = findViewById(R.id.bngbtnId);
        indiabtn = findViewById(R.id.indbtnId);
        pakistanbtn = findViewById(R.id.pakbtnId);
        nepalbtn = findViewById(R.id.nepbtnId);
        bhutanbtn = findViewById(R.id.bhubtnId);

        bangladeshbtn.setOnClickListener(this);
        indiabtn.setOnClickListener(this);
        pakistanbtn.setOnClickListener(this);
        nepalbtn.setOnClickListener(this);
        bhutanbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        LayoutInflater inflater = getLayoutInflater();
        View customView = inflater.inflate(R.layout.custom_toast, findViewById(R.id.customtoastId));

        ImageView toastImage = customView.findViewById(R.id.toastImage);
        TextView toastText = customView.findViewById(R.id.toastText);

        Toast toast = new Toast(MainActivity.this);

        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(customView);
        toast.show();

        if (v.getId() == R.id.bngbtnId) {
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", "Bangladesh");
            toastImage.setImageResource(R.drawable.bangladesh);
            toastText.setText("Bangladesh Selected!");
            startActivity(intent);

        }

        if (v.getId() == R.id.indbtnId) {
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", "India");
            toastImage.setImageResource(R.drawable.india);
            toastText.setText("India Selected!");
            startActivity(intent);
        }

        if (v.getId() == R.id.pakbtnId) {
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", "Pakistan");
            toastImage.setImageResource(R.drawable.pakistan);
            toastText.setText("Pakistan Selected!");
            startActivity(intent);
        }

        if (v.getId() == R.id.nepbtnId) {
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", "Nepal");
            toastImage.setImageResource(R.drawable.nepal);
            toastText.setText("Nepal Selected!");
            startActivity(intent);
        }

        if (v.getId() == R.id.bhubtnId) {
            intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("name", "Bhutan");
            toastImage.setImageResource(R.drawable.bhutan);
            toastText.setText("Bhutan Selected!");
            startActivity(intent);
        }
    }
}


