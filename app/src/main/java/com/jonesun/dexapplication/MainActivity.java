package com.jonesun.dexapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jonesun.library.TestInterface;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);

        TestInterface testPlugin = PluginManager.getInstance().createTestPluginInstance();
        textView.setText(testPlugin.getDateFromTimeStamp("yyyy-MM-dd", System.currentTimeMillis()));
    }
}
