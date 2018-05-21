package br.com.codemain.teste;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

    private static Context context;

    public static void setView(Context view){
        context = view;
    }

    public static void sendMessage(String address, String message){
        try (Socket socket = new Socket(address, 3000)) {
            socket.getOutputStream().write(message.getBytes());
        //    Toast.makeText( context, "Codigo enviado!", Toast.LENGTH_SHORT);
        } catch (IOException e){
            Log.i("ClientSocket:", e.getMessage());
          //  Toast.makeText( context, e.getMessage(), Toast.LENGTH_SHORT);

        }

    }
}
