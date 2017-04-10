package com.coursera.adrian.tarea6fragments.asincronos;

import android.os.AsyncTask;
import android.util.Log;

import com.coursera.adrian.tarea6fragments.pojo.ElementosEnvioCorreo;
import com.coursera.adrian.tarea6fragments.utilities.GMailSender;

/**
 * Created by Adrian on 10/04/2017.
 */

public class EnviarCorreoAsyncTask extends AsyncTask<ElementosEnvioCorreo, Void, Boolean> {
    @Override
    protected Boolean doInBackground(ElementosEnvioCorreo... params) {
        try {
            GMailSender sender = new GMailSender("pharsatpruebas@gmail.com", "megustalainteligencia");
            sender.sendMail("PuppyShop Comentario",
                    "El señor: " + params[0].getNombre() + " te informa que '" + params[0].getMensaje() + "' responder al correo: " + params[0].getCorreo(),
                    "pharsat@gmail.com",
                    "pharsat@gmail.com");
            return true;
        } catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
            return false;
        }
    }
}
