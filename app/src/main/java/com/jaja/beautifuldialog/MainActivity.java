package com.jaja.beautifuldialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


/**
 * Created by Maxim Dybarsky | maxim.dybarskyy@gmail.com
 * on 13.01.15 at 14:32
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(android.R.id.button1).setOnClickListener(this);
        findViewById(android.R.id.button2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case android.R.id.button1:
                new SpotsDialog(this).show();
                break;
            case android.R.id.button2:
                new SpotsDialog(this, R.style.Custom).show();
                break;
        }
    }
}
