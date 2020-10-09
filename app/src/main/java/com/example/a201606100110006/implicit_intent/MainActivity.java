package com.example.a201606100110006.implicit_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1=null;
    Button btn_Call=null,btn_Dial=null,btn_Contact=null,btn_CallLog=null,btn_browser=null,btn_gallary=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=(EditText)findViewById(R.id.ed_data);

        btn_Call=(Button)findViewById(R.id.btn_call);
        btn_Dial=(Button)findViewById(R.id.btn_Dialpad);
        btn_Contact=(Button)findViewById(R.id.btn_contact);
        btn_CallLog=(Button)findViewById(R.id.btn_CallLog);
        btn_browser=(Button)findViewById(R.id.btn_Browser);
        btn_gallary=(Button)findViewById(R.id.btn_gallary);

        btn_Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:123"));
                startActivity(i);
            }
        });

        btn_Dial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:123"));
                //i.setData(Uri.parse("tel:"+ ed1.getText().toString()));
                startActivity(i);
            }
        });

        btn_Contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));
               // i.setData(Uri.parse("content://contacts/people/1"));
                startActivity(i);
            }
        });

        btn_CallLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://call_log/calls/"));
                //i.setData(Uri.parse("content://call_log/calls/1"));
                startActivity(i);
            }
        });
        btn_browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https:///www.google.co.in/"));
                startActivity(i);
            }
        });
        btn_gallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://media/externel/images/media"));
                startActivity(i);
            }
        });


    }
}
