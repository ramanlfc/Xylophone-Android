package com.example.raman.xylophone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button note1Button;
    private Button note2Button;
    private Button note3Button;
    private Button note4Button;
    private Button note5Button;
    private Button note6Button;
    private Button note7Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireUpUIElements();
    }

    private void wireUpUIElements() {
        note1Button = findViewById(R.id.note1Button);
        note2Button = findViewById(R.id.note2Button);
        note3Button = findViewById(R.id.note3Button);
        note4Button = findViewById(R.id.note4Button);
        note5Button = findViewById(R.id.note5Button);
        note6Button = findViewById(R.id.note6Button);
        note7Button = findViewById(R.id.note7Button);
    }

    public void playNote(View view) {

    }
}
