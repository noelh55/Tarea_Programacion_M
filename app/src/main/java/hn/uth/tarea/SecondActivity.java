package hn.uth.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        resultTextView = findViewById(R.id.resultTextView);

        // Obtener el resultado del Intent
        Intent intent = getIntent();
        double resultado = intent.getDoubleExtra("resultado", 0.0);

        // Mostrar el resultado en el TextView
        resultTextView.setText("Resultado: " + resultado);
    }
}