package hn.uth.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText, num2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.txtNum1);
        num2EditText = findViewById(R.id.txtNum2);

        findViewById(R.id.btnsuma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1EditText.getText().toString().isEmpty() || num2EditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Realizar la suma aquí y mostrar el resultado en un TextView o similar
                    // Realizar la suma
                    double num1 = Double.parseDouble(num1EditText.getText().toString());
                    double num2 = Double.parseDouble(num2EditText.getText().toString());
                    double resultado = num1 + num2;

                    // Enviar el resultado a la segunda actividad
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        findViewById(R.id.btnresta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1EditText.getText().toString().isEmpty() || num2EditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Realizar la resta aquí y mostrar el resultado en un TextView o similar
                    // Realizar la resta
                    double num1 = Double.parseDouble(num1EditText.getText().toString());
                    double num2 = Double.parseDouble(num2EditText.getText().toString());
                    double resultado = num1 - num2;

                    // Enviar el resultado a la segunda actividad
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        findViewById(R.id.btndivicion).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1EditText.getText().toString().isEmpty() || num2EditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Realizar la divicion aquí y mostrar el resultado en un TextView o similar
                    // Realizar la divicion
                    double num1 = Double.parseDouble(num1EditText.getText().toString());
                    double num2 = Double.parseDouble(num2EditText.getText().toString());
                    double resultado = num1 / num2;

                    // Enviar el resultado a la segunda actividad
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });

        findViewById(R.id.btnmult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1EditText.getText().toString().isEmpty() || num2EditText.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Completa ambos campos", Toast.LENGTH_SHORT).show();
                } else {
                    // Realizar la multiplicacion aquí y mostrar el resultado en un TextView o similar
                    // Realizar la multiplicacion
                    double num1 = Double.parseDouble(num1EditText.getText().toString());
                    double num2 = Double.parseDouble(num2EditText.getText().toString());
                    double resultado = num1 * num2;

                    // Enviar el resultado a la segunda actividad
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("resultado", resultado);
                    startActivity(intent);
                }
            }
        });
    }
}