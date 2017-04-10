package com.coursera.adrian.tarea6fragments;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.coursera.adrian.tarea6fragments.asincronos.EnviarCorreoAsyncTask;
import com.coursera.adrian.tarea6fragments.pojo.ElementosEnvioCorreo;

/**
 * Created by Adrian on 07/04/2017.
 */

public class Datos extends AppCompatActivity implements View.OnClickListener{

    private TextInputEditText nombre;
    private TextInputEditText correo;
    private TextInputEditText mensaje;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datoscorreo);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(miActionBar);

        getSupportActionBar().setTitle(R.string.titulo_actionbar);
        getSupportActionBar().setIcon(R.drawable.huella);



        nombre = (TextInputEditText) findViewById(R.id.etNombre);
        correo = (TextInputEditText) findViewById(R.id.etCorreo);
        mensaje = (TextInputEditText) findViewById(R.id.etMensaje);
        enviar = (Button) findViewById(R.id.btEnviar);

        enviar.setOnClickListener(this);
    }

    public void btnEnviarContacto_Clic(View view) {
        try {
            ElementosEnvioCorreo elementos = new ElementosEnvioCorreo(correo.getText().toString(),
                    mensaje.getText().toString(),
                    nombre.getText().toString());
            EnviarCorreoAsyncTask tareaEnviarCorreo = new EnviarCorreoAsyncTask();
            Boolean resultado = tareaEnviarCorreo.execute(elementos).get();
            if (resultado) {
                Toast.makeText(getApplicationContext(), "Envio Exitoso", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(getApplicationContext(), "Envio Fracaso", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
