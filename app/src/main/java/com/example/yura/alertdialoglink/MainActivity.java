package com.example.yura.alertdialoglink;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AlertDialog aboutDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SpannableString webaddress = new SpannableString(
                "http://developer.alexanderklimov.ru/android/");
        Linkify.addLinks(webaddress, Linkify.ALL);

        aboutDialog = new AlertDialog.Builder(
                MainActivity.this, R.style.AppCompatAlertDialogStyle).setMessage(webaddress)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                }).create();
        aboutDialog.getWindow().setBackgroundDrawableResource(R.color.greenColor);

//            aboutDialog.setB
//                setBackgroundColor(R.color.greenColor);

    }

    public void Click(View view) {
        aboutDialog.show();

        ((TextView) aboutDialog.findViewById(android.R.id.message))
                .setMovementMethod(LinkMovementMethod.getInstance());

    }

}
