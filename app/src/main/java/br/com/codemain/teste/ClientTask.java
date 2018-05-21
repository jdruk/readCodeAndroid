package br.com.codemain.teste;

import android.os.AsyncTask;

import java.net.Socket;

public class ClientTask extends AsyncTask<String, String, String> {
    @Override
    protected String doInBackground(String... strings) {
        ClientSocket.sendMessage(strings[0], strings[1]);
        return "Sended messege";
    }


}
