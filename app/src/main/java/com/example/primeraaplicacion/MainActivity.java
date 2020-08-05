package com.example.primeraaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.correo);
        et2 = (EditText)findViewById(R.id.contrasena);
        tv1 = (TextView)findViewById(R.id.estatus);
    }

    public void estatus(View view){
        String Correo = et1.getText().toString();
        String Contrasena = et2.getText().toString();

        //String Correo = "test@test.com";
        //String Contrasena = "1234";

        String CorreoCorrecto = "test@test.com";
        String ContrasenaCorrecta = "1234";

        //Toast toast1 = Toast.makeText(getApplicationContext(),"Las credenciales son incorrectas.", Toast.LENGTH_SHORT);
        Toast toast1 = Toast.makeText(getApplicationContext(),"C: "+Correo+" P: "+Contrasena+" Tipo: "+Contrasena.getClass().getName(), Toast.LENGTH_SHORT);

        if (Correo.compareTo(CorreoCorrecto)==0 && Contrasena.compareTo(ContrasenaCorrecta)==0) {
            tv1.setText("Estatus: Has iniciado sesión correctamente.");
        } else {
            tv1.setText("Estatus: No has iniciado sesión aún.");
        }
        toast1.show();
    }

}