package hn.uth.tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PantallaPrincipal extends AppCompatActivity {

    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        btnIngresar = (Button)findViewById(R.id.btnIngresar);

        /*Creacion de los listener de los botones */

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcreate = new Intent(getApplicationContext(), MainActivity.class);
                intentcreate.putExtra("Numero1", 10);
                intentcreate.putExtra("Numero2", 40);
                startActivity(intentcreate);
            }
        });
    }
}