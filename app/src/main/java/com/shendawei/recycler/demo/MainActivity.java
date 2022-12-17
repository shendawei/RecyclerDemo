package com.shendawei.recycler.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.shendawei.recycler.demo.ui.activity.SingleRvActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.single_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int vId = v.getId();
        if (vId == R.id.single_btn) {
            startSinglePage();
        }
    }

    private void startSinglePage() {
        Intent intent = new Intent(this, SingleRvActivity.class);
        startActivity(intent);
    }
}