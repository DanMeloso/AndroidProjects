package com.danielmeloso.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configurar titulo e mensagem
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem...");

        //configurar o cancelamento
        dialog.setCancelable( false );

        //configurar icone
        dialog.setIcon( android.R.drawable.ic_dialog_info);

        //configurar acoes para botao sim ou nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Sim foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Nao foi pressionado", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.create();
        dialog.show();
    }
}
