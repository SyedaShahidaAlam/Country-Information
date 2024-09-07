package com.example.countryinformation;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private ImageView imageView;
    private TextView basicInfoTextView, placeInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.imgId);
        basicInfoTextView = findViewById(R.id.basicinfotxtId);
        placeInfoTextView = findViewById(R.id.placeinfotxtId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }

    void showDetails(String countryName)
    {
        if (countryName.equals("Bangladesh")) {
            basicInfoTextView.setText(R.string.info_bd);
            imageView.setImageResource(R.drawable.coxsbazar);
            placeInfoTextView.setText(R.string.bng_description);
        }

        else if (countryName.equals("India")) {
            basicInfoTextView.setText(R.string.info_ind);
            imageView.setImageResource(R.drawable.tazmahal);
            placeInfoTextView.setText(R.string.ind_description);
        }

        else if (countryName.equals("Pakistan")) {
            basicInfoTextView.setText(R.string.info_pak);
            imageView.setImageResource(R.drawable.lahorefort);
            placeInfoTextView.setText(R.string.pak_description);
        }

        else if (countryName.equals("Nepal")) {
            basicInfoTextView.setText(R.string.info_nep);
            imageView.setImageResource(R.drawable.mountaverest);
            placeInfoTextView.setText(R.string.nep_description);
        }

        else if (countryName.equals("Bhutan")) {
            basicInfoTextView.setText(R.string.info_bhu);
            imageView.setImageResource(R.drawable.punakhadzong);
            placeInfoTextView.setText(R.string.bhu_description);
        }


    }
}



