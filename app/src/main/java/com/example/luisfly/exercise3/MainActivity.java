package com.example.luisfly.exercise3;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_1 = (Button) findViewById(R.id.button_1);

        /* 3.2.6 dialog */
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* create dialog in this activity, the argument is where you want to create */
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                /* the title in the dialog */
                dialog.setTitle("Warning");
                /* the message in the dialog */
                dialog.setMessage("something important.");
                dialog.setCancelable(false);
                /* set listener in the postive button, */
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                /* set listener in the negative button */
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                /* show the dialog */
                dialog.show();
            }
        });
    }
}
